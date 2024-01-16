# 1. 감자, 고구마, 양파를 순서대로 입력받아 food 리스트에 넣으세요
food = []
for _ in range(3):
    menu = input('음식을 입력하세요 > ')
    food.append(menu)
# 1) 고구마 프린트
print(food[1])
# 2) 감자, 고구마 프린트
print(food[0:2])
# 3) 고구마, 양파 프린트
print(food[1:])
# 4) 감자를 라면으로 수정
food[0] = '라면'
# 5) 수정된 내용 프린트
print(food)
