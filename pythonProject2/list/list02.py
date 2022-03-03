# 반복문은 2가지 경우에 사용
# 1) 횟수를 세기 위해서
# 2) 반복하면서 어떤 처리를 하기 위해서

# '환영합니다.' 5번 출력
for _ in range(5): #[0, 1, 2, 3, 4]
    print('환영합니다.')

# 1부터 5까지의 합 구하기(1) - 더해지는 과정도 출력
sum = 0
for n in range(1, 6):
    sum += n
    print(sum)

# 1부터 5까지의 합 구하기(2) - 결과만 출력
sum = 0
for n in range(1, 6):
    sum += n
print(sum)