# thread 3개를 다음과 같이 찍히도록 생성
#
# 1부터 100까지 증가
# 증가>> 1
# 증가>> 2
#
# 100부터 1까지 감소
# 감소>> 100
# 감소>> 99
#
# 특수문자를 프린트(@, #, $, ₩) # text=['@', '#', '$', '₩']
# 특수>@                        random.choice(text)
# 특수>#

import random
import threading

def inc():
    for x in range(1,101):
        print('증가>> ',x)
def dec():
    for y in range(100, 0, -1):
        print('감소>> ',y)
def spec():
    text = ['@', '#', '$', '₩']
    for _ in range(100):
        print('특수>> ',random.choice(text))

threadA = threading.Thread(target=inc)
threadB = threading.Thread(target=dec)
threadC = threading.Thread(target=spec)

threadA.start()
threadB.start()
threadC.start()


