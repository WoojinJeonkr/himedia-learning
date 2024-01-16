# 1. local, global, nonlocal 의 차이점을 예시를 들어 설명해주세요

g = 'global 변수입니다'

def test():
    def test2():
        nonlocal g
        a = 'local 변수입니다'
        print(g,a)
    def test3():
        global g
        g = 'global 변수명 바꿔주기!'

    g = 'nonlocal 변수입니다' # 전역변수 g 변경
    test2()
    test3()

if __name__ == '__main__':
    print(g) # 전역변수 g 출력
    test()
    print(g)
    print(a) # a는 지역변수이므로 에러!

# 2. 다음을 입력했을때 알맞은 결과값이 나오도록 함수를 만들어주세요.
# 입력: func1("hi")
# >>
# hi
#
# 입력: func1("hi", 1)
# >>
# hi
# 1
#
# 입력: func1("hi", 1, a=5)
# >>
# hi
# 1
# {'a':5}

def func1(*args, **kwargs):
    for x in args:
        print(x)
    if len(kwargs)>0:
        print(kwargs)

# 3. parameter 와 argument의 차이점은?

# parameter: 함수를 정의할 때 나열하는 변수
# argument: 함수를 호출할 때 parameter에 넘겨주는 실제 값

# 4.
# def one(x):
#   return X*X
# 를 쓰는 것과
# def two(x)
#   print(X*X)
# 의 차이점을 설명하시오

# 둘의 차이점은 함수 및 프로그램에 영향을 주는지의 여부이다
# print는 그저 값을 출력할 뿐, 함수에 영향을 끼치지 않는다
# return은 값을 반환하며, 반환된 값은 다른 함수에서 사용될 수 있고, 변수에 저장될 수도 있다

# 5. 입력값이 없는 함수, 결과값이 없는 함수, 입력값도 결과값도 없는 함수를 각 하나씩 만드시오.

# 입력값이 없는 함수
def noninput():
    return 'input none'

# 결과값이 없는 함수
def add(a,b):
    print("%d, %d의 합은 %d".format(a,b,a+b))

# 입력값도 결과값도 없는 함수
def finish():
    print('stop')

# 6. 파라미터로 정수 값 세 개를 받고, 세 수의 곱을 출력하는 함수를 만들어 보세요.

def mul(a,b,c):
    result = a*b*c
    return print(result)

mul(1,2,3)

# 7. 재귀함수란
# 함수 안에서 자신의 함수를 다시 호출하는 함수를 의미한다.
# 이러한 함수는 자신의 로직을 내부적으로 반복하다가, 일정 조건이 만족되면 함수를 이탈하여 결과를 도출한다.

# 8. 1부터 100까지 출력하는 함수를 재귀적으로 구현
def numberprint(x):
    if x > 100:
        quit()
    else:
        print(x)
        numberprint(x+1)
numberprint(1)

# 9. n번 항까지의 피보나치 수열 출력함수를 재귀적으로 구현
n = int(input('수를 입력하세요 >> '))

def seq(y):
    if y <= 1:
        return y
    else:
        return seq(y-1) + seq(y-2)

for y in range(n):
    print(seq(y+1))

# 9. 다음 코드의 결과를 서술하세요

def A(num):
    return num * 2

def B(num):
    return A(num + 2)

def C(num):
    num = num + 10
    return B(num)

result = C(2)
print(result)

# A: 28

# 10. 세 개의 숫자를 입력받아 가장 큰 수를 출력하는 print_max 함수를 정의하라.
# (if 문을 사용, max 사용), (매개변수, 가변매개변수 이용)

def print_max(a, b, c):
    max = 0
    if a > max:
        max = a
    elif b > max:
        max = b
    else:
        max = c
    print(max)

# 11. 함수 안에서 함수를 호출할 수 있을까? 있다면 다음 코드의 결과값을 서술하라
def findSum(n):
    if n == 1:
        return 1
    else:
        return n+findSum(n-1)
a = 10
print(findSum(a))

# 함수 안에서 함수를 호출할 수 있으며 위의 코드의 정답은 55이다.

# 12. 다음 코드의 결과값은 1이다. 왜 1이 나오는지 설명해보자.
a = 1
def vartest(a):
    a = a + 1
    return a
print(a)

# 함수에서 정의된 계산식은 함수에서만 정의되므로 함수와 상관없이 print(a)의 결과는 1이다.
# 만약 2를 결과값으로 출력하고 싶다면 print(vartest(a))라고 작성해야 한다.

# 13. 매개변수와 인수의 차이는?
# 매개변수는 함수 안에서 호출되어 쓰이는 변수이고, 인수는 함수를 호출할 때 넘겨지는 변수이다.

# 14. 한줄에 결과값을 출력하는 방법을 예시를 들어 설명해보자
with open("foo.txt", "r") as f:
	lines = f.readlines()
for line in lines:
print(line, end=' ')

# 15. 다음 코드의 결과를 작성하고 왜 그렇게 나오는지 서술해보자
def test_func():
    try:
        x = 10
        return x
    except Exception as e:
        x = 20
        return x
    finally:
        x = 30
        return x
print(test_func())

# 결과: 30
# 이유: 매개변수 x 값을 넣지 않아 예외가 발생하지만
# def test_func()에서 예외 처리 시 finally 부분은 반드시 실행되므로 30이 출력된다.

# 16. 다음의 코드는 항상 4를 반환하는 결과를 낳는다.
# 왜 이렇게 되는지 서술하고 이런 점을 방지하기 위한 코드를 작성해보자
li = [ ]
for i in range(5):
    li.append(lambda: i)
for item in li:
    print(item())

# 이유: 각각의 item이 li 정수를 반환하는 함수가 되도록 하려면 내부에 다른 람다를 정의해야 한다.
# li = []
#   for i in range(5):
#     li.append((lambda y: lambda : y)(i))
# for item in li:
#   print(item())
# 만약 li의 정수값을 유지하고 싶다면
# for i in range(5):
#   li.append((lambda y: y)(i))
# for item in li:
#   print(item)
# 위와 같이 작성해도 동일하게 출력된다.

# 17. 민수는 파일을 열기 위해 다음과 같이 코드를 작성하였다.
f = open("test.txt", encoding='utf-8')
f.close()
# 그러자 선생님은 민수에게 이 방법은 완전히 안전하지 않다고 조언하였다.
# 왜 위의 코드가 안전하지 않고 안전해지려면 어떻게 해야 하는지 서술해보자

# 안전하지 않은 이유: 위와 같이 코드를 작성하게 된다면 파일로 일부 작업을 수행할 때 예외가 발생하면
# 파일을 닫지 않고 코드가 종료된다.
# 위의 코드가 안전해지려면 try..finally..로 예외처리를 하면 된다.
# try:
#   f.open("test,.text", encoding = 'utf-8')
# finally:
#   f.close()
# 이렇게 작성하면 프로그램 흐름을 멈추게 하는 예외가 발생하더라도 파일이 제대로 닫히도록 보장할 수 있다.
# 가장 좋은 방법은 with 명령문을 사용하는 것이다.
# with open("test,.text", encoding = 'utf-8')로 작성하면 명령문 내부의 블록이 종료될 때 파일이 닫힌다.
# 이 경우 close() 메서드를 명시적으로 호출할 필요 없이 내부적을 이루어진다.