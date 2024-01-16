import random
<<<<<<< HEAD
import sys
import threading
import time
from tkinter import *
from tkinter import messagebox


class RacingCar:
    # 멤버 변수
    name = '' # 인스턴스 변수
    count = 0 # 클래스 변수
    #초기화 함수
    def __init__(self, name):
        # self: 클래스로 생성한 객체!
        # c1 = RacingCar('appleCar')
        # self == c1
        # c1.name = 'appleCar'
        self.name = name
    # 멤버 함수
    def runCar(self, label, x1, y1):
        while True:
            # 랜덤하게 움직일 값을 생성해서
            # 랜덤 생성한 jump 값을 기존의 x에 더해준다.
            # y축 값은 변하지 않음
            jump = random.randint(1, 20)
            x1 = x1 + jump
            if x1 >= 420:
                RacingCar.count += 1
                messagebox.showinfo('결과>> ',str(RacingCar.count) + '등은 ' + self.name)
                sys.exit(0)
            label.place(x=x1, y=y1)
            time.sleep(0.69)

def run_start():
    # 라벨 객체 만들어서 window에 끼워넣기
    print('call ok!!!')

    # 자동차가 달리는 것처럼 보이는 처리를 스레드로 만들기
=======
import threading
import time
from tkinter import *

class RacingCar:
    #멤버변수
    name = ''

    #초기화함수
    def __init__(self, name):
        #self: 클래스로 생성한 객체!
        #c1 = RacingCar('appleCar')
        #self == c1
        #c1.name = 'appleCar'
        self.name = name
    #멤버함수
    def runCar(self, label, x1, y1):

        while True:
            jump = random.randint(1,10)
            print(jump)
            x1 = x1 + jump
            if x1 >= 400:
                break
            label.place(x = x1 + jump, y = y1)
            time.sleep(0.05)

def run_start():
    # 라벨 객체 만들어서 window에 끼워넣어야 함.
    print('call ok!!')
    ## 자동차가 달리는 것처럼 보이는 처리를 스레드로 만들어야 함.
>>>>>>> 4e6491a16081e0faef58ab5d6ddf40f1a98d23a3
    c1 = RacingCar('appleCar')
    c2 = RacingCar('summerCar')
    c3 = RacingCar('springCar')

    t1 = threading.Thread(target=c1.runCar, args=(car_label1, 10, 100))
    t2 = threading.Thread(target=c2.runCar, args=(car_label2, 10, 150))
    t3 = threading.Thread(target=c3.runCar, args=(car_label3, 10, 200))

    t1.start()
    t2.start()
    t3.start()

if __name__ == '__main__':
    window = Tk()
    window.geometry("500x250")
    window.title('멀티 스레드 자동차 경주')
<<<<<<< HEAD
    b = Button(window, text='멀티 스레드 시작', command=run_start)
    # ipad: 글자와 버튼 사이 여백, pad: 글자와 프레임 사이의 여백
    b.pack(side=TOP, fill= X, ipadx = 10, ipady = 10, padx= 10, pady= 10)

    car_img1 = PhotoImage(file='car1.gif')
    car_img2 = PhotoImage(file='car2.gif')
    car_img3 = PhotoImage(file='car3.gif')

    car_label1 = Label(window, image=car_img1)
    car_label1.place(x = 10, y = 100) # (10, 100)에 위치
    car_label2 = Label(window, image=car_img2)
    car_label2.place(x = 10, y = 150) # (10, 150)에 위치
    car_label3 = Label(window, image=car_img3)
    car_label3.place(x = 10, y = 200) # (10, 200)에 위치
=======
    b = Button(window, text='멀티 스레드 시작',
               command=run_start)
    b.pack(side = TOP, fill = X, ipadx = 10, ipady = 10, padx = 10, pady = 10)
    car1_img = PhotoImage(file='car1.gif')
    car2_img = PhotoImage(file='car2.gif')
    car3_img = PhotoImage(file='car3.gif')
    car_label1 = Label(window, image=car1_img)
    car_label1.place(x = 10, y = 100)
    car_label2 = Label(window, image=car2_img)
    car_label2.place(x = 10, y = 150)
    car_label3 = Label(window, image=car3_img)
    car_label3.place(x = 10, y = 200)
>>>>>>> 4e6491a16081e0faef58ab5d6ddf40f1a98d23a3
    window.mainloop()