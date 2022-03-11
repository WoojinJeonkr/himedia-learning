import turtle

t = turtle.Pen() # 터틀 펜 생성
# 네모 그리기
# for _ in range(4): # 4번 반복
#     t.right(90) # 오른쪽으로 90도만큼
#     t.forward(300) # 앞으로 300

# 별 모양 그리기
# for _ in range(50):
#     t.right(110)  # 오른쪽으로 110도만큼
#     t.forward(300) # 앞으로 300

# 네모, 별, 원 선택해서 그리기
while True:
    choice = input('선택 1) 네모, 2)별, 3)원>> ') # 그릴 도형이 네모인지, 별인지, 원인지 입력
    if choice == '1': # 선택이 네모라면
        for _ in range(4): # 4번 반복
            t.right(90) # 오른쪽으로 90도
            t.forward(200) # 앞으로 200
    elif choice == '2': # 선택이 별이라면
        for _ in range(50): # 50번 반복
            t.right(110) # 오른쪽으로 110도
            t.forward(300) # 앞으로 300
    else:
        t.circle(100) # 반지름이 100px인 원을 그림
