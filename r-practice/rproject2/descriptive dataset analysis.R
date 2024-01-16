# 문제2. descriptive.csv 데이터 셋을 대상으로 다음 조건에
# 맞게 빈도분석 및 기술 통계량 분석을 수행하시오

descriptive <- read.csv("C:/local git/R-project/csv/descriptive.csv", na.strings="0")
View(descriptive)

# 조건 1) 명목척도 변수인 학교유형(type), 합격여부(pass)
# 변수에 대해 빈도분석을 수행하고, 결과를 막대그래프와
# 파이차트로 시각화

type <- descriptive$type
type.freq <- table(type) # 빈도분석
print(type.freq)
barplot(type.freq, main="type frequency barplot") # 막대그래프 시각화
pie(type.freq, main="type frequency pieplot") # 파이차트 시각화화

# 조건 2) 비율척도 변수인 나이 변수에 대해
# 요약치(평균, 표준편차)와 비대칭도(왜도와 첨도)
# 통계량을 구하고, 히스토그램을 작성하여
# 비대칭도 통계량 설명

age <- descriptive$age # 나이 변수
mean.age <- mean(age) # 평균
print(mean.age)
sd.age <- sd(age) #표준편차
print(sd.age)
skewness(age) # 왜도
kurtosis(age) # 첨도
hist(age, main="age histogram") # age histogram

# 조건 3) 나이 변수에 대한 밀도분포곡선과
# 정규분포 곡선으로 정규분포 검정

hist(age, freq = F) # 나이변수에 대한 히스토그램
lines(density(age), col="red") # 나이 변수에 대한 밀도분포곡선 빨간색으로 표시
# seq : 연속된 숫자 생성
x <- seq(38,80,0.2)
# dnorm : 확률밀도 계산
curve(dnorm(x, mean.age, sd.age), col="blue", add = T)