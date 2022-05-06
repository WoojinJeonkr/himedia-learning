# 내장된 함수
jumsu <- c(1, 7, 4, 2, 3, 9)

print(sort(jumsu)) # 비파괴 함수
#  > print(sort(jumsu))
#  [1] 1 2 3 4 7 9

print(jumsu)
# > print(jumsu)
# [1] 1 7 4 2 3 9

jumsu.2 = sort(jumsu) # 오름차순 정렬
print(jumsu.2)

jumsu.3 = sort(jumsu, decreasing = TRUE) # 내림차순 정렬
print(jumsu.3)

jumsu.4 = sort(jumsu, TRUE) # 내림차순 정렬
print(jumsu.4)

str <-  paste('굿', '모닝', sep = '/')
print(str)

str <-  paste('굿', '모닝', sep = ' ')
print(str)

str2 <-  paste('굿', '모닝', '굿', '나잇', sep = ' ')
print(str2)

# 브로드캐스팅
str3 <-  paste(1:12, '월',  sep = '')
print(str3)

# 사용자 정의 함수 (user-defined)
mysum <- function(x){
  result <- x + 100
  return(result)
}

sum1 <- mysum(1000)
cat('100을 더한 결과는 ', sum1)

# 두 수를 더해서 결과값을 받는 함수 정의
addtwonum <- function(x, y){
  result <- x + y
  return(result)
}

# 200, 300 더한 결과값 출력 (1)
add1 <- addtwonum(200, 300)
cat('200 + 300 = ', add1)

# 5555, 3333 더한 결과값 출력 (2)
add2 <- addtwonum(5555, 3333)
cat('5555 + 3333 = ', add2)

# 1과 2 더한 결과값 출력
add3 <- addtwonum(add1, add2)
cat('add1 + add2 = ', add3)

install.packages('svDialogs')
library(svDialogs)

data.1 <- dlgInput('숫자 1 입력 ')$res
data.2 <- dlgInput('숫자 2 입력 ')$res
n1 <- as.numeric(data.1)
cat('n1은 ', n1)
n2 <- as.numeric(data.2)
cat('n2는 ', n2)
add4 = addtwonum(n1, n2)
cat('n1과 n2를 더한 값은 ', add4)

mysum2 <- function(x, y=1000){ # default 값!
# 함수를 호출할 때 넣지 않으면, default 값 사용
  result <- x + y
  return(result)
}

print(mysum2(555, 666))
print(mysum2(555))

mysum.minus <- function(x,y){
  s1 <-  x + y
  m1 <-  x - y
  return(list(s = s1, m = m1))
}

result1 <- mysum.minus(888, 111)
print(result1)
cat('두 수의 더한 값은 ', result1$s)
cat('두 수의 뺀 값은 ', result1$m)

class(result1)