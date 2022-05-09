two_sample <- read.csv("C:/local git/R-project/csv/two_sample.csv")
View(two_sample)

head(two_sample)
summary(two_sample)

# no             gender         method        survey           score      
# Min.   :  1.00   Min.   :1.00   Min.   :1.0   Min.   :0.0000   Min.   :3.000  
# 1st Qu.: 75.75   1st Qu.:1.00   1st Qu.:1.0   1st Qu.:1.0000   1st Qu.:5.100  
# Median :150.50   Median :1.00   Median :1.5   Median :1.0000   Median :5.600  
# Mean   :150.50   Mean   :1.42   Mean   :1.5   Mean   :0.8167   Mean   :5.685  
# 3rd Qu.:225.25   3rd Qu.:2.00   3rd Qu.:2.0   3rd Qu.:1.0000   3rd Qu.:6.300  
# Max.   :300.00   Max.   :2.00   Max.   :2.0   Max.   :1.0000   Max.   :8.000  
# NA's   :73    

result <- subset(two_sample, !is.na(score), c(method, score))
head(result)
length(result$score)

a <- subset(result, method == 1)
b <- subset(result, method == 2)

a.score <- a$score
b.score <- b$score

length(a.score) # [1] 109
length(b.score) # [1] 118

# 독립적인 a, b 집단의 동질성 비교
var.test(a.score, b.score)

# F test to compare two variances

# data:  a.score and b.score
# F = 1.2158,
# num df = 108,
# denom df = 117,
# p-value = 0.3002
# alternative hypothesis: true ratio of variances is not equal to 1
# 95 percent confidence interval:
#   0.8394729 1.7656728
# sample estimates:
#   ratio of variances 
# 1.215768 
# => 정규분포를 따른다 (t-test 사용)

t.test(a.score, b.score, alternative = 'two.side', conf.level = 0.95)

# Welch Two Sample t-test
 
# data:  a.score and b.score
# t = -2.0547,
# df = 218.19,
# p-value = 0.0411
# alternative hypothesis: true difference in means is not equal to 0
# 95 percent confidence interval:
#   -0.48296687 -0.01005133
# sample estimates:
#   mean of x mean of y 
# 5.556881  5.803390 
# => 대립가설 채택, 차이가 있다

t.test(a.score, b.score, alternative = 'greater', conf.level = 0.95)

# Welch Two Sample t-test
 
# data:  a.score and b.score
# t = -2.0547,
# df = 218.19,
# p-value = 0.9794
# alternative hypothesis: true difference in means is greater than 0
# 95 percent confidence interval:
#   -0.4446915        Inf
# sample estimates:
#   mean of x mean of y 
# 5.556881  5.803390 
# => 영가설 채택, a가 b보다 크지 않다. a가 b보다 작다
