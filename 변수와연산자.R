a <- 10
b <- 20
print(a + b)

cat('더한 결과 값은 : ', a + b)

#  소금물 농도 구하기

# 1. 소금의 양을 변수 salt에 저장합니다
salt <- 20

# 2. 물의 양을 변수 water에 저장합니다
water <- 300

# 소금물의 농도를 계산하고 그 결과를 result에 저장합니다
result <- salt / (salt + water)*100

#  결과를 다음과 같은 형식으로 출력합니다(cat() 함수 이용)
cat('소금 = ', salt, ', 물 = ', water, ', 농도 = ', result, '%')
