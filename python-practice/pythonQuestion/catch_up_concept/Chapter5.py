# 1. 0~9, +, -, *, / 버튼들이 있는 계산기에서 버튼이 눌렸을때, onclick으로 연결된 함수에서
# 숫자버튼이 눌렸는지 연산버튼이 눌렸는지 판별하는 코드를 if문을 쓰지 않고 작성하시오.
# 버튼이 숫자버튼인지 연산자 버튼인지 print

c = input()
try:
    int(c)
    print('숫자')
except:
    print('연산자이군요')

# 2.
# 다음 코드에서 map()함수를 이용해 lst의 절대값을 new_list에  넣고, answer_1에는 new_list의 평균을 넣어주세요
# lst=[99.3890,-3.5, 5, -0.7123, -9, -0.003]
# new_lst=
# ans_1=
# print(ans_1)

lst = [99.3890, -3.5, 5, -0.7123, -9, -0.003]
result = 0
new_lst = list(map(abs, lst))
for i in new_lst:
    result += i
ans_1 = result / len(new_lst)
print(ans_1)

# 3. filter과 lambda를 사용하여
# 정수 10개를 입력받아 리스트에 넣은 후
# 리스트의 각 정수값에 3의 곱인 정수를 프린트해주세요

a = []
for i in range(1, 11) :
    a.append(i)
print(a)

y=4
b = list(filter(lambda x: x%3 == 0, a))
print(b)

# 4. self에 대해 정의하시오.

# self는 객체의 인스턴스 그 자체를 말한다.
# 즉, 객체 자기 자신을 참조하는 매개변수인 셈이다.
# 객체지향 언어는 모두 이걸 메소드에 안보이게 전달하지만, 파이썬은 클래스의 메소드를 정의할 때 self를 명시한다.
# 메소드를 불러올 때 self는 자동으로 전달된다.
# 자동으로 전달되기 때문에 사실 self를 명시해 주지 않아도 된다.

# 5. 파이썬 메서드 이름으로 __init__를 사용하면 이 메서드는 ??가 된다

# 파이썬 메서드 이름으로 __init__를 사용하면 이 메서드는 패키지의 일부가 된다.
# 하지만 python 3.3부터는 없어도 패키지의 일부가 된다.

# 6. 아래 코드는 리스트에 b태그를 제거하여 출력하는 코드이다.\
#    아래 코드의 replace('</b>', '')를 함수로 모듈화하여
#    코드를 고쳐보세요
# data_values = [{'title': '다이렉트<b>자동차</b>보험비교 견적사이트 / 특약 내용 정리'},
#                {'title': '<b>자동차</b>보험다이렉트비교사이트 살펴보기'}]
# titles = []
# for i in range(0, len(data_values), 1):
#     data_values[i]['title'] = (data_values[i]['title']).replace('<b>', '')
# mdfy_title = (data_values[i]['title']).replace('</b>', '')
# titles.append(mdfy_title)
# print(titles)

data_values= [{'title': '다이렉트<b>자동차</b>보험비교 견적사이트 / 특약 내용 정리'}, {'title': '<b>자동차</b>보험다이렉트비교사이트 살펴보기'}]

titles = []

def del_b(x):
    x = x.replace('<b>','')
    return x

def del_b1(x):
    x = x.replace('</b>','')
    return x
#title 키의 b태그 없애기
for i in range(0, len(data_values), 1):
    mdfy_title = (data_values[i]['title'])
    mdfy_title = del_b(mdfy_title)
    mdfy_title = del_b1(mdfy_title)
    titles.append(mdfy_title)
print(titles)

# 7. 클래스, 객체, 인스턴스에 대해 설명하세요

# 클래스: 객체를 표현하기 위한 문법
# 객체: 클래스에 의해 만들어진 실체
# 인스턴스: 클래스에 의해서 만들어진 객체

# 8. 결과값 예측
# all([1, 2, abs(-3)-3])

# abs(-3) - 3의 결과가 0이므로 False가 출력된다

# 9. random 모듈을 사용하여 로또 번호(1~45 사이의 숫자 6개)를 생성해 보자(단 중복된 숫자가 있으면 안 됨).

import random
r_list = []
while len(r_list) < 6:
    random_number = random.randint(1, 45)
    if random_number != r_list:
        r_list.append(random_number)
print(r_list)

# 10. if __name__ == "__main__": 가 가지는 의미는?

# if name == "__main__을 사용하면 직접 파일을 실행했을 때
# name == "main"이 참이 되어 if문 다음 문장이 수행된다.
# 반대로 대화형 인터프리터나 다른 파일에서 이 모듈을 불러서 사용할 때는
# 거짓이 되어 if문 다음 문장이 수행되지 않는다.

# 11. 파이썬에서 오버라이딩, 오버로딩을 구현하는 방법을 설명해보세요

# 오버로딩:
# 동일 클래스 내에서, 매개변수의 개수 또는 자료형(int, float 등)이 다른 동명의 메소드를 정의하는 것.
# 즉, 클래스 내에서 같은 이름의 메소드를 여러 개 선언하는 것을 의미한다.

# 오버라이딩은 부모 클래스의 메소드를, 자식 클래스에서 재정의 하여 사용하는 것을 의미
# 예를 들어 부모클래스에서 add()라는 메서드는 2개의 인자밖에 더할 수 없지만,
# 자식 클래스의 add() 메소드는 오버라이딩되어 3가지의 인자까지 받도록 재정의 할 수 있다.

# 12.
# 1) print(ord('밥'))
# 2) print(ord('반찬'))
# 위의 두 코드를 각각 실행했을 때의 차이를 보고, 왜 그런지 설명해보세요.

# 1) '밥'은 잘 실행된다
# 2) ‘반찬’에서
# TypeError: ord() expected a character, but string of length 2 found
# 라는 오류가 뜨게 된다 --> 하나의 character을 입력하고 ord함수를 써야하는데
# '반찬' 2개의 값을 입력해서 오류가 난 것을 확인할 수 있었다.