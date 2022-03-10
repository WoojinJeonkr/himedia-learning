from tkinter import *

w = Tk()
# 라벨 4개
img = PhotoImage(file='car.png')
top = Label(w,image=img)
top.pack(padx=30)

day = Label(w, text="날짜 입력", font=('돋음', 20), fg='blue')
title = Label(w, text="제목 입력", font=('돋음', 20), fg='blue')
content = Label(w, text="내용 입력", font=('돋음', 20), fg='blue')

# 입력 3개
day_input = Entry(w, font=('돋음', 30), bg='yellow', border=2, fg='white', borderwidth=3, relief='raised')
title_input = Entry(w, font=('돋음', 30), bg='yellow', border=2, fg='white', borderwidth=3, relief='raised')
content_input = Entry(w, font=('돋음', 30), bg='yellow', border=2, fg='white', borderwidth=3, relief='raised')

# 버튼 2개
save = Button(w, text="db로 저장", bg='white', width=40, height=2, borderwidth=3, relief='raised')
read = Button(w, text="db로 읽기", bg='white', width=40, height=2, borderwidth=3, relief='raised')

day.pack()
day_input.pack()
title.pack()
title_input.pack()
content.pack()
content_input.pack()
save.pack()
read.pack()

w.mainloop()
