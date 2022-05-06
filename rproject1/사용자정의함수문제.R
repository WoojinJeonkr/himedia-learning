install.packages('svDialogs')
library(svDialogs)

# 사용자 이름 입력
username <- dlgInput('Input username ')$res
cat(username, '님 안녕하세요!!!')

# 사용자 키 입력
height <- dlgInput('Input user height ')$res
user.height <- as.numeric(height)
cat(username, '님의 키는 ', user.height, '입니다.')

# 사용자 적정 몸무게 구하는 함수를 정의
fitweight <- function(x){
  result <- (x - 100) * 0.9
  return(result)
}

# 사용자의 적정 몸무게 구하기
user.fit <- fitweight(user.height)
cat(username, '님의 적정 몸무게는 ', user.fit, '입니다.')

# 사용자 몸무게 입력
weight = dlgInput('Input user weight ')$res
user.weight <- as.numeric(weight)
cat(username, '님의 몸무게는 ', user.weight, '입니다.')

# 적정 몸무게와 사용자 몸무게 비교
comp <- function(x, y, z){
  if (x > y) {
    cat(z, '님의 몸무게의 0.9를 곱한 결과 초과입니다.')
    } else if (x == y) {
    cat(z, '님의 몸무게의 0.9를 곱한 결과 정상입니다.')
    } else {
    cat(z, '님의 몸무게의 0.9를 곱한 결과 미달입니다.')
    }
}

# 홍길동님의 몸무게의 0.9를 곱한 결과 초과(또는 미달)입니다 형식으로 출력
comp(user.fit, user.weight, username)
