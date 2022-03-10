from tkinter import *
from tkinter import messagebox
from db.member_dao_class import DAO


def save():
    # 입력한 값을 가지고 오기
    id = id_entry.get()
    pw = pw_entry.get()
    name = name_entry.get()
    tel = tel_entry.get()
    # vo에 넣어줌.(tuple)
    vo = (id,pw,name,tel)
    # dao객체 생성후, 해당 함수 호출
    dao = DAO()
    result = dao.sign_up(vo)
    # return 값이 1이면 성공!, 아니면 실패!
    if result == 1:
        messagebox.showinfo('결과', 'db에 저장 성공')
        id_entry.delete(0, END)
        pw_entry.delete(0, END)
        name_entry.delete(0, END)
        tel_entry.delete(0, END)
    else:
        messagebox.showinfo('결과', 'db에 저장 실패')

def read():
    # id에 입력을 먼저 한 후
    # 버튼을 누르면 해당 id의 정보를 db에서 검색해온다.
    id = id_entry.get()
    dao = DAO()
    row = dao.search(id)
    print('검색 결과>> ',row)
    pw_entry.insert(0, row[1])
    name_entry.insert(0, row[2])
    tel_entry.insert(0, row[3])

window = Tk()
window.geometry('500x900')
icon = PhotoImage(file='sign.png')
top = Label(window, image=icon)
top.pack()

id_label = Label(window, text='아이디 입력')
id_label.pack()
id_entry = Entry(window, font=('성실체',20), bg='yellow', fg='red')
id_entry.pack()
pw_label = Label(window, text='비밀번호 입력')
pw_label.pack()
pw_entry = Entry(window, font=('성실체',20), bg='yellow', fg='red')
pw_entry.pack()
name_label = Label(window, text='이름 입력')
name_label.pack()
name_entry = Entry(window, font=('성실체',20), bg='yellow', fg='red')
name_entry.pack()
tel_label = Label(window, text='전화번호 입력')
tel_label.pack()
tel_entry = Entry(window, font=('성실체',20), bg='yellow', fg='red')
tel_entry.pack()

save = Button(window, width=30,
              bg='white',
              font=('성실체',20),
              text='DB에 저장',
              command=save
              )
save.pack(pady=10)

read = Button(window, width=30,
              bg='white',
              font=('성실체',20),
              text='DB에서 읽기',
              command=read
              )
read.pack()
window.mainloop()