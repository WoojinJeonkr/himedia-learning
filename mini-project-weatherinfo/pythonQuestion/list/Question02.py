# 8. [1, 3, 5, 4, 2] 리스트를 [5, 4, 3, 2, 1]로 만들어 보자.
a = [1, 3, 5, 4, 2]
a.sort()
a.reverse()
print(a)

# 9. ['Life', 'is', 'too', 'short'] 리스트를
#    Life is too short 문자열로 만들어 출력해 보자.
b = ['Life', 'is', 'too', 'short']
b = ' '.join(b)
print(b)

# 10. (1,2,3) 튜플에 값 4를 추가하여 (1,2,3,4)를 만들어 출력해 보자.
c = (1,2,3)
c = c + (4,)
print(c)

# 11. 딕셔너리 a에서 'B'에 해당되는 값을 추출해 보자.
# >>> a = {'A':90, 'B':80, 'C':70}
a = {'A':90, 'B':80, 'C':70}
result = a.pop('B')
print(result)

# 12. a 리스트에서 중복 숫자를 제거해 보자.
a = [1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5]
result2 = set(a)
print(result2)
