# 단계 1 : 데이터 가져오기
twomethod <- read.csv("C:/local git/R-project/csv/twomethod.csv")
View(twomethod)

head(twomethod)

# 단계2 : 두 집단 subset 작성(데이터 정제, 전처리)
# 데이터 전처리
result <- subset(twomethod, !is.na(score), c(method, score))
head(result)

# 단계 3 : 데이터 분리
# 1) 교육 방법별로 분리
a <- subset(result, method == 1)
b <- subset(result, method == 2)

# 2) 교육 방법에서 시험성적 추출
a1 <- a$score
b1 <- b$score

# 3) 갯수 확인하기
length(a1) # [1] 22
length(b1) # [1] 35

# 단계 4. 분포모양 검정
var.test(a1, b1)

# F test to compare two variances
 
# data:  a1 and b1
# F = 1.0648,
# num df = 21,
# denom df = 34,
# p-value = 0.8494
# alternative hypothesis: true ratio of variances is not equal to 1
# 95 percent confidence interval:
#   0.502791 2.427170
# sample estimates:
#   ratio of variances 
# 1.06479 
# => a와 b 차이가 없다 --> 모수검정

# historgram 그리기
set.seed(1)
data=rnorm(a1, b1)
hist(data)

# 단계 5. 가설 검정
t.test(a1, b1, alternative = 'two.side', conf.level = 0.95)

# Welch Two Sample t-test
 
# data:  a1 and b1
# t = -5.6056,
# df = 43.705,
# p-value = 1.303e-06
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#   -17.429294  -8.209667
# sample estimates:
#   mean of x mean of y 
# 16.40909  29.22857 

t.test(a1, b1, alternative = 'greater', conf.level = 0.95)

# Welch Two Sample t-test
 
# data:  a1 and b1
# t = -5.6056,
# df = 43.705,
# p-value = 1
# alternative hypothesis: true difference in means is greater than 0
# 95 percent confidence interval:
#   -16.66255       Inf
# sample estimates:
#   mean of x mean of y 
# 16.40909  29.22857 
# => a1과 b1 간의 시험 성적에 차이가 있다

t.test(a1, b1, alternative = 'less', conf.level = 0.95)

# Welch Two Sample t-test
 
# data:  a1 and b1
# t = -5.6056,
# df = 43.705,
# p-value = 6.513e-07
# alternative hypothesis: true difference in means is less than 0
# 95 percent confidence interval:
#   -Inf -8.976413
# sample estimates:
#   mean of x mean of y 
# 16.40909  29.22857 
# => b1이 a1보다 시험 성적이 더 좋다
