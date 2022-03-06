# 1. 자연수 13이 홀수인지 짝수인지 판별할 수 있는 방법에 대해 말해 보자.
a = 13
if a/2 == 0:
    print('짝수입니다.')
else:
    print('홀수입니다.')

# 2. while문을 사용해 1부터 1000까지의 자연수 중 3의 배수의 합을 구해 보자.
result = 0
i = 1 # i는 자연수
while i <= 1000:
    if i % 3 == 0:
        result += i
    i += 1
print('1부터 1000까지 자연수 중 3의 배수의 합은',result)

# 3. while문을 사용하여 다음과 같이 별(*)을 표시하는 프로그램을 작성해 보자.
# *
# **
# ***
# ****
# *****
j = 0
while True:
    j += 1
    if j > 5:
        break
    print('*' * j)

# 4. for문을 사용해 1부터 100까지의 숫자를 출력해 보자.
for i in range(1,101):
    print(i)

# 5. A 학급에 총 10명의 학생이 있다. 이 학생들의 중간고사 점수는 다음과 같다.
# [70, 60, 55, 75, 95, 90, 80, 80, 85, 100]
# for문을 사용하여 A 학급의 평균 점수를 구해 보자.
A = [70, 60, 55, 75, 95, 90, 80, 80, 85, 100]
total = 0
for score in A:
    total += score
avg_score = total/len(A)
print(avg_score)

# 6. 다음 리스트에서 홀수에만 2를 곱하여 저장해보자
number = [1, 2, 3, 4, 5]
# result2 = []
# for n in number:
#     if n%2 == 1: # n을 2로 나눈 나머지가 1이라면
#         result2.append(n*2)
# print(result2)
result = [n*2 for n in number if n%2 == 1]
print(result)

# 7. age = 20일 때 '20살 이상'이 출력되도록 제어문을 짜보자
age = 20
if age < 20:
    print('20살 미만')
else:
    print('20살 이상')

# 8. 사용자에게 현재 온도를 질문하고 온도가 25도 이상이면 반바지를 추천하고
#    25도 미만이면 긴바지를 추천하는 프로그램을 작성해보자.
temp = int(input('현재 온도는 >> '))
if temp > 25:
    print('반바지를 추천드려요')
else:
    print('긴바지를 추천드려요')


