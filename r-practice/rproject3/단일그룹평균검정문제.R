# 단계 1 : 데이터셋 가져오기

# 경로 설정
setwd("C:/local git/R-project/csv")

# 데이터 가져오기
student_height <- read.csv("student_height.csv")
height <- student_height$height
head(height)

# 단계2 : 기술 통계량 / 결측치 확인
length(height) # 50

# 요약
summary(height)

height2 <- na.omit(height) # 결측치 제거
height2 # 정제 대이터
korea.woman.height <- mean(height2) # 149.4 : 평균 신장

# 단계 3 : 정규성 검정
shapiro.test(height2) # p-value = 0.0001853

# Shapiro-Wilk normality test

# data:  height2
# W = 0.88711, p-value = 0.0001853
# => 정규성을 따르지 않음
# => 비모수 검정

# 단계 4 가설 검정
wilcox.test(height2, mu = korea.woman.height, alternative = 'two.side', conf.level = 0.95)

# Wilcoxon signed rank test with continuity correction
 
# data:  height2
# V = 659, p-value = 0.8389
# alternative hypothesis: true location is not equal to 149.4
# 대립가설 : 차이가 있다 <--> 영가설 : 차이가 없다
# 대립가설 기각, 영가설이 채택(차이가 없다)

