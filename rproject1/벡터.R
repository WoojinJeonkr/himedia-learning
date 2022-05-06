name.list = c('hong', 'kim', 'song')

print(name.list)

age.list = c(100, 200, 50)

print(age.list)

weight.list = 100:200

print(weight.list)

# index
print(weight.list[0])
print(weight.list[1])
print(weight.list[1:5])

run.list <- c(9, 11:15, 25, 30:33)
# 전체 index의 시작~끝 번호 확인
print(run.list[1])
print(run.list[11])

# 첫번째 값, 마지막 값의 차이 구하기
start <- min(run.list)
end <- max(run.list)
diff <- end - start
cat ('달리기 속도의 차이는 ', diff)
# age, weight, run의 평균
cat('age의 평균 = ', mean(age.list))
cat('weight의 평균 = ', mean(weight.list))
cat('run의 평균 = ', mean(run.list))

#------------------------------------

term.1 <- c(90, 100, 80, 75)
names(term.1) <- c('국어', '영어', '수학', '컴퓨터')
print(term.1)
print(term.1['국어'])

# 수정해보세요
# 국어 점수 99 , 수학 점수 88
# 국어, 수학 점수 프린트
term.1['국어'] <- 99
term.1['수학'] <- 88
print(term.1['국어'])
print(term.1['수학'])

# 영어, 컴퓨터를 한꺼번에 변경해보자 100 77
term.1[c(2, 4)] <- c(100, 77)
print(term.1)









