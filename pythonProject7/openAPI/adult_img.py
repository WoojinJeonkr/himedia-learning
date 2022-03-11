import sys
import argparse
from tkinter import messagebox

import requests
from PIL import Image, ImageDraw, ImageFont
from io import BytesIO

API_URL = 'https://dapi.kakao.com/v2/vision/adult/detect'
MYAPP_KEY = '28431a0d15ca2e8f516c820b8d8082cf'

def detect_adult(image_url):
    headers = {'Authorization': 'KakaoAK {}'.format(MYAPP_KEY)}

    try:
        data = { 'image_url' : image_url}
        resp = requests.post(API_URL, headers=headers, data=data)
        resp.raise_for_status()
        result = resp.json()['result']
        if result['adult'] > result['normal'] and result['adult'] > result['soft']:
            messagebox.showinfo('결과', "성인 이미지일 확률이 {}% 입니다.".format(float(result['adult'])*100))

        elif result['soft'] > result['normal'] and result['soft'] > result['adult']:
            messagebox.showinfo('결과', "노출이 포함된 이미지일 확률이 {}% 입니다.".format(float(result['soft'])*100))

        else :
            messagebox.showinfo('결과', "일반적인 이미지일 확률이 {}% 입니다.".format(float(result['normal'])*100))

    except Exception as e:
        print(str(e))
        sys.exit(0)

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Classify adult image.')
    parser.add_argument('image_url', type=str, nargs='?',
        default="http://t1.daumcdn.net/alvolo/_vision/openapi/r2/images/10.jpg",
        help='image url to classify')

    args = parser.parse_args()

    detect_adult(args.image_url)