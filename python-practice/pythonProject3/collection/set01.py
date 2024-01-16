# 다음은 1학기 점수와, 2학기 점수이다.
jumsu_1 = {100, 99, 88, 77}
jumsu_2 = {90, 99, 88, 66}

# 두 학기 내내 동일한 성적인 점수는?, 과목 수는?
# result = jumsu_1 & jumsu_2 # jumsu_1과 jumsu_2 둘을 비교하여 같은 것을 출력
result = jumsu_1.intersection(jumsu_2) # jumsu_1과 jumsu_2 둘을 비교하여 같은 것을 출력
print('두 학기 내내 동일한 점수는 ',result)
print('두 학기 내내 동일한 과목 수는 ',len(result))

# 두 학기를 비교했을 때 1학기 성적 중 2학기와 다른 성적은?
result2 = jumsu_1.difference(jumsu_2) # jumsu_1과 jumsu_2 둘을 비교하여 다른 것을 출력
print('두 학기 서로 다른 점수는 ',result2)

# 두 학기 동안 내가 획득한 전체 점수 목록은?
result3 = jumsu_1.union(jumsu_2) # | : 버티컬 바
print('전체 점수는 ',result3)

# 전체 점수 정렬
result4 = list(result3) # list()한 결과, 비파괴형 함수, 반환값 있음
print(type(result3))
print(type(result4))
result4.sort() # void, 파괴형 함수, 반환값 없음
print(result4) # 정렬되어 출력
result4.reverse()
print(result4) # 뒤집혀서 출력

# 1학기 성적에 음악 점수 50점 추가
jumsu_1.add(50)
print('1학기 성적은 ',jumsu_1)

# 2학기 성적에 음악 77, 컴퓨터 100점 추가
jumsu_2.update({77,100})
print('2학기 성적은 ',jumsu_2)

# 1학기 성적 모두 삭제
print('1학기 성적은 ',jumsu_1.clear())