# 9. 학생의 시험 점수를 물어보고 시험 점수가 90점 이상이면 A, 80점 이상이면 B,
#    70점 이상이면 C 60점 이상이면 D, 그 외의 점수이면 F를
#    학점으로 주는 프로그램을 작성하라.
score = int(input('시험 점수는? >> '))
if score >= 90:
    print('A')
elif score >= 80:
    print('B')
elif score >= 70:
    print('C')
elif score >= 60:
    print('D')
elif score >= 00:
    print('F')
else:
    print('잘못 입력하셨습니다. 다시 입력해주세요')

# 10. 난수를 사용하여 1부터 100 사이의 숫자를 사용하는 뺄셈 문제를 생성하고
#    사용자에게 물어본 후에 사용자의 답변이 올바른지를 검사하는 프로그램을 작성하라.
import random

num1 = random.randint(1,100)
num2 = random.randint(1,100)
total = int(input(str(num1) + ' - ' + str(num2) + ' = '))
if total == num1 - num2:
    print('답변이 올바릅니다.')
else:
    print('답변이 올바르지 않습니다.')

# 11. 사용자로부터 정수를 받아서 이 정수가 2와 3으로 나누어 떨어질 수 있는지를 출력하라.
n = int(input('정수를 입력하세요 >> '))
if n%2 == 0 and n%3 == 0:
    print('나누어 떨어집니다.')
else:
    print('나누어 떨어지지 않습니다.')

# 12. 2자리 숫자로 이루어진 복권이 있다. 사용자가 가지고 있는 복권 번호가 2자리 모두 일치하면 100만 원을 받는다.
#    2자리 중에서 하나만 일치하면 50만 원을 받는다. 하나도 일치하지 않으면 상금은 없다.
#    복권 당첨 번호는 난수로 생성하고 사용자의 입력에 따라서 상금이 얼마인지를 출력하는 프로그램을 작성하라.
import random
lotto = random.randint(0,99)
choose = int(input('복권번호를 입력하세요(0~99) >> '))
print('복권 당첨 번호는 '+str(lotto)+'입니다.')

number1 = lotto // 10
number2 = lotto % 10

ch_number1 = choose // 10
ch_number2 = choose % 10

if lotto == choose:
    print('당첨 금액은 100만 원입니다. 축하합니다!!')
elif number1 == ch_number1 or number2 == ch_number2 or number1 == ch_number2 or number2 == ch_number1:
    print('당첨 금액은 50만 원입니다.')
else:
    print('당첨되지 않았습니다.')

