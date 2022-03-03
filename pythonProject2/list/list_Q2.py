# 2. month = 10입니다. 계절을 프린트
# 3~5: 봄, 6~8:여름, 9~11:가을, 12~2:겨울

import datetime
today = datetime.datetime.today()
month = today.month
if month == 12 or 1 <= month <= 2:
    print('겨울')
elif 3 <= month <= 5:
    print('봄')
elif 6 <= month <= 8:
    print('여름')
elif 9 <= month <= 11:
    print('가을')
else:
    print('존재하지 않습니다')
