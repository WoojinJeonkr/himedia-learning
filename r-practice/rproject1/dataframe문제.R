# 5명의 정보를 데이터프레임에 넣어
person5 <- c()
for(x in 1:5){
  n <- readline('Enter name!!')
  person5 <- c(person5, n)
}
age5 <- c(24, 43, 62, 51, 26)
com5 <- c(80, 60, 20, 100, 50)
eng5 <- c(55, 65, 75, 80, 35)

df <- data.frame(person5, age5, com5, eng5)
print(df)

# 이름, 나이, 컴퓨터 점수, 영어 점수
# df에서 추출(각 항목을 추출하여 프린트)
name <- df$person5
print(name)

age <- df$age5
print(age)

com <- df$com5
print(com)

eng <- df$eng5
print(eng)

# 그래프로 그리기
barplot(com, main = 'com score', col=rainbow(20)[1:5])
hist(age, breaks = 6, main = 'age', xlab = 'age', col=rainbow(20)[1:6])
pie(table(df$person5), main = '5 person inforamation', col=rainbow(10) , radius = 1)

# 이름에 해당하는 나이를 그래프로 그리기
library(ggplot2)
ggplot(df, aes(x = name, y = age)) + geom_point()

# df에서 추출한 나이의 평균 구하기
age.mean <- mean(age)
print(age.mean)

# df에서 추출한 영어 점수의 최고 점수 구하기
eng.max <- max(eng)
print(eng.max)

# df의 3번째 행, 3번째 열의 값을 프린트
df[3,3]

# df의 1~3행, (2, 4)열의 값들을 프린트
df[1:3, c(2,4)]

# 영어점수가 평균보다 높은 사람들만 새로운 df_new로 저장
df_new <- subset(df, eng5 > mean(eng))
print(df_new)
print(mean(eng))

# ----------------------------

# 컴퓨터점수와 영어점수를 합해서 total컬럼 생성
df['total'] <- df['com5'] + df['eng5']
print(df)

# total이 150점 이상이면 우수, 100점 이상이면 보통, 아니면 미달의 값이 들어가는
# result컬럼을 추가
df['result'] <- ifelse (df['total'] >= 150, '우수', ifelse(df['total']>= 100, '보통', '미달'))
print(df)

# 최종 df의 내용과 행과 열의 개수 프린트
print(df)
nrow(df)
ncol(df)

# 최종 만들어진 df를 csv(df_csv.csv)로 저장
write.csv(df, file="C:/R-file/df_csv.csv", fileEncoding = 'euc-kr')

# 저장된 csv를 읽어와서 프린트
df_load = read.csv('C:/R-file/df_csv.csv')
df_load
