# 화면에 5개의 버튼을 절대 위치를 주어 배치
from tkinter import *

window = Tk()

w = Label(window, text="박스 #1", bg="red", fg="black")
w.place(x=0,y=0) # (0,0)에 박스 #1 위치
w = Label(window, text="박스 #2", bg="green", fg="black")
w.place(x=20,y=20) # (20,20)에 박스 #2 위치
w = Label(window, text="박스 #3", bg="blue", fg="black")
w.place(x=40,y=40) # (40,40)에 박스 #3 위치
w = Label(window, text="박스 #4", bg="black", fg="black")
w.place(x=60,y=60) # (60,60)에 박스 #4 위치
w = Label(window, text="박스 #5", bg="yellow", fg="black")
w.place(x=80,y=80) # (80,80)에 박스 #5 위치

w.mainloop()
