# 1. 변의 길이를 입력받고, 빈 직삼각형 출력
side = int(input("변의 길이>> "))
for i in range(1, side+1):
    for j in range(1, i+1):
        if j == 1 or i == j or i == side :
            print('*', end=' ')
        else:
            print(' ', end=' ')
    print()

# 2. 가로, 세로 길이를 입력받고, 빈 직사각형 출력
width = int(input("가로>> "))
height = int(input("세로>> "))
for i in range(width):
    for j in range(height):
        if (i == 0 or i == width-1) or (j == 0 or j == height-1):
            print("*", end=' ')
        else:
            print(' ', end=' ')
    print()

# 3. list_a = ['a', 'b', 'c', 'd']
#    for idx, val in enumerate(list_a, start = 1):
#    print(idx, '번째의 원소는', val, '입니다.')
#    를 실행해보고 enumerate의 기능을 설명해주세요

# 실행 결과
# 1 번째의 원소는 a 입니다.
# 2 번째의 원소는 b 입니다.
# 3 번째의 원소는 c 입니다.
# 4 번째의 원소는 d 입니다.

# 4. 두 수를 입력받아, 작은 수에서 큰 수까지 3의 배수를 순서대로 출력하는 프로그램을 작성해보세요.
a = int(input('첫번째 수>> '))
b = int(input('두번째 수>> '))
for i in range(a,b+1):
    if i%3 == 0:
        print(i)

# 5. 두 정수 left와 right가 매개변수로 주어집니다.
#    left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
#    약수의 개수가 홀수인 수는 뺀 수를 프린트해주세요
#     ex) left: 13, right: 17일때
#     수    약수     약수의 개수
#     13   1, 13  2
#     14   1,2,7,14   4
#     15   1,3,5,15   4
#     16   1,2,4,8,16 5
#     17   1,17   2
#     13+14+15-16+17=43
#     43을 프린트

def solution(left, right):
    answer = 0
    for i in range(left, right+1):
        count = 0
        for j in range(1, i+1):
            if i % j == 0:
                count += 1
        if count % 2 == 0:
            answer += i
        else:
            answer -= i
    return answer
print(solution(13, 17))

# 6. for문을 이용하여 피보나치 수열 10번째까지 구하는 프로그램을 작성해주세요
fibo = []
for i in range(10):
    if i == 0:
        fibo.append(i+1)
    elif i == 1:
        fibo.append(fibo[i-1])
    else:
        fibo.append(fibo[i-1]+fibo[i-2])
print(fibo)

# 7. 어떤 조건일 경우에 while 문과 for문을 사용하고 프로그램의 실행 부분에서의
#    while문과 for문의 차이에 대해 설명해주세요.

# 반복 횟수를 알고 있는 경우 for문을 사용하고 반복 횟수를 모르는 경우 while문을 사용한다.
# while문은 특정한 조건이 만족할 때까지 반복적으로 실행되는데 반하여,
# for문은 정해진 범위만큼 실행이 된다

#8. 조건부 표현식을 사용하는 이유와 다음 두 코드의 결과 값이 다른 이유를 설명해주세요.

    # 코드 1
    x = y = 40
    z = 1 + x if x > y else y + 2
    print(z)

    # 코드 2
    x = y = 40
    z = 1 + (x if x > y else y) + 2
    print(z)

# 조건부 표현식을 사용하면 가독성을 유지하면서 좀 더 간결한 코드로 작성할 수 있다.
# 코드 1은 1+x or y+2에 대해 조건 x > y를 만족하거나 만족하지 않는 경우 실행되는 데에 반하여
# 코드 2는 조건 x > y가 만족하면 x가, 만족하지 않으면 y가 출력되고 출력된 값에 최종적으로
# 3이 더해져서 결과값으로 출력된다.

# 9. 다음 코드의 결과 값을 서술하세요.

# 코드 1
lol = [[1,2,3], [4,5], [6,7,8,9]]
print(lol[0])
print(lol[2][1])

for sub in lol:
    for item in sub:
        print(item, end=' ')
    print()

# A: [1,2,3]
#    7
#    1 2 3
#    4 5
#    6 7 8 9

# 코드 2
class arr:
    a = ["Seoul", "Kyeongg", "Incheon", "Daejeon", "Deagu", "Pusan"]
str01=' '
for i in arr.a:
    str01 = str01 + i[0]
print(str01)

# A: SKIDDP

# 코드 3
a = 100
result = 0
for i in range(1,3):
    result = a >> i
    result = result + 1
print(result)

# A: 26

# 10. while 반복분에서 무한 루프는 무엇이며, 무한 루프를 만들기 위한 방법은 무엇인가?

# 무한 루프란 컴퓨터에서 프로그램이 무한으로 동작하는 것으로 종료 조건이 없거나, 종료 조건과 만날 수 없을 때 발생한다.
# 무한 루프를 만들기 위해서는 while 뒤에 오는 조건문이 구문적으로 참이 되도록하거나 True를 사용하여 무조건 참이 되도록
# 하여 무한 루프로 만들 수 있도록 할 수 있다.

# 11. while문과 if문을 활용하여, 100 이하의 자연수 중
#    8의 배수이지만 12의 배수는 아닌 것을 모두 출력하세요.

num = 0
while num <= 100:
    num += 1 # num = num + 1
    if num % 8 == 0 and num % 12 != 0: # num이 8의 배수이지만 12의 배수가 아닐 경우
        print(num) # num 출력

# 3. 학생들에게 최종 성적을 알려 주는 '학점 계산기'를 만들려고 합니다.
# 이 수업에는 50점 만점의 중간고사와 50점 만점의 기말고사가 있는데요. 두 시험의 점수를 합해서 최종 성적을 내는 방식입니다. 규칙은 다음과 같습니다.
# A: 90점 이상
# B: 80점 이상 90점 미만
# C: 70점 이상 80점 미만
# D: 60점 이상 70점 미만
# F: 60점 미만
# print_grade 함수는 파라미터로 중간고사 점수 midterm_score와 기말고사 점수 final_score를 받고, 최종 성적을 출력합니다.def print_grade(midterm_score, final_score):
# total = midterm_score + final_score
# 코드를 쓰세요.

def check_score(midterm_score, final_score):
    total = midterm_score + final_score
    if total >= 90:
        print("A")
        print(total)
    elif total >= 80:
        print("B")
        print(total)
    elif total >= 70:
        print("C")
        print(total)
    elif total >= 60:
        print("D")
        print(total)
    else:
        print("F")
        print(total)