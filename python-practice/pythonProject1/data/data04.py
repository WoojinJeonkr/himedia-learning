good_rate = 2.5 # 값을 넣을 때 변수의 타입이 결정됨
bad_rate = input('나쁜 이자율 입력>> ') # 11.5
print(type(good_rate))
print(type(bad_rate))

money = 100000
# 이자금액을 계산해보세요
print('좋은 이자율의 이자 금액은 ',int(money*good_rate),'원입니다')
print('나쁜 이자율의 이자 금액은 ',int(money*float(bad_rate)),'원입니다')

# 아래의 데이터는 연산자의 대상? --> 연산자의 대상이 되지 않는다.
tell = '01012345678' # 연산의 대상이 된다라는 표현은 4칙 연산!
                     # 자리 수를 고려할 수 있는 데이터가 연산의 대상
sn = '990909'

food = True
rain = False