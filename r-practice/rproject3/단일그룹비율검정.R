# 빈도수의 차이를 검정하고 싶을 때
# 빈도수를 나타내는 표 : 교차검정표

# 현재 workspace 경로 보기
getwd() # "C:/local git/R-project/rproject3"

# 경로 바꾸기
setwd("C:/local git/R-project/csv")

# 데이터 불러오기
one_sample <- read.csv("one_sample.csv")

# 데이터프레임 보기
View(one_sample)

# console에 출력
print(one_sample)

# 경로 재설정
setwd("C:/local git/R-project/rproject3")

# 현재 workspace 경로 보기
getwd()

# 상위 5개의 행
head(one_sample)

# 하위 5개의 행
tail(one_sample)

# 요약
summary(one_sample)

# 컬럼 수
length(one_sample)

# 행 수
length(one_sample$no)

# survey 빈도 수
table(one_sample$survey)

# userNA = 'ifany' = NA 값이 있으면 표시해주고, 없으면 표시해 주지 않음
table(one_sample$survey, useNA = 'ifany')

# prettyR 라이브러리 사용
library(prettyR)

# 빈도 수 보기
freq(one_sample$survey)

# Frequencies for one_sample$survey 
# 1    0   NA
# 136   14    0
# %    90.7  9.3    0 
# %!NA 90.7  9.3 

# 이항분포를 가지는 베르누이 시행 결과인
# 교차분석표를 table(), freq() 함수로 구함
# 이항분포는 명목척도(질적데이터)

binom.test(c(136, 14), p=0.8, alternative = 'greater', conf.level = 0.95)

# 결과

# Exact binomial test

# data:  c(136, 14)
# number of successes = 136,
# number of trials = 150,
# p-value = 0.0003179
# alternative hypothesis: true probability of success is greater than 0.8
# 95 percent confidence interval: 
#   0.8579426 1.0000000
# sample estimates:
#   probability of success 
#   0.9066667

# 해석

# p-value는 영가설이 나타날 확률(0.0003179)이 0.05보다 작을 확률이므로
# 주장한 80% 이상의 만족도가 나타날 확률이 95% 이상 된다
# 85 ~ 100 만족도가 나오면 본인의 주장이 맞다라는 결론.
# => 만족도가 80% 이상 나왔으므로 작년보다 만족도가 높고
#    불만족도가 낮아졌다라고 할 수 있음

# --------------------------------------------------------------------

# 문제 1. 

# data load
hdtv <- read.csv("C:/local git/R-project/csv/hdtv.csv")

# data 출력
print(hdtv)

# data 보기
View(hdtv)

# 요약
summary(hdtv)

# 단계2. 빈도 수와 비율 계산

# 행 수
length(hdtv$buy)

# buy 빈도 보기
table(hdtv$buy)

# NA 빈도수 표시
table(hdtv$buy, useNA = 'ifany')

# prettyR 라이브러리 사용
library(prettyR)

# 빈도 수 보기
freq(hdtv$buy)

# Frequencies for hdtv$buy 
# 1    2   NA
# 40   10    0
# %      80   20    0 
# %!NA   80   20 

# 구매빈도 10, 구매하지 않은 빈도 40

# 이항 분포
binom.test(c(10, 40), p=0.15)
# 15%의 구매율이다-> 대립가설
# 기존 구매율과 현재 구매율이 15%로 동일하다
# p-value가 0.05보다 아래로 나와야 함.
# 영가설은 15%가 아니다, 적거나 크다
# p-value가 0.05보다 크게 나오면 영가설이 채택

# 결과

# Exact binomial test

# data:  c(10, 40)
# number of successes = 10,
# number of trials = 50,
# p-value = 0.321
# alternative hypothesis: true probability of success is not equal to 0.15
# 95 percent confidence interval:
#   0.1003022 0.3371831
# sample estimates:
#   probability of success 
# 0.2 

# --> p-value가 0.05보다 크므로 대립가설은 기각, 영가설이 채택
#     기존 구매율 15%와 다르다 (크거나 작다)

binom.test(c(10, 40), p=0.15, alternative = 'greater', conf.level = 0.95)

# 결과

# Exact binomial test
# 
# data:  c(10, 40)
# number of successes = 10,
# number of trials = 50,
# p-value = 0.2089
# alternative hypothesis: true probability of success is greater than 0.15
# 95 percent confidence interval:
#   0.1127216 1.0000000
# sample estimates:
#   probability of success 
# 0.2 

# 15%보다는 작다고 했으므로 더 낮은 수치를 찾아보자
binom.test(c(10, 40), p=0.1, alternative = 'greater', conf.level = 0.95)

# 결과

# Exact binomial test
# 
# data:  c(10, 40)
# number of successes = 10,
# number of trials = 50,
# p-value = 0.02454
# alternative hypothesis: true probability of success is greater than 0.1
# 95 percent confidence interval:
#   0.1127216 1.0000000
# sample estimates:
#   probability of success 
# 0.2 

# => 10%보다는 크다, 대립가설이 채택

binom.test(c(10, 40), p=0.11, alternative = 'greater', conf.level = 0.95)

# 결과

# Exact binomial test
# 
# data:  c(10, 40)
# number of successes = 10,
# number of trials = 50,
# p-value = 0.04345
# alternative hypothesis: true probability of success is greater than 0.11
# 95 percent confidence interval:
#   0.1127216 1.0000000
# sample estimates:
#   probability of success 
# 0.2 
# => 11%보다는 구매율이 크다
# => 현재 구매율은 11% ~ 15% 사이이다
# => 현재 구매율이 기존 구매율인 15%보다는 낮다
# => 이항분포(구매, 비구매)를 따르는 베르누이 시행 결과
#    단일그룹 비율 검정함 (명목 데이터)

