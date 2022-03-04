hobby = {10: ['game', 'picture'], 20 : ['tour', 'run', 'coding']}
# 10대의 취미 목록을 프린트
print('10대의 취미 목록은 ',hobby[10])
# 20대의 취미 목록을 프린트
print('20대의 취미 목록은 ',hobby[20])
# 20대의 취미 목록을 카운트
print('20대의 취미 목록은 ',len(hobby[20]),'개입니다.')

print('-------------------------------------')

hobby2 = {10: {'아침':'game', '저녁':'picture'}, 20 : ['tour', 'run', 'coding']}
s100 = hobby2[10]
print('10대의 취미 목록은 ',s100)
s1000 = s100['저녁']
print('10대의 저녁 취미 목록은 ',s1000)

print('-------------------------------------')

hobby3 = [{10: {'아침':'game', '저녁':'picture'}},{20: {'아침':'coffee', '저녁':'tour'}}]
n20 = hobby3[1]
print('20대의 취미 전체 목록은 ',n20)
n200 = n20[20]
print('20대의 취미 상세 목록은 ',n200)
n2000 = n200['저녁']
print('20대의 저녁 취미 목록은 ',n2000)

print('-------------------------------------')

food = {'아침':'토스트','점심':'한정식','저녁':'스프'}
print('아침의 값은 ',food['아침']) # 값을 확인할 때 : 딕셔너리 이름 [키]
food['아침'] = '커피' # 값을 수정할 때
print('전체 목록은 ',food)
food['간식'] = '쿠키' # 값을 추가
print('전체 목록은 ',food)
del food['간식']
print('전체 목록은 ',food)

# dic를 for-each 문으로 돌렸을 때는 key만 가지고 온다.
for key in food:
    print(key, ':', food[key])

print('-------------------------------------')

dict1 = {100 : 'hong', 200 : 'kim'}
print('dict1에서 100의 키 값은 ',dict1[100])
print('dict1에서 100의 키 값은 ',dict1.get(100))

for key in dict1:
    print(key, ':', dict1[key])

key_list = dict1.keys()
print('데이터 타입은 ',type(key_list),'이고 결과는 ',key_list,'입니다')
key_list2= list(key_list)
print('데이터 타입은 ',type(key_list2),'이고 결과는 ',key_list2,'입니다')

key_value = dict1.values()
print('데이터 타입은 ',type(key_value),'이고 결과는 ',key_value,'입니다')
key_value2= list(key_value)
print('데이터 타입은 ',type(key_value2),'이고 결과는 ',key_value2,'입니다')

print('dict1에 100이 있나요? ',100 in dict1) # 결과는 bool
# 회원 명단 중에서 500이 있나요?
if 500 in dict1:
    print('500 회원이 존재합니다.')
else:
    print('그런 회원은 없습니다.')