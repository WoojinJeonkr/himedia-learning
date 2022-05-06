# Dataframe 불러오기
basketball_train <- read.csv("C:/local git/R-project/csv/basketball_train.csv")

# Dataframe 보기
View(basketball_train)

# 기술적 통계
dim(basketball_train)
length(basketball_train) # length(df) --> column size
length(basketball_train$Player) # length(df$column) --> row size

# df의 전체 구조 정리
# df의 행/열의 개수
# df의 열 이름과 타입들, 각 값들의 목록
str(basketball_train)
str(basketball_train$Player)

# df의 값들의 기술적 통계량
# 최소, 최대, 평균, 분산, 4분위수
summary(basketball_train)

# 농구선수의 이름
basketball_train$Player[1]
basketball_train$Player[1:3]

# 농구선수의 전체 포지션
basketball_train$Pos

# 1. Pos의 개수
length(basketball_train$Pos)

# 2. Pos의 빈도수
result <- table(basketball_train$Pos)

# 3. Pos의 요약
summary(basketball_train$Pos)

# 4. Pos의 값이 SG인 것만 찾아보세요
result2 <- subset(basketball_train, basketball_train$Pos == 'SG')
print(result)

# 5. 4의 결과로 그래프를 그려보세요
barplot(result2$X3P, main="SG basketball players X3P")
barplot(result2$TRB, main="SG basketball players TRB")
barplot(result2$BLK, main="SG basketball players BLK")

# 6. Pos 전체 값을 그래프로!
barplot(result, main="basketball players Pos")


# 7. blk가 0.3이상인 선수들만 추출
result3 <- subset(basketball_train, basketball_train$BLK >= 0.3)
print(result3)

# 8. 7번의 Pos 빈도수를 그래프로!
barplot(table(result3$Pos), main="Frequency of basketball players with a BLK of 0.3 or higher")

# BLK 비율 확인
result4 <- prop.table(basketball_train$BLK)
round(result4*100, 2)

# 데이터 준비
result5 <- basketball_train$X3P
print(result5)

# 요약
summary(result5)

# 최소
min(result5)

# 최대
max(result5)

# 범위 확인
range(result5)

# 정렬
sort(result5) # 오름차순
sort(result5, decreasing = T) # 내림차순 

# 평균
mean(result5)

# 중앙값
median(result5)

# 분산
var(result5)

# 4분위수
quantile(result5, 1/4)
quantile(result5, 3/4)

# 정규성 체크
# 왜도, 첨도를 이용해서 정규분표인지 확인

install.packages('moments')
library(moments)

#왜도(치우친 정도)
skewness(basketball_train$X3P) 
#중앙에 집중된 모양(0)
#왼쪽에 치우친 종모양(>0)
#오른쪽에 치우친 종모양(<0)

#첨도(뾰족한 정도)
kurtosis(basketball_train$X3P)
#적절한 완만한 경사(3, 0)
#뽀족한 경사(>3)
#아주 완만한 경사(<3)

# > skewness(basketball_train$X3P)
# [1] 0.06910396
# > kurtosis(basketball_train$X3P)
# [1] 1.986352

hist(basketball_train$X3P)


# 빈도와 비율
# install.packages('Hmisc')
# library(Hmisc)
# freq(basketball_train$Pos)

install.packages('prettyR')

library(prettyR)

freq(basketball_train$Pos)
