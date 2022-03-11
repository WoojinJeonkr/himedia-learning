import sys
import argparse
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
    print(response)

    json_result = response.json()
    print(json_result)
    result = json_result['result']
    print(result)
    label_kr = result['label_kr']
    print(label_kr)


if __name__ == '__main__':
    multi_tag('https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAyMTFfODIg%2FMDAxNjQ0NTg5NzQ2NzA2.FTJxdgG7KWmxZ6heLxstKAGdSkl0WYetNCKjYsibJAcg.1J6laNv6T0Y57KSgTvMPSuBT-5h05-Eaf8sPcZ1-AOMg.JPEG.kimsara22%2FIMG_0884.JPG&type=a340')