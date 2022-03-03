# 한 판매 회사에서는 판매 실적 점수와 고객 평가 점수를 통해 우수 제품을 선발하고자 한다.
# 판매 실적 점수가 4 이상이고 고객 평가 점수가 4 이상인 제품은 우수 제품이 되고, 두 점수 모두 4 미만인 제품은 판매중지 목록에 들어가게 된다.
# 이때, 우수 제품을 출력하고 로션이 판매 중지에 해당하는지 판단하는 프로그램을 작성해보자.

pro_no=[] # 판매 중지 제품
pro_yes=[] # 우수 제품

PL = ['로션','샴푸','치약','세제','비누']
# [0,0]: 앞의 0은 판매 실적 점수를, 뒤의 0은 고객 평가 점수를 의미한다.
score = [[4,4], [3,5],[1,3],[5,5],[1,4]] # [[]] : 2차원 행렬

# 판매 실적 점수와 고객 평가 점수를 기준과 비교하고 분류
if score[0][0]< 4 and score[0][1] < 4:
    pro_no.append(PL[0])
elif score[0][0] >= 4 and score[0][1] >= 4:
    pro_yes.append(PL[0])
else:
    pass

if score[1][0] < 4 and score[1][1] < 4:
    pro_no.append(PL[1])
elif score[1][0] >= 4 and score[1][1] >= 4:
    pro_yes.append(PL[1])
else:
    pass

if score[2][0] < 4 and score[2][1] < 4:
    pro_no.append(PL[2])
elif score[2][0] >= 4 and score[2][1] >= 4:
    pro_yes.append(PL[2])
else:
    pass

if score[3][0] < 4 and score[3][1] < 4:
    pro_no.append(PL[3])
elif score[3][0] >= 4 and score[3][1] >= 4:
    pro_yes.append(PL[3])
else:
    pass

if score[4][0] < 4 and score[4][1] < 4:
    pro_no.append(PL[4])
elif score[4][0] >= 4 and score[4][1] >= 4:
    pro_yes.append(PL[4])
else:
    pass

print('우수 제품은 ',pro_yes,'이고','판매 중지 제품은 ',pro_no,'입니다.')

