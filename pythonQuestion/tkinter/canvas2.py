# 버튼을 누르면 색이 바뀌도록 설정
from tkinter import *

mycolor = "white"
def paint(event):
    x1, y1 = (event.x-3),(event.y-3)
    x2, y2 = (event.x+3),(event.y+3)
    canvas.create_oval(x1,y1,x2,y2,fill=mycolor) # (x1, y1)에서 (x2, y2)의 크기를 갖는 원 생성, mycolor로 원을 채움

def ch_color():
    global mycolor # 전역변수 mycolor
    mycolor = "red" # mycolor : 빨간색

def ch_color2():
    global mycolor # 전역변수 mycolor
    mycolor = "green" # mycolor : 초록색

def ch_color3():
    global mycolor # 전역변수 mycolor
    mycolor = "yellow" # mycolor : 노랑색

window = Tk()
canvas = Canvas(window)
canvas.pack()
canvas.bind("<B1-Motion>", paint)

button1 = Button(window, text="red", command=ch_color) # red라는 버튼을 누르면 ch_color 함수 실행
button2 = Button(window, text="green", command=ch_color2) # green라는 버튼을 누르면 ch_color2 함수 실행
button3 = Button(window, text="yellow", command=ch_color3) # yellow라는 버튼을 누르면 ch_color3 함수 실행

button1.pack()
button2.pack()
button3.pack()

window.mainloop()