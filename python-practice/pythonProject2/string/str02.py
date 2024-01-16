# 주민번호 13자리 입력을 받아서
# 나이와 성별을 판별해보세요.

# 현재 날짜
import datetime
today = datetime.datetime.today()
# print(today.year, today.month, today.day)
# print(today.hour, today.minute, today.second)

sn = input('주민번호 13자리 입력 >> ')
year = sn[:2]
year2 = int(year) + 1900 # int(), float(), str()
print('현재 나이는 ',today.year-year2 + 1,'입니다')
gender = sn[7]
# if gender == '1' or gender == '3':
if gender in ('1','3'):
    print('남자입니다.')
else:
    print('여자입니다.')