import sys
import argparse
from collections import Counter
from tkinter import messagebox

import requests
from PIL import Image, ImageDraw, ImageFont
from io import BytesIO

API_URL = 'https://dapi.kakao.com/v2/vision/multitag/generate'
MYAPP_key = '28431a0d15ca2e8f516c820b8d8082cf'

def multi_tag(image_url):
    header={'Authorization' : 'KakaoAK %s' % MYAPP_key}
    img_data={'image_url' : image_url}
    # post 방식으로 API_URL을 호출
    response = requests.post(API_URL,
                             headers=header,
                             data=img_data)
    # print(response)

    json_result = response.json()
    # print(json_result)
    result = json_result['result']
    # print(result)
    label_kr = result['label_kr']
    print(label_kr)
    return label_kr # list
    # ['사람', '실외', '해변', '하늘']
    # ['사람', '여러사람', '실외', '해변', '하늘']
    # ['실외', '해변', '하늘']


if __name__ == '__main__':
    img_list = ['https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAxMDdfMjcw%2FMDAxNjQxNTMyODU2ODgw.2RUUVJ7PO6EY7-fbls-BSgYK_JusPg658Me5cIfeHgwg.opKRpI2t_1qk94hEBu52OhQGYYCjEsGIyU38-1cZv8Ig.JPEG.ddldl623%2F20200207%25A3%25DF103829.jpg&type=a340',
                'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAyMTFfODIg%2FMDAxNjQ0NTg5NzQ2NzA2.FTJxdgG7KWmxZ6heLxstKAGdSkl0WYetNCKjYsibJAcg.1J6laNv6T0Y57KSgTvMPSuBT-5h05-Eaf8sPcZ1-AOMg.JPEG.kimsara22%2FIMG_0884.JPG&type=a340',
                'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAzMDRfMTMz%2FMDAxNjQ2NDA0ODQ3OTI5.BVwNx6Lusbw8nC9tfv44c6fedw257b4-jZHGSOM4uhMg.y7YraMd4jHdklOUl0GRGz-Gyg_WsuwFbOi3OAct7bx0g.JPEG.w_bin1210%2FIMG_2843.jpg&type=a340'
                ]
    result_list = []
    for img in img_list:
        label_result = multi_tag(img)
        result_list += label_result

    # from collections import Counter
    count_result = Counter(result_list)
    print(count_result) # Counter({'실외': 3, '해변': 3, '하늘': 3, '사람': 2, '여러사람': 1})
    print(count_result.get('사람')) # '사람'이 몇 번 나왔는지 --> 2
    print(count_result.most_common(1)) # [('실외', 3)]
    print(count_result.most_common(5)) # [('실외', 3), ('해변', 3), ('하늘', 3), ('사람', 2), ('여러사람', 1)]
    order_5 = count_result.most_common(5)
    print(order_5[0]) # ('실외', 3)
    order_1 = order_5[0]
    print('제일 빈도 수가 높은 단어는 ' + order_1[0] + ',' +
          ' 빈도 수는 ' + str(order_1[1])
          ) # 제일 빈도 수가 높은 단어는 실외, 빈도 수는 3

    # 제일 빈도 수가 높은 단어에 따라 여행 장소 추천
    if order_1[0] == '실외':
        tour = '제주도 돌고래 구경'
    elif order_1[0] == '사람':
        tour = '남산 타워'
    else:
        tour = '놀이공원'
    messagebox.showinfo('추천','당신에게 ' + tour + '를 추천합니다.')