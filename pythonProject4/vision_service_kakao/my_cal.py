# 숫자 2개를 입력받아 간단한 사칙연산을 수행하는 계산기 만들기

from functools import partial
from tkinter import *
from tkinter import messagebox
from object.cal import Cal

cal = Cal()

def result(op):  # '+'
    input1 = float(n1_entry.get())
    input2 = float(n2_entry.get())
    if op == '+':
        cal_result = cal.plus(input1, input2)
        result.config(text=cal_result)
    elif op == '-':
        cal_result2 = cal.minus(input1, input2)
        result.config(text=cal_result2)
    elif op == '*':
        cal_result3 = cal.mul(input1, input2)
        result.config(text=cal_result3)
    elif op == '/':
        cal_result4 = cal.div(input1, input2)
        result.config(text=cal_result4)

def reset():
    n1_entry.delete(0, END)  # entry값 지움.
    n2_entry.delete(0, END)
    result.config(text='')  # 값 텍스트 지움.

if __name__ == '__main__':
    n = Tk()
    n.geometry("350x500")  # Tk의 크기 조절
    # 라벨을 하나 만들어보자.
    n1 = Label(n,
               font=20,
               text='숫자1 입력',
               )
    n1.pack()

    n1_entry = Entry(n,
                     font=20,
                     bg='white',  # 배경색
                     )
    n1_entry.pack()

    n2 = Label(n,  # window의 주소
               font=20,
               text='숫자2 입력'
               )
    n2.pack()

    n2_entry = Entry(n,
                     font=20,
                     bg='white',  # 배경색
                     fg='blue'  # 글꼴색
                     )
    n2_entry.pack()

    n3 = Label(n,
               font=30,
               )
    n3.pack()

    b1 = Button(n,
                text='+',
                font=20,
                bg='yellow',
                width=30,
                # fg = 'black', # default
                command=partial(result, '+')
                )
    b1.pack()

    b2 = Button(n,
                text='-',
                font=20,
                bg='yellow',
                width=30,
                command=partial(result, '-')
                )
    b2.pack()

    b3 = Button(n,
                text='*',
                font=20,
                bg='yellow',
                width=30,
                command=partial(result, '*')
                )
    b3.pack()

    b4 = Button(n,
                text='/',
                font=20,
                bg='yellow',
                width=30,
                command=partial(result, '/')
                )
    b4.pack()

    b5 = Button(n,
                text='reset',
                font=20,
                bg='red',
                fg='white',
                width=30,
                command=reset
                )
    b5.pack()

    n3 = Label(n,
               font=30,
               )
    n3.pack()

    result = Label(n,  # window의 주소
               font=20,
               text='result'
               )
    result.pack()

    n.mainloop()  # Tk를 계속 표시되게 함
