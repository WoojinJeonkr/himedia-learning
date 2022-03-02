# 터미널에서 입력
# 1. 숫자 1: 333
#    숫자 2: 222
#    사칙 연산을 수행하고 프린트

n1 = int(input('숫자 1 : '))
n2 = int(input('숫자 2 : '))
print('n1 과 n2의 합은', n1+n2)
print('n1 과 n2의 차는', n1-n2)
print('n1 과 n2의 곱은', n1*n2)
print('n1 과 n2의 나눈 값은', n1/n2)
print('n1 과 n2의 나눈 값은', n1//n2)
print('n1 과 n2의 나머지는', n1%n2)

# 2. 입력 1: 홍길동
#    입력 2: 200
#    출력은 홍길동은 200세입니다.
#    100살보다 나이가 많으면 나이가 많으시군요! 적으면 아직 어리시군요!
name = input('입력 1: ')
age = int(input('입력 2: '))
print(name,'은',age,'세입니다.')
if age > 100:
    print('나이가 많으시군요!')
else:
    print('아직 어리시군요!')

# 3. 변수에 대입
#    hobby = '달리기'
#    time = 10
#    달리기를 10시간 했습니다.
#    오늘 한 운동이 '달리기'이고, 시간이 10시간 이상이면 => 오늘 '달리기'는 충분
#    오늘 한 운동이 '달리기'이거나 시간이 10시간 이하면 => 어떤 운동이든 시작하세요

hobby = input('오늘 한 운동은 ')
time = int(input('시간은 '))
print(hobby,'를',time,'시간 했습니다.')
if hobby == '달리기' and time >= 10:
    print('오늘 ',hobby,'는 충분')
elif hobby == '달리기' or time <= 10:
    print('어떤 운동이든 시작하세요')
else:
    print('다시 입력하세요')