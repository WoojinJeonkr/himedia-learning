# 1. 문자열 관련 함수중 .find(), .index()의 차이는?
#    find():찾는 문자가 없는 경우에 -1을 출력한다.
#           리스트, 튜플, 딕셔너리 자료형에서는 find 함수를 사용할 수 없다.
#    index():찾는 문자가 없는 경우에 ValueError 에러가 발생한다.
#            문자열, 리스트, 튜플 자료형에서 사용 가능하고 딕셔너리 자료형에는 사용할 수 없다.

# 2. dict_keys 객체의 반환값은?
#    리스트나 딕셔너리는 가변값이므로 key 값이 될 수 없다. 반환값은 불변값 튜플이다.

# 3. 불 자료형에서 string이나 int, list, 를 넣었을때 True, False 구분법은?
#    빈 문자열(""): False, 공백만 있는 문자열(" "): False, 값이 있는 문자열("abc"): True
#    빈 리스트([]): False, 값이 있는 리스트([1, 2]): True, 숫자 1: True, 숫자 0: False
#    숫자 -1: True, 비어있는 딕셔너리({}): False, 비어있는 튜플(()): False

# 4.
# year = 2022
# month = 10
# day = 29
# date_string = "오늘은 {}년 {}월 {}일입니다."
# print(date_string.format(year,month,day+10))
# 을 했을 때 위와 같이 day 수가 31이 넘어가면 자동으로 month+1한뒤 8일로 표시 되도록 하는 방법은?

import datetime
year = 2022
month = 10
day = 29
date_string = "오늘은 {}년 {}월 {}일입니다."
print(date_string.format(year,month,day+10))

x = datetime.date(2022, 10, 29)
answer = x + datetime.timedelta(days=10)
print(answer)
day = answer.day
month = answer.month
year = answer.year
print(date_string.format(year,month,day))

# 5.
# print(type(3 > 1)) 을 해주면, <class 'bool'>이 나옵니다.
# 저는 True 라고 출력되는 값의 자료형이 궁금해서 print(type(print(3 > 1)))을 해봤는데요, True 와<class 'NoneType'>가 나왔습니다.
# True는 왜 나온 것이고, Nonetype은 무엇인가요?

# --> print(type(print(3 > 1))) 부분에서 print(3 > 1)는 Bool타입으로 True가 반환되서 print되어 True가 프린트 된 것이고,
# print는 type이 없어서 NoneTypeError가 떴다. NonetypeError은 타입을 지정할수 없는 값의 타입을 구하려 했을때 나오는 에러이다.

# 6.
# print(type(4/2))
# 다음을 실행하면 float이 나오는 이유는?
# --> 컴퓨터는 부동소숫점이라는 제한적인 숫자 범위에서 계산하다보니 정확한 계산보단 아주 근접한 계산을 하게 되어 있다.
#     그러므로 python에서는 나누었을 경우 float로 처리하도록 되어있다.

# 7. 리스트 관련 함수 중 sort를 하면 오름차순으로 정렬이 되는데 내림차순으로 하는 법?
#    오름차순으로 정렬되는 sort에서 reverse값을 True로 주면 내림차순으로 정렬된다.
#    --> sort(reverse=True)

# 8. 정렬을 하면 어떠한 순서로 정렬이 되는가? ex) “a“ “b“ “A“ “B“, “1“, “2“, “가“, “나“
#    문자의 sort() 기준은 아스키코드표에 각 문자에 대응하는 숫자에 따라 판단을 하게 된다.
#    따라서, "1"(49),"2"(50),"A"(65),"B"(66),"a"(97),"b"(98),"가"(44032),"나"(45208) 순으로 정렬된다.
# 다음은 입력받은 문자열에 대해 아스키코드 번호를 알려주는 코드이다.
str1 = input("문자열을 입력하세요 : ")
for i in range(len(str1)):
    print("입력하신 문자 %c에 대한 아스키코드 = %d" % (str1[i], ord(str1[i])))

# 9. 리스트 안에 튜플을 넣을 수 있는가? 튜플 안에 리스트를 넣을 수 있는가?
#    넣을수 있다면 튜플은 변하지 않는 값인데 리스트 안에 튜플은 변경할 수 있는가?
#    튜플 안에 리스트 값은 변경할 수 있는가?
#    --> 리스트 안에 튜플을 넣을 수 있고 튜플 안에 리스트를 넣을 수 있다.
#        튜플은 내용을 변경할 수 없으므로 리스트의 요소만 변경할 수 있다.

# 10. 깊은 복사, 얕은 복사의 차이
#     얇은 복사는 기존 값이 변하면 복사된 변수값도 변하는 반면 깊은 복사는 기존 값이 변해도 값이 변하지 않는다.

# 11. 진수 변환 방법
#     2진수로 변환: format('변환할 수', 'b'), 8진수로 변환: format('변환할 수', 'o'), 16진수로 변환: format('변환할 수', 'x')
#     bin()을 통해 10진수를 2진수로 변환할 수도 있다.
#     bin() 함수는 문자열을 반환하는데 반하여 format() 함수는 값만을 반환한다.
x = 10
x2 = bin(x)
print('bin()을 통한 x의 값은', x2) # bin()을 통한 x의 값은 0b1010
x3 = int(x2[2:])
print('bin()을 통한 x의 2진수 값은', x3) # bin()을 통한 x의 2진수 값은 1010
x4 = format(x, 'b')
print('format()을 통한 x의 2진수 값은', x4) # format()을 통한 x의 2진수 값은 1010
#     10진수로 반환: int()를 사용하여 반환한다. int()는 기본적으로 int('변환할 수', 10)이므로 10진수의 정수값을 반환한다.

# 12. 딕셔너리 자료형 설명하는 부분
#     Key에 List나 Dictionary를 쓸 수없지만 튜플은 가능 (List, Dictionary는 변할수 있기 때문에 불가)
# --> 딕셔너리는 key를 통해 value값을 얻는다.
#     딕셔너리의 가장 큰 특징 중 하나는 key값에 List나 Dictionary를 쓸 수 없지만 튜플은 가능하다는 것이다.
#     key값은 변하면 안되는 값이므로 값이 변할 수 있는 List나 Dictionary는 쓸 수 없지만 값을 수정하지 못하는 튜플은 가능하다.
#    딕셔너리에서 key 값을 통해 value를 얻을 수 있고 딕셔너리의 값을 수정하고 분류하는 등 다양한 동작을 할 수 있다.

# 13. 리스트 관련 함수들에서 append도 추가 기능이고 extend도 확장이라고 적혀있지만 결과적으로는 요소 추가인데 둘의 차이는 무엇인가?
# --> a = [1,2,3]
#     a.append([4,5])         ->      [1, 2, 3, [4, 5]]
#     a.extend([4,5])         ->      [1, 2, 3, 4, 5]
# 위와 같이 list를 append했을때는 list안에 list형식으로 들어가지만, extend를 썻을땐 기존 list가 연장되서 요소만 따로 추가된다.