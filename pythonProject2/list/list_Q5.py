# 5. 시작값, 끝값을 입력받아
startnum = int(input('시작값 > '))
endnum = int(input('끝값 > '))
# 시작과 끝 사이의 개수를 구하고
count = abs(endnum-startnum+1)
print(count)
# 합계를 구하고
sum = startnum + endnum
print(sum)
# 평균을 구하시오
avg = (startnum+endnum)/2
print(avg)