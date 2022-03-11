import threading
import time
from tkinter import *


class RacingCar:
    # 멤버 변수
    name = ''

    #초기화 함수
    def __init__(self, name):
        # self: 클래스로 생성한 객체!
        # c1 = RacingCar('appleCar')
        # self == c1
        # c1.name = 'appleCar'
        self.name = name
    # 멤버 함수
    def runCar(self):
        for _ in range(10):
            print(self.name + '~달립니다!!')

def run_start():
    # 라벨 객체 만들어서 window에 끼워넣기
    print('call ok!!!')
    # 자동차가 달리는 것처럼 보이는 처리를 스레드로 만들기

if __name__ == '__main__':
    window = Tk()
    window.geometry("500x250")
    window.title('멀티 스레드 자동차 경주')
    b = Button(window, text='멀티 스레드 시작', command=run_start)
    # ipad: 글자와 버튼 사이 여백, pad: 글자와 프레임 사이의 여백
    b.pack(side=TOP, fill= X, ipadx = 10, ipady = 10, padx= 10, pady= 10)
    car1_img = PhotoImage(file='car1.gif')
    car2_img = PhotoImage(file='car2.gif')
    car3_img = PhotoImage(file='car3.gif')
    car_label1 = Label(window, text='appleCar') # window창에
    car_label1.place(x = 10, y = 100) # (10, 100)에 위치
    car_label2 = Label(window, text='summerCar')
    car_label2.place(x = 10, y = 150) # (10, 150)에 위치
    car_label3 = Label(window, text='springCar')
    car_label3.place(x = 10, y = 200) # (10, 200)에 위치
    window.mainloop()