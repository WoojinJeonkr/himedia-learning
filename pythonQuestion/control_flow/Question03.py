# 한 학생의 과목 이름과 점수(0~100)를 각각 5개 입력받고
# 가장 점수가 높은 과목의 이름, 학점 출력 (동점일시 가장 마지막 과목을 출력)
# ex) 파이썬 A+
# 평균 학점 출력 (만약 F가 2개 이상이면 평균 학점 대신 낙제! 출력)
# ex1) 평균 학점: 3.8   ex2) 낙제!

#  점수          학점
# 99 ~ 95      A+   4.5
# 94 ~ 90      A    4.0
# 89 ~ 85      B+   3.5
# 84 ~ 80      B    3.0
# 79 ~ 75      C+   2.5
# 74 ~ 70      C    2.0
# 69 ~ 65      D+   1.5
# 64 ~ 60      D    1.0
# 59 ~ 0       F     0

score_list = [] # score_list 생성

for i in range(5): # 5번 반복
    score_list.append([input('{0}번 과목의 이름입력 '.format(i + 1))]) # 과목 이름 입력
    score_list[i].append(int(input('점수 입력(0~100)>> '))) # 과목에 대한 점수 입력

# 점수에 따른 학점 분류
for i in range(5): # 5번 반복 --> 과목이 5개이므로
    if score_list[i][1] >= 95: # 점수가 95점 이상이라면
        score_list[i].append('A+')
        score_list[i].append(4.5)
    elif score_list[i][1] >= 90: # 점수가 90점 이상, 95점 미만이라면
        score_list[i].append('A')
        score_list[i].append(4.0)
    elif score_list[i][1] >= 85: # 점수가 85점 이상, 90점 미만이라면
        score_list[i].append('B+')
        score_list[i].append(3.5)
    elif score_list[i][1] >= 80: # 점수가 80점 이상, 85점 미만이라면
        score_list[i].append('B')
        score_list[i].append(3.0)
    elif score_list[i][1] >= 75: # 점수가 75점 이상, 80점 미만이라면
        score_list[i].append('C+')
        score_list[i].append(2.5)
    elif score_list[i][1] >= 70: # 점수가 70점 이상, 75점 미만이라면
        score_list[i].append('C')
        score_list[i].append(2.0)
    elif score_list[i][1] >= 65: # 점수가 65점 이상, 70점 미만이라면
        score_list[i].append('D+')
        score_list[i].append(1.5)
    elif score_list[i][1] >= 60: # 점수가 60점 이상, 65점 미만이라면
        score_list[i].append('D')
        score_list[i].append(1.0)
    else: # 위의 조건에 모두 만족하지 않는다면
        score_list[i].append('F')
        score_list[i].append(0)

# 가장 점수가 높은 과목의 이름, 학점 출력
index_high = 0
for i in range(1, 5): # i가 1 ~ 5까지 반복
    # 동점일 시 가장 마지막 과목을 출력
    if score_list[index_high][1] <= score_list[i][1]:
        index_high = i
print('가장 점수가 높은 과목은 {0}, 학점은 {1}입니다.'.format(score_list[index_high][0], score_list[index_high][2]))

# 평균 학점 출력
average = 0 # 평균 변수 선언
fail = 0 # 낙제 변수 선언
for i in range(5): # 5번 반복
    average += score_list[i][3] # 학점 점수의 총합 구하기
if score_list[i][3] == 0: # 학점 점수가 0이라면
    fail += 1 # fail = fail+1
average = average / 5 # 학점 점수의 평균 구하기
if fail < 2: # 만약 fail이 2개 미만이라면
    print('평균 학점은 {0}점 입니다.'.format(average)) # 평균 학점 출력
else: # 그렇지 않다면
    print('낙제!') # 낙제! 출력
