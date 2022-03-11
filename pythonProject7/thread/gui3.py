import random
import turtle

# 클릭을 했을 때, 2가지 그림을 그리는 함수 만들기
# 아무거나 둘 선택
# color, size 선택

def rectangle():
    length = random.randint(10, 200)
    pen_size = random.randint(1, 20)  # 1 ~ 30 내의 랜덤한 값
    my_Turtle.pensize(pen_size)  # 펜의 굵기를 pen_size만큼
    color_list = ['green', 'blue', 'red', 'yellow', 'violet', 'pink', 'purple', 'silver', 'gold']
    color_choice = random.choice(color_list)  # color_list에서 랜덤하게 선택
    my_Turtle.pencolor(color_choice)  # 펜의 색깔을 color_choice 값으로
    for _ in range(4):  # 4번 반복
        my_Turtle.right(90)  # 오른쪽으로 90도
        my_Turtle.forward(length)  # 앞으로 200

def star():
    direction = random.randint(10,100)
    pen_size = random.randint(1, 20)  # 1 ~ 30 내의 랜덤한 값
    my_Turtle.pensize(pen_size)  # 펜의 굵기를 pen_size만큼
    color_list = ['green', 'blue', 'red', 'yellow', 'violet', 'pink', 'purple', 'silver', 'gold']
    color_choice = random.choice(color_list)  # color_list에서 랜덤하게 선택
    my_Turtle.pencolor(color_choice)  # 펜의 색깔을 color_choice 값으로
    for _ in range(10):
        my_Turtle.right(110)  # 오른쪽으로 110도
        my_Turtle.forward(direction)  # 앞으로 300

def click(x, y):
    print(x, y)  # 클릭한 곳의 x, y 좌표를 출력
    x = random.randint(-400, 400)  # -400 ~ 400 내의 랜덤한 값
    y = random.randint(-400, 400)  # -400 ~ 400 내의 랜덤한 값

    my_Turtle.penup()
    my_Turtle.goto(x, y) # 선택한 x, y로 이동
    my_Turtle.pendown()

my_Turtle=turtle.Turtle('turtle')
turtle.title('거북이로 객체지향 사각형 그리기')
while True:
    turtle.onkeypress(rectangle, 'r')
    turtle.onkeypress(star,'s')
    turtle.listen()
    turtle.onscreenclick(click, 1)
    turtle.done()