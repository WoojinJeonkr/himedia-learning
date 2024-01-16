# 라이브러리 가져오기
import pandas as pd
import seaborn as sns
import numpy as np
import matplotlib.pyplot as plt
import bar_chart_race as bcr

# 경고 무시
import warnings
warnings.filterwarnings(action='ignore')

# 한글 폰트 설정
plt.rc('font', family='NanumGothic')

# 데이터 가져오기
kindergarden_year = pd.read_csv('../data/서울시 보육통계 연도별 어린이집 및 아동현황 정보.csv', encoding='cp949')

# 가져온 데이터에서 상위 5개 출력하기
kindergarden_year.head()

# 통계연도를 기준으로 값 오름차순 정렬
kindergarden_year = kindergarden_year.sort_values('통계연도')

# 데이터 추출
year = kindergarden_year[['통계연도', '어린이집수']]


# 어린이집 수 현황 그래프로 표시
x = np.arange(len(year['통계연도']))
plt.bar(x, year['어린이집수'])
plt.xticks(x, year['통계연도'])
plt.title('연도별 어린이집 수 현황')
plt.tight_layout
plt.savefig('연도별-어린이집-수-현황.png')

# 어린이집은 2014년부터 현재에 이르기까지 감소하는 경향을 보이고 있다.
teacher = kindergarden_year[['통계연도', '교직원수', '아동현원']]

# 그래프로 나타내기
fig = plt.figure(figsize=(16, 10))
ax1 = fig.add_subplot()

colors = sns.color_palette('summer', len(teacher['통계연도'])) # 바 그래프 색상

xtick_label_position = list(range(len(teacher['통계연도']))) # x축 눈금 라벨이 표시될 x좌표
ax1.set_xticks(xtick_label_position) # x축 눈금 
ax1.set_xticklabels(teacher['통계연도']) # x축 눈금 라벨
ax1.set_ylabel('어린이집 아동 수', fontsize = 16)
ax1.bar(xtick_label_position, teacher['아동현원'], color = colors) # 바 그래프 출력

color = 'red'
ax2 = ax1.twinx()
ax2.set_ylabel('어린이집 교직원 수', fontsize = 16)
ax2.plot(xtick_label_position, teacher['교직원수'], color = color, linestyle='--', marker='o') # 선 그래프 
ax2.tick_params(axis='y', labelcolor=color) # 눈금 라벨 색상 지정

plt.title('2012년 ~ 2021년 어린이집 교직원 수와 아동 수 비교\n', fontsize = 18) # 제목 지정
plt.tight_layout()
plt.savefig('2012년 ~ 2021년 어린이집 교직원 수와 아동 수 비교.png')

# 2017년에 유치원 교직원 수가 가장 많았다.
# 현재 유치원 교직원 수는 감소 추세에 있다.

# 연도별 남녀 비율 확인
kind = pd.read_csv('../data/서울시 보육통계 어린이집 유형별 영유아 현황(성별구분) 정보.csv', encoding='cp949')
kind.head()
total = kind[['통계연도', '국공립아동수_남', '민간아동수_남', '국공립아동수_여', '민간아동수_여']]
total['아동수_남'] = total['국공립아동수_남'] + total['민간아동수_남']
total['아동수_여'] = total['국공립아동수_여'] + total['민간아동수_여']
total = total.drop(columns=['국공립아동수_남', '민간아동수_남', '국공립아동수_여', '민간아동수_여'])
total.head()
sum_total = total.groupby('통계연도').sum()

# 비교막대그래프 그리기
plt.figure(figsize = (10, 5))
nrow = sum_total.shape[0] # 행의 갯수
idx = np.arange(nrow)
plt.title('연도별 어린이집 남녀 비율\n', fontsize = 18)
plt.xlabel('통계연도', fontsize = 16)
plt.ylabel('어린이집 남녀 수', fontsize=16)
plt.bar(idx-0.125, sum_total['아동수_남'], width=0.25, label = '아동수_남')
plt.bar(idx+0.125, sum_total['아동수_여'], width=0.25, label = '아동수_여')
plt.xticks(idx, sum_total.index)
plt.legend(ncol = 2)
plt.tight_layout()
plt.savefig('연도별 어린이집 남녀 비율.png')

# 자치구별 어린이집 현황 확인
region = pd.read_csv('../data/서울시 보육통계_어린이집 현황(자치구,유형별) 정보.csv', encoding='cp949')
region.head()
region['통계연도'].unique()
region_2021 = region[region['통계연도'] == 2021]
del(region_2021['자치구코드'])
region_2021.columns
kinder_2021 = region_2021.drop(columns=['통계연도', '어린이집수_국공립', '어린이집수_사회복지법인', '어린이집수_법인단체등',
       '어린이집수_민간', '어린이집수_가정', '어린이집수_부모협동', '어린이집수_직장'])
kinder_2021 = kinder_2021.drop(0, axis=0)
kinder_2021 = kinder_2021.sort_values('시설수합계', ascending=False)

# pie chart
plt.pie(kinder_2021['시설수합계'], 
        labels = kinder_2021['자치구명'], 
        labeldistance = 1.1, 
        startangle=15, 
        autopct='%.f%%',
        pctdistance=0.8,
        wedgeprops={"width": 0.33}
)
plt.title('2021년 자치구별 어린이집 현황', fontsize = 18)
plt.tight_layout()
plt.savefig('자치구별 어린이집 현황_pie.png')

# 누적막대그래프
# 데이터 정제
region_year = region[['통계연도', '자치구명', '어린이집수_국공립', '어린이집수_사회복지법인', '어린이집수_법인단체등',
       '어린이집수_민간', '어린이집수_가정', '어린이집수_부모협동', '어린이집수_직장']]
regiony_2021 = region_year[region_year['통계연도'] == 2021]
regiony_2021 = regiony_2021.drop(columns='통계연도')
regiony_2021 = regiony_2021.drop(0, axis=0)
regiony_2021 = regiony_2021.set_index('자치구명')

# barh graph
regiony_2021.plot(kind='barh', figsize = (10, 6), stacked=True, alpha = 0.7)

plt.xlabel('어린이집 수', size = 16)
plt.ylabel('자치구명', size = 16)
plt.title('자치구별 어린이집 현황(유형별)', size = 18)
plt.tight_layout()
plt.savefig('자치구별 어린이집 현황_barh.png')