from tkinter import *
from tkinter import messagebox

# 버튼 1개당 함수 1개를 연결
def login():
    messagebox.showinfo('제목','나를 클릭!!')
    # 입력값을 가지고 오고, 일치하는지 확인
    id2 = id_entry.get() # id2에 id값을 넣음
    pw2 = pw_entry.get() # pw2에 pw값을 넣음
    print('id는 ',id2, ' pw는 ',pw2)
    if id2 == 'root' and pw2 == '1234': # id2가 root이고 pw2가 1234를 만족하면
        messagebox.showinfo('제목', '로그인 성공!!!')
    else: # 아니면
        messagebox.showinfo('제목', '로그인 실패!!!')

w = Tk()
w.geometry("500x250") # Tk의 크기 조절
# 라벨을 하나 만들어보자.
id = Label(w, # window의 주소
           text = '아이디 입력',
           font = ('궁서', 30) # 라벨 객체는 메모리(RAM)에 만들어진다.
           )
id.pack() # id라는 라벨을 w에 넣어줌.

id_entry = Entry(w,
                 font = ('궁서', 30), # 글꼴
                 bg = 'blue', # 배경색
                 fg='white' # 글꼴색
                 )
id_entry.pack()

pw = Label(w, # window의 주소
           text = '암호 입력',
           font = ('궁서', 30) # 라벨 객체는 메모리(RAM)에 만들어진다.
           )
pw.pack() # pw라는 라벨을 w에 넣어줌.

pw_entry = Entry(w,
                 font = ('궁서', 30), # 글꼴
                 bg = 'blue', # 배경색
                 fg='white' # 글꼴색
                 )
pw_entry.pack() # pw_entry를 w에 넣어줌.

b = Button(w,
           text = '로그인 처리',
           font = ('궁서', 30),
           bg = 'yellow',
           # fg = 'black', # default
           command = login
           )
b.pack() # b를 w에 넣어줌.

w.mainloop() # Tk를 계속 표시되게 함