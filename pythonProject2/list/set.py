# 중복을 제거하고 싶을 때
import random

food_list = ['감자', '감자', '고구마']
food_list2 = set(food_list)
print(food_list2) # set으로 생성
food_list3 = list(food_list2)
print(food_list3) # list로 생성

food_list4 = set()
food_list4.add('coffee')
food_list4.add('coffee')
food_list4.add('water')
print(food_list4)
food_list5 = list(food_list4)
print(food_list5)

number_list = set()
for _ in range (1000):
    number_list.add(random.randint(1, 1001)) # 1 ~ 1000 중 난수를 number_list에 넣음
print(number_list) # number_list 출력
print(len(number_list)) # number_list의 개수