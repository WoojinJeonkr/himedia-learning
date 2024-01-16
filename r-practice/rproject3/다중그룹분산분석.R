data <- read.csv("C:/local git/R-project/csv/three_sample.csv")
View(data)

data2 <- subset(data, !is.na(score), c(method, score))
data2

plot(data2$score)
boxplot(data2$score)
mean(data2$score)

length(data2$score) # 91개

data2 <- subset(data, score <= 14)
length(data2$score) # 88개

boxplot(data2$score)

table(data2$method)
# 1  2  3 
# 31 27 30 

tapply(data2$score, data2$method, mean)
# 1        2        3 
# 4.187097 6.800000 5.610000 

# 동질성 검정 (그룹이 2개 이상일 때 하는 검정, 각 그룹의 분포가 정규분포를 다 따르는지 검정)
# 그룹이 2개 - var.test()
# 그룹이 3개 - bartlett.test()
bartlett.test(score ~ method, data=data2)

# Bartlett test of homogeneity of variances
 
# data:  score by method
# Bartlett's K-squared = 3.3157, df = 2, p-value = 0.1905
# ==> 세 개의 독립적인 집단의 분산이 동질하다

# aov() 사용해서 차이 검정
data2$method <- factor(data2$method)
result <- aov(score ~ method, data=data2)

# Call:
#   aov(formula = score ~ method, data = data2)
 
# Terms:
#   method Residuals
# Sum of Squares  99.36805  96.90184
# Deg. of Freedom        2        85
# 
# Residual standard error: 1.067718
# Estimated effects may be unbalanced

names(result)

summary(result)

# Df Sum Sq Mean Sq F value   Pr(>F)    
# method       2  99.37   49.68   43.58 9.39e-14 ***
#   Residuals   85  96.90    1.14                     
# ---
#   Signif. codes:  0 ‘***’ 0.001 ‘**’ 0.01 ‘*’ 0.05 ‘.’ 0.1 ‘ ’ 1
# ==> 세 집단 간 차이가 있다

TukeyHSD(result)

# Tukey multiple comparisons of means
# 95% family-wise confidence level

# Fit: aov(formula = score ~ method, data = data2)

# $method
# diff        lwr        upr     p adj
# 2-1  2.612903  1.9424342  3.2833723 0.0000000
# 3-1  1.422903  0.7705979  2.0752085 0.0000040
# 3-2 -1.190000 -1.8656509 -0.5143491 0.0001911
# => 방법 2와 방법 1의 차이가 제일 크다