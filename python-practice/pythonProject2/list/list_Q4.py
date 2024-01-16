# 4. target = 55이고 숫자를 입력받아, 이 숫자를 입력받는 게임을 완성
num = int(input('숫자를 입력하세요 > '))
target = 55 # 랜덤한 숫자를 맞추고 싶은 경우: random.randint(1,100)
count = 0
while True:
    count += 1
    # 숫자가 너무 크거나 작은 경우, 힌트를 주시오
    if num > target:
        print('Hint : Down')
        num = int(input('숫자를 입력하세요 > '))
    elif num < target:
        print('Hint : Up')
        num = int(input('숫자를 입력하세요 > '))
    else:
        print('correct!!')
        break
# 몇 회만에 정답을 맞추었는지 프린트
print(count, '번만에 맞추었습니다.')