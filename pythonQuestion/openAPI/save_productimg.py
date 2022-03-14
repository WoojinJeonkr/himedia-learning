import sys
import argparse
import requests
from PIL import Image, ImageDraw, ImageFont
from io import BytesIO
import glob
import os

API_URL = 'https://dapi.kakao.com/v2/vision/product/detect'
MYAPP_KEY = '28431a0d15ca2e8f516c820b8d8082cf'

def detect_product(filename):
    headers = {'Authorization': 'KakaoAK {}'.format(MYAPP_KEY)}
    try:
        files = { 'image' : open(filename, 'rb')}
        resp = requests.post(API_URL, headers=headers, files=files)
        resp.raise_for_status()
        return resp.json()
    except Exception as e:
        print(str(e))
        sys.exit(0)

def show_products(filename, detection_result):
    try:
        image = Image.open(filename)
    except Exception as e:
        print(str(e))
        sys.exit(0)
    draw = ImageDraw.Draw(image)
    for obj in detection_result['result']['objects']:
        x1 = int(obj['x1']*image.width)
        y1 = int(obj['y1']*image.height)
        x2 = int(obj['x2']*image.width)
        y2 = int(obj['y2']*image.height)
        draw.rectangle([(x1,y1), (x2, y2)], fill=None, outline=(255,0,0,255))
        draw.text((x1+5,y1+5), obj['class'], (255,0,0))
    del draw
    return image

if __name__ == "__main__":
    files=glob.glob('image/couple.jpg')
    for i in files:
        head,tail = os.path.split(i)
        detection_result = detect_product(i)
        image = show_products(i, detection_result)
        image.save(head+'/save_'+tail,'JPEG')