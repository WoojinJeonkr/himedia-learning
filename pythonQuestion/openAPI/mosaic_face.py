# openAPI - 얼굴에 모자이크 처리하기
import sys
import argparse
import requests
from PIL import Image

API_URL = 'https://dapi.kakao.com/v2/vision/face/detect' # 사용하고자 하는 API URL
MY_KEY = '28431a0d15ca2e8f516c820b8d8082cf' # 발급받은 REST API 키

def detect_face(filename): # 얼굴 검출 함수 생성
    headers = {'Authorization': 'KakaoAK {}'.format(MY_KEY)} # MY_KEY를 넣어 권한 부여
    try:
        files = {'image': open(filename, 'rb')}
        resp = requests.post(API_URL, headers=headers, files=files)
        resp.raise_for_status()
        return resp.json()
    except Exception as e:
        print(str(e))
        sys.exit(0)

def mosaic(filename, detection_result): # 찾아낸 얼굴의 사각형 영역에 모자이크 처리 함수
    image = Image.open(filename) # 분석할 이미지 파일 열기

    # 찾아낸 얼굴의 사각형 영역 지정
    for face in detection_result['result']['faces']:
        x = int(face['x']*image.width)
        w = int(face['w']*image.width)
        y = int(face['y']*image.height)
        h = int(face['h']*image.height)
        box = image.crop((x,y,x+w, y+h))
        box = box.resize((20,20), Image.NEAREST).resize((w,h), Image.NEAREST)
        image.paste(box, (x,y,x+w, y+h))

    return image # 처러한 이미지 반환

if __name__ == "__main__":
    parser = argparse.ArgumentParser(description='Mosaic faces.')
    parser.add_argument('image_file', type=str, nargs='?', default="face.jpg",
                        help='image file to hide faces')

    args = parser.parse_args()

    detection_result = detect_face(args.image_file) # 이미지 파일에서 얼굴 찾기
    image = mosaic(args.image_file, detection_result) # 찾아낸 얼굴에 모자이크 처리
    image.show() # 이미지 보여주기