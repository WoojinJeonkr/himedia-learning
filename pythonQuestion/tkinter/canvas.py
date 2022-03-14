# 캔버트 위젯
# 마우스를 움직여서 화면에 그림을 그리는 프로그램 작성
from tkinter import *

def paint(event):
    x1, y1 = (event.x-3), (event.y-3)
    x2, y2 = (event.x-3), (event.y+3)
    canvas.create_oval(x1,y1,x2,y2,fill='black') # (x1, y1)에서 (x2, y2)의 크기를 갖는 원 생성, mycolor로 원을 채움

window = Tk()
canvas = Canvas(window)
canvas.pack()
canvas.bind("<B1-Motion>",paint)
window.mainloop()