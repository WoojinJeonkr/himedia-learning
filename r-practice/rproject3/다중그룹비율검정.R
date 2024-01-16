# 데이터 불러오기
two_sample <- read.csv("C:/local git/R-project/csv/two_sample.csv")

# 데이터 보기
View(two_sample)

# 데이터 출력
print(two_sample)

# gender 행 수 
length(two_sample$gender)

# method 행 수
length(two_sample$method)

# survey 행 수
length(two_sample$survey)

# score 행 수
length(two_sample$score)

# 각 컬럼 빈도수 조회
table(two_sample$gender)
table(two_sample$method)
table(two_sample$score)
table(two_sample$survey)
# 0   1 
# 55 245 -- 만족 245

freq(two_sample$gender)
freq(two_sample$method)
freq(two_sample$survey)
freq(two_sample$score)

# 그룹별 빈도분석표를 그려보자
table(two_sample$method, two_sample$survey, useNA = 'ifany')
#    0   1
# 1  40 110 -- 1번은 110개의 만족도가 있다
# 2  15 135 -- 2번은 135개의 만족도가 있다

# 어느 그룹이 만족도가 더 높았는가?
prop.test(c(110, 135), c(150, 150), alternative = 'greater', conf.level = 0.95)

# 결과

# 2-sample test for equality of proportions with continuity correction
# 
# data:  c(110, 135) out of c(150, 150)
# X-squared = 12.824,
# df = 1,
# p-value = 0.9998
# alternative hypothesis: greater
# 95 percent confidence interval:
#   -0.2451007  1.0000000
# sample estimates:
#   prop 1    prop 2 
# 0.7333333 0.9000000 
# => 연구가설 => pt교육이 코딩교육보다 만족도가 높다
# => 귀무가설 => pt교육이 코딩쿄육보다 만족도가 낮거나 같다
# => p-value가 0.9이므로 연구가설 기각, 귀무가설 채택
# => pt교육이 코딩쿄육보다 만족도가 낮거나 같다

prop.test(c(110, 135), c(150, 150), alternative = 'less', conf.level = 0.95)

# 2-sample test for equality of proportions with continuity correction
# 
# data:  c(110, 135) out of c(150, 150)
# X-squared = 12.824, df = 1, p-value = 0.0001711
# alternative hypothesis: less
# 95 percent confidence interval:
#   -1.00000000 -0.08823265
# sample estimates:
#   prop 1    prop 2 
# 0.7333333 0.9000000 
# => 연구가설 : pt교육이 코딩교육보다 만족도가 적다
# => 귀무가설 : pt교육이 코딩교육보다 만족도가 높거나 같다
# p-value가 0.0001이므로 연구가설 채택
# => pt교육이 코딩교육보다 만족도가 적다

# 문제 03. 대학에 진학한 남학생과 여학생을 대상으로 진학한 대학에 대해서 만족도에 차이가 있는가를 검정하시오

# gender 구분
gender <- table(two_sample$gender)

# 1   2 
# 174 126 

# 대학 진학 만족도
survey <- table(two_sample$survey)

# 0   1 
# 55 245

# useNA='ifany'
table(gender, survey, useNA="ifany")

# survey
# gender 55 245
# 126     0   1
# 174     1   0

# 다중그룹 비율차이 검증

# 남학생과 여학생의 만족도 차이 검정
prop.test(c(138, 107), c(174, 126))

# 결과
# 2-sample test for equality of
# proportions with continuity correction
# 
# data:  c(138, 107) out of c(174, 126)
# X-squared = 1.1845,
# df = 1,
# p-value = 0.2765
# alternative hypothesis: two.sided
# 95 percent confidence interval:
#   -0.14970179  0.03749599
# sample estimates:
#   prop 1    prop 2 
# 0.7931034 0.8492063

prop.test(c(138, 107), c(174, 126), alternative = "two.sided", conf.level = 0.95)

# 결과

# 2-sample test for equality of
# proportions with continuity correction
# 
# data:  c(138, 107) out of c(174, 126)
# X-squared = 1.1845, df = 1, p-value =
#   0.2765
# alternative hypothesis: two.sided
# 95 percent confidence interval:
#   -0.14970179  0.03749599
# sample estimates:
#   prop 1    prop 2 
# 0.7931034 0.8492063 

# => p-value가 0.2765로 0.05보다 큰 확률이므로
#    남학생과 여학생의 만족도에 차이가 없다

