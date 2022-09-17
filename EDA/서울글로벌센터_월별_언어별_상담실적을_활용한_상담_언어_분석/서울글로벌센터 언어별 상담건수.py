# 라이브러리 가져오기
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

# 경고 무시
import warnings
warnings.filterwarnings(action='ignore')

# 한글 폰트 설정
plt.rc('font', family='NanumGothic')

# 데이터 불러오기
consulting = pd.read_csv('서울글로벌센터 월별 언어별 상담실적.csv', encoding="cp949")

# 값이 중복된 컬럼 삭제
del(consulting['기관/유형'])

# 값이 없는 컬럼 삭제
consulting = consulting.replace(0, np.NaN) # 0으로 표시된 값 NaN으로 변환
consulting.isnull().sum() # NaN값 조회
# 프랑스어, 네팔어, 파키스탄어, 기타언어에 0으로 표시된
# 값이 있다는 것을 알 수 있다.
del(consulting['프랑스어'])
del(consulting['네팔어'])
del(consulting['파키스탄어(우르두어)'])
del(consulting['기타언어'])

# 년월 컬럼 데이터 타입을 문자열로 변환
consulting['년월'] = consulting['년월'].astype('str')

# 날짜 표시 방법 변경(ex.201907 --> 2019-07)
for i in range(len(consulting['년월'])):
    consult_date = consulting['년월'][i]
    consulting['년월'][i] = consult_date[0:4] + "-" + consult_date[4:6]

# 데이터 정렬
consulting = consulting.set_index('년월') # 년월 컬럼을 인덱스로 설정
consulting = consulting.sort_index(ascending = True) # 인덱스 오름차순 정렬
consulting.head()

# 상담 언어 분포
sum_consulting = consulting.sum()[0:17]
language = pd.DataFrame(list(sum_consulting.values),
                        index = list(sum_consulting.index),
                        columns=["내역"]
                        )
value = []
for i in range(len(language.values)):
    value.append(language.values[i][0])
wedgeprops = {'width': 0.9, 'edgecolor': 'w', 'linewidth': 5}
plt.title('상담 언어 분포', fontsize=20)
plt.pie(value[0:13], labels = language.index[0:13], autopct='%.1f%%', wedgeprops = wedgeprops)
plt.tight_layout()
plt.savefig('상담 언어 분포.png', dpi=200, facecolor='#ffffff')

# 날짜별 상담 내역 합계
plt.figure(figsize=(10, 6))
line_graph = plt.plot(consulting.index, consulting['합계'], 'o-', color="green")
plt.xticks(rotation = 45)
for i in range(len(consulting.index)):
    height = consulting['합계'][i]
    plt.text(consulting.index[i], height + 0.35, '%.f' %height, ha='center', va='bottom', size = 12)
plt.title('날짜별 상담 내역 합계\n', size = 25)
plt.tight_layout()
plt.savefig('날짜별 상담 내역 합계.png', dpi=200, facecolor='#ffffff')

# 날짜별 상담 언어 내역
import bar_chart_race as bcr
bcr.bar_chart_race(consulting.iloc[:, 0:9],
                   steps_per_period = 20,
                   title = '날짜별 상담 언어 내역',
                   filename = "날짜별_상담_언어_내역.mp4"
                   )