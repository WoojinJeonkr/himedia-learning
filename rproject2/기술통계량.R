# Dataframe 불러오기
basketball_train <- read.csv("~/R-workspace/csv/basketball_train.csv")

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
