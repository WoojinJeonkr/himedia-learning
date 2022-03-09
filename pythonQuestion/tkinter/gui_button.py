from tkinter import *

def call(): # call 함수 생성
    b1["text"] = '나를 누르셨군요!'
def call2(): # call2 함수 생성
    b2["text"] = '나도 누르셨군요!!'

window = tkinter.Tk()
b1 = Button(window, text='첫 번째 버튼',command=call)
b2 = Button(window, text='두 번째 버튼',command=call2)
b1.pack(side=LEFT,padx=10)
b2.pack(side=LEFT,padx=10)
b1['text'] = 'ONE'
b2['text'] = 'TWO'

window.mainloop()