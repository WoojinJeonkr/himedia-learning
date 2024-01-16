# 1. MASS 패키지에 있는 Animals 데이터 셋을 이용하여
# 각 단계에 맞게 기술 통계량을 구하시오

# 단계 1 : MASS 패키지 설치 및 메모리 로딩
library(MASS)
data("Animals")
head(Animals)

# 단계 2 : R의 기본함수를 이용하여 brain 칼럼을 대상으로
# 다음 기술 통계량 구하기
Animals.brain <- Animals$brain
summary(Animals.brain) # 요약
min(Animals.brain) # 최소
max(Animals.brain) # 최대
mean(Animals.brain) # 평균
median(Animals.brain) # 중앙값
sd(Animals.brain) # 표준편차
var(Animals.brain) # 분산

# 단계 3 : 패키지에서 제공되는 describe()와 freq()함수를
# 이용하여 Animals 데이터 셋 전체를 대상으로
# 기술 통계량 구하기
library(Hmisc)
describe(Animals)
freq(Animals)