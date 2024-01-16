import threading
import datetime as dt
import time

# 현재 시각을 찍는 스레드 100번
dt.object = dt.datetime
def clock():
    for _ in range(100):
        time.sleep(5) # 시행된 뒤 5초 만큼 쉬고 시행
        print('현재 시각> ',dt.object.now()) # dt.object.now() == datetime.datetime.now()

# 리스트에 있는 먹고 싶은 음식 목록 10개를 찍는 스레드
def food():
    food_list = ['pizza', 'bacon', 'chicken', 'salami',
                 'sausage', 'coconut', 'grape', 'gooseberry',
                 'cod', 'herring']
    for one in food_list:
        time.sleep(10) # 자바에서는 time.sleep(1000)과 같이 millisecond 단위로 사용한다.
        print('먹고 싶은 음식 메뉴는> ',one)

# 1부터 500까지 카운트하는 스레드
def plus():
    for x in range(501):
        time.sleep(1)  # 시행된 뒤 1초 만큼 쉬고 시행
        print('count>> ', x)

clock = threading.Thread(target=clock)
food = threading.Thread(target=food)
plus = threading.Thread(target=plus)

clock.start()
food.start()
plus.start()
