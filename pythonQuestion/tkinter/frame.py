from tkinter import *

w = Tk()
w.title("Frame에 대해 알아봅시다")
w.geometry("700x400+200+200") # w의 크기 설정
w.resizable(False, False) # 창 크기 조절 불가

frame1 = Frame(w, relief="solid", bd=2) # frame1 생성, relief: 프레임의 테두리 모양
frame1.pack(side='left', fill='both', expand=True)

frame2 = Frame(w, relief="solid", bd=2)
frame2.pack(side='right', fill='both', expand=True)

b1 = Button(frame1, text='창 1') # 버튼 b1 생성
b1.pack(expand=True)

b2 = Button(frame2, text='창 2') # 버튼 b2 생성
b2.pack(expand=True)

w.mainloop()
