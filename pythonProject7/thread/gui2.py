import random
import turtle

def click(x, y):  # 클릭을 하면
    print(x, y)   # 클릭한 곳의 x, y 좌표를 출력
    x2 = random.randint(-400,400) # -400 ~ 400 내의 랜덤한 값
    y2 = random.randint(-400,400) # -400 ~ 400 내의 랜덤한 값
    pen_size = random.randint(1, 30) # 1 ~ 30 내의 랜덤한 값
    my_Turtle.pensize(pen_size)  # 펜의 굵기를 pen_size만큼
    color_list = ['green','blue','red','yellow','violet','pink','purple','silver','gold']
    # color_choice = color_list[random.randint(0, 8)] # 인덱스를 랜덤하게 발생시켜 사용
    color_choice = random.choice(color_list) # color_list에서 랜덤하게 선택
    my_Turtle.pencolor(color_choice)  # 펜의 색깔을 color_choice 값으로
    # my_Turtle.penup() # penup() : 펜 이동만!, 펜 이동 시 라인을 그리지 않음
    # my_Turtle.goto(200,200) # x = 200, y = 200으로 이동
    # my_Turtle.goto(x, y) # 선택한 x, y로 이동
    # my_Turtle.pendown() # pendown(): 펜 이동 시 라인을 그림
    # >> 계속 pendown()만 사용한다면 pendown()을 입력하지 않아도 라인이 그려진다.
    # my_Turtle.goto(100, 100)  # x = 100, y = 100으로 이동
    my_Turtle.goto(x2, y2) # 랜덤한 좌표에서의 직선이 그려짐


my_Turtle=turtle.Turtle('turtle')
# class Turtle:
#   def __init__(self):
#       거북이 화면 가운데에 보이게 해주는 처리
turtle.title('거북이로 객체지향 사각형 그리기')
# turtle.onscreenclick(function, btn, add)
turtle.onscreenclick(click, 1) # 캔버스의 마우스 클릭 이벤트에 click이라는 함수를 바인딩
# my_Turtle.pensize(20) # 펜의 굵기를 20으로
# my_Turtle.pencolor('red') # 펜의 색깔을 빨간색으로
turtle.done() # 일시정지