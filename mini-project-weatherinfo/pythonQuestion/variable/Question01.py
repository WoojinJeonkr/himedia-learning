# 1. 다음(Daum)의 주가가 89,000원이고 네이버(Naver)의 주가가 751,000원이라고 가정하고,
#    어떤 사람이 다음 주식 100주와 네이버 주식 20주를 가지고 있을 때 그 사람이 가지고 있는 주식의 총액을 계산하는 프로그램을 작성하세요.

Daum_stock = 89000 # 다음의 주가
Naver_stock = 751000 # 네이버의 주가
total_stock1 = int(Daum_stock)*100 # 다음 주식의 총액 계산
total_stock2 = int(Naver_stock)*20 # 네이버 주식의 총액 계산
all_stock = total_stock1 + total_stock2
print('주식의 총액은', all_stock) # 계산한 주식의 총액 출력

# 2. 문제 2-1에서 구한 주식 총액에서 다음과 네이버의 주가가 각각 5%, 10% 하락한 경우에 손실액을 구하는 프로그램을 작성하세요.
damage_stock = int(total_stock1*0.05 + total_stock2*0.1)
print('손실액 :',damage_stock)

# 3. 우리나라는 섭씨 온도를 사용하는 반면 미국과 유럽은 화씨 온도를 주로 사용합니다.
#   화씨 온도(F)를 섭씨 온도(C)로 변환할 때는 다음과 같은 공식을 사용합니다.
#   C = (F-32)/1.8
#   이 공식을 사용해 화씨 온도가 50일 때의 섭씨 온도를 계산해 보세요.
C = 0
F = 50
C = (F-32)/1.8
print('화씨 온도가 50일 때 섭씨 온도는',C)

# 4. 화면에 "pizza"를 10번 출력하는 프로그램을 작성하세요.
for _ in range(10):
    print('"pizza"')

# 5. 월요일에 네이버의 주가가 100만 원으로 시작해 3일 연속으로 하한가(-30%)를 기록했을 때 수요일의 종가를 계산해 보세요.
monday_start_stock = 1000000
monday_end_stock = monday_start_stock*0.7
tuesday_end_stock = monday_end_stock*0.7
wednesday_end_stock = int(tuesday_end_stock*0.7)
print('수요일의 종가는',wednesday_end_stock)

# 6. 다음 형식과 같이 이름, 생년월일, 주민등록번호를 출력하는 프로그램을 작성해 보세요.
#    이름: 파이썬 생년월일: 2014년 12월 12일 주민등록번호: 20141212-1623210
name = '파이썬'
birth = '2014년 12월 12일'
reg_number = '20141212-1623210'
print('이름:',name,'생년월일:',birth,'주민등록번호:',reg_number)

# 7. s라는 변수에 'Daum KaKao'라는 문자열이 바인딩돼 있다고 했을 때
#    문자열의 슬라이싱 기능과 연결하기를 이용해 s의 값을 'KaKao Daum'으로 변경해 보세요.
s = 'Daum Kakao'
s= s[5:]+' '+s[:4]
print(s)

# 8. a라는 변수에 'hello world'라는 문자열이 바인딩돼 있다고 했을 때
#    a의 값을 'hi world'로 변경해 보세요.
a = 'hello world'
a = a[0]+'i'+a[5:]
print(a)

# 9. x라는 변수에 'abcdef'라는 문자열이 바인딩돼 있다고 했을 때
#    x의 값을 'bcdefa'로 변경해 보세요.
x = 'abcdef'
x = x[1:]+x[0]
print(x)


