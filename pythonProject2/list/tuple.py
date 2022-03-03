# tuple은 read_only한 리스트를 만들고 싶을 때 사용

food_list = ['coffee', 'water', 'orange']
food_list2 = tuple(food_list)
# food_list2[0] = 'icecream' # 'tuple' object does not support item assignment >> 바뀌지 않음

def yes(): # def: 함수 정의 = function
    x = 100
    y = 200
    return (x, y)
result = yes()
print(result) # (100, 200) >> tuple 형식으로 출력
result2 = list(result)
print(result2) # [100, 200] >> list 형식으로 출력