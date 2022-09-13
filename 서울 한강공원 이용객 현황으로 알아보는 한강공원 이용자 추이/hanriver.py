# 라이브러리 불러오기
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# 한글 폰트 설정
plt.rc('font', family='NanumGothic')
print(plt.rcParams['font.family'])

# 데이터 가져오기
hanriver = pd.read_csv(
    '서울시 한강공원 이용객 현황 (2009_2013년).csv',
    encoding='cp949'
)

# 상위 5개 확인
hanriver.head()

# 데이터 정보 확인
hanriver.info()

# 데이터 '년도' 컬럼 및 개수 확인
hanriver['년도'].value_counts()

# 한강공원 이용자 합계
people = hanriver[['년도', '구분', '합계']]

# 년도 -- unique로 가져온 값 오름차순으로 정렬
years = sorted(people['년도'].unique())

# 년도 별 이용자 합계를 데이터프레임으로 추출하는 함수 정의
def year_people(i):
    year_i = "year_" + str(years[i].strip('년'))
    year_i = people[people['년도'] == years[i]].set_index('년도')
    year_i = year_i[['구분', '합계']].set_index('구분').T
    year_i = year_i.rename(index={'합계' : years[i]})
    return year_i

# 년도별 이용자 합계
people_df = []
for i in range(len(years)):
    people_df.append(year_people(i))
visited = pd.concat(people_df, axis=0)
visited = visited.reset_index()
visited = visited.rename(columns={'index':'년도'})
visited.set_index('년도')

# 년도별 이용현황 합계 그래프로 시각화
visited.plot.bar(x = '년도', alpha = 0.5, figsize = (20, 5))
plt.title('년도별 각 한강공원 이용자 합계')
plt.xlabel('년도', fontsize = 13)
plt.ylabel('이용자 합계', fontsize = 13)
plt.xticks(fontsize = 12, rotation = 0)
# 합계 그래프 이미지로 저장
plt.tight_layout()
plt.savefig('년도별 각 한강공원 이용자 합계.png', dpi=200, facecolor='#ffffff')

# 2009년 ~ 2013년 한강공원별 이용자 현황
park = hanriver[['구분', '일반이용자', '운동시설', '자전거', '주요행사 및 마라톤', '기타']].groupby('구분').sum()
park.plot(kind = 'barh', figsize = (12, 6), stacked=True)
plt.xlabel('이용자 수', size = 15)
plt.ylabel('한강공원 위치', size = 15)
plt.title('2009년 ~ 2013년 시설 이용자 현황\n', size = 20)
# 합계 그래프 이미지로 저장
plt.tight_layout()
plt.savefig('시설별 각 한강공원 이용자 현황.png', dpi=200, facecolor='#ffffff')

# Insight
# 2009년 ~ 2013년 동안 사람들이 가장 많이 찾은 한강공원은 여의도 한강공원이다.
# 한강공원을 찾는 사람들 중 시설물을 이용하는 사람들보다 일반이용자의 수가 더 많았다.
# 여의도 한강공원은 2011년도에 사람들이 가장 많이 방문했고 뚝섬 한강공원은 2012년도에 가장 많이 방문했다.