# PhotoImage(이미지)
# 위젯들의 공간에 이미지를 설정
from tkinter import * # tkinter에서 모든 함수를 사용
from PIL import ImageTk # PIL에서 ImageTk를 사용

w = Tk()
w.title('이것은 이미지입니다.') # 창의 제목
w.geometry("750x500+100+100") # 창의 크기와 위치: 가로x세로+x좌표+y좌표
w.resizable(True, True) # 윈도우 이름.resizeable(상하, 좌우), True의 경우 조절 가능, False의 경우 조절 불가

image = ImageTk.PhotoImage(file="cat.jpg") # PhotoImage(경로)

label=Label(w, image=image)
label.pack()

w.mainloop()
