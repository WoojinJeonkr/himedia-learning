# 프로그래밍 순서
print_data = '''
-----------------
오늘에 대한 정보입니다.
-----------------
'''
print(print_data)
# print('-----------------')
# print('오늘에 대한 정보입니다.')
# print('-----------------')
# 데이터를 입력
weather, hot, night = input('날씨, 온도, 스케쥴 입력 >> ').split(',')
# weather = input('오늘의 날씨는? ')
# temp = input('오늘의 온도는? ') # "10.3"
# schedule = input('오늘 저녁 스케쥴은? ')
# 데이터를 처리
# 데이터를 출력
print('-----------------')
print('오늘은', weather, '하고, ', float(hot)-1, '도이고, ', night, '에 머무를 예정입니다.')