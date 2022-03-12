from tkinter import *

# 화씨->섭씨 변환 함수
def Celsius():
    temp = float(e1.get()) # e1에 넣은 값을 temp에 넣어준다
    c_temp = (temp-32)*5/9 # 화씨->섭씨 변경 수학식
    e2.insert(0, str(c_temp)) # c_temp를 문자열로 바꿔서 e2에 넣어준다

# 섭씨->화씨 변환 함수
def Farenheit():
    temp = float(e2.get()) # e2에 넣은 값을 temp에 넣어준다
    f_temp = 9/5*temp+32 # 섭씨->화씨 변경 수학식
    e1.insert(0, str(f_temp)) # f_temp를 문자열로 바꿔서 e1에 넣어준다

window = Tk()

# 라벨 생성
l1 = Label(window, text="화씨")
l2 = Label(window, text="섭씨")
l1.grid(row=0, column=0)
l2.grid(row=1, column=0)

e1 = Entry(window, bg="yellow", fg="red") # 사용자로부터 입력받는 부분 생성
e2 = Entry(window, bg="yellow", fg="blue") # 사용자로부터 입력받는 부분 생성
e1.grid(row=0, column=1)
e2.grid(row=1, column=1)

# button 생성
b1 = Button(window, text="화씨->섭씨", command=Celsius)
b2 = Button(window, text="섭씨->화씨", command=Farenheit)
b1.grid(row=2, column=0)
b2.grid(row=2, column=1)

# 창 계속 실행
window.mainloop()
