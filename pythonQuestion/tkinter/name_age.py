from tkinter import *

window = Tk()

label = Label(window, text = '이름 ').grid(row=0)
label2 = Label(window, text = '나이 ').grid(row=1)

e1 = Entry(window)
e2 = Entry(window)

e1.grid(row = 0, column = 1)
e2.grid(row = 1, column = 1)

def show():
    print('이름: ',e1.get())
    print('나이: ',e2.get())

b1 = Button(window, text='종료', command = window.quit)
b1.grid(row=3, column=0, sticky= 'w', paddy = 4)
b2 = Button(window, text='입력 데이터 확인', command = show)
b2.grid(row=3, column=0, sticky= 'w', paddy = 4)

window.mainloop()


