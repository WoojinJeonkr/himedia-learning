# jumsu_1이라는 원본을 그대로 두고
# jumsu_2를 바꿔보려고 한다

# 기본형 복사
print("---기본형 복사----")
print()

x = 100
y = x
print(x)
print(y)

y = 200
print(x)
print(y)

print()
print("---얕은 복사----")
print()

# 참조형 복사(함수를 사용), 주소가 들어가 있다
# 얕은 복사, 깊은 복사
jumsu_1 = [10, 20, 30]
jumsu_2 = jumsu_1
print(jumsu_1)
print(jumsu_2)
jumsu_2[0] = 99
print(jumsu_1)
print(jumsu_2)

print()
print("---깊은 복사----")
print()

jumsu_3 = jumsu_1.copy() # clone()
jumsu_3[0] = 55
print(jumsu_1)
print(jumsu_3)