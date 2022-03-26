# 1. 다음 코드의 결과값을 작성하시오.(시스템을 사용하지 않고 풀어보세요)
import re
s = 'GeeksforGeeks: A computer science portal for geeks'
match = re.search(r'portal', s)
print('Start Index:', match.start())
print('End Index:', match.end())

# Start Index: 34
# End Index: 40

# 2. 다음 코드의 결과값을 작성하시오.
s = 'aaa@xxx.com'
m = re.match(r'[a-z]+@[a-z]+.[a-z]+', s)
print(m)
print(m)  # 시스템을 돌리셔도 됩니다.

print(type(m))  # 시스템을 사용하지 않고 풀어보세요

# <re.Match object; span=(0, 11), match='aaa@xxx.com'>
# <class 're.Match'>

# 3. 아래와 같이 문자열 중간 중간에 1개 또는 여러 개의 공백이 있다.
'The   quick  brown  fox  jumps   over  the  lazy dog'

# 위의 문자열을 다음과 같이 바꾸고 싶을 때 정규 표현식을 사용하여 바꾸는
# 방법을 코드로 작성하시오
'The quick brown fox jumps over the lazy dog'

# ex) 정규 표현식이 아닌 문자열을 나누고 합치는 방법으로 위의 문자열로 표현하는 방법
str_content = 'The   quick  brown  fox  jumps   over  the  lazy dog'
rr = ' '.join(str_content.split())
print(rr)

# Answer
import re
a = 'The   quick  brown  fox  jumps   over  the  lazy dog'
test_a = ''.join(a)
test_a = re.sub(r'[,\s]+',' ', test_a)
print(test_a)

# 4. can, man, fan을 match하면서 dan,ran,pan은 skip하는 정규식을 작성하시오.

# ([^drp]?[cmf])an

# 5. wazzzzzup, wazzzup을 match하면서 wazup은 skip하는 정규식을 작성하시오.

# waz{2,}up

# 6. aaaabcc, aabbbbc,aacc는 match하면서 a는 skip하는 정규식을 작성하시오.

# a{2,}(b+)?c+

# 7. DD/MM/YY 형태로 작성된 날짜를 탐지하는 정규표현식을 작성해라
# day는 01~31일, month는 01~12월, year은 1000~2999년까지 있다고 가정
# 1, 2, 3 등 숫자 1개의 경우 앞에 0이 붙는다

# 31/02/2012
# 28/03/1934

# ([0-2]\d|3[01])/(0\d|1[0-2])/([12]\d{3})

# 8. 비밀번호 강력한지 확인해라
# 강력한 기준은 최소 길이가 8 이상이고, 대문자와 소문자를 포함해야 하며, 적어도 하나의 숫자가 있어야 한다
# 대문자 및 소문자는 모두 영어 기준이다

# dkssudgk123ABC

# ^(?=.[A-Z])(?=.[a-z])(?=.*[0-9]).{8,}

# 9. 주어진 이메일 주소가 올바른지 판단하도록 만드세요.
# emails 리스트에서 앞의 다섯 개는 올바른 형식이며 마지막 세 개는 잘못된 형식입니다.

# python@mail.example.com
# python+kr@example.com
# python-dojang@example.co.kr
# python_10@example.info
# python.dojang@e-xample.com
# @example.com
# python@example
# python@example-com

# [a-zA-Z0-9+-_.]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+

# 10. 다음의 결과값은?
import re
p = re.compile("[a-z]+")
m = p.search("5 python")
m.start() + m.end()

# 10

# 11. search와 match의 차이점

# match() 함수는 문자열의 처음부터 맞는지 아닌지를 체크하고,
# search() 함수는 문자열 전체 중 맞는 부분이 있는지를 체크한다

# 12. park@naver.com, kim@daum.net, lee@myhome.co.kr
# .com, .net이 아닌 이메일 주소는 제외시키는 정규식을 작성해 보세요

# import re
# pat = re.compile(".[@]...*$")
# print(pat.match("pahkey@gmail.com"))
# print(pat.match(“aaa@gmail.le.live"))
# print(pat.match("kim@daum.net"))
# print(pat.match("lee@myhome.co.kr"))

# .*[@].*[.](?=com$|net$).*$

# 13. "aab_cbbbc", "aab_Abbbc", "Aaab_abbbc"
# 다음 세개의 문자열중 소문자이면서 언더스코어(_) 가 들어간 문자열인지 판단하는 코드를 짜세요

# "[a-z]+_[a-z]+"

# 14. 다음 s의 5를 정규식 five로 바꾸세요
# s = 'They ate 5 apples and 5 oranges'

import re
p = re.compile('5')
s = 'They ate 5 apples and 5 oranges'
s2 = p.sub('FIVE', s)
print(s2)

# 15. Pycharm 없이 다음 코드의 결과값을 생각해보세요!
import re
words = ["Python", "Pantone", "Pontoon", "Pollute", "Pantheon"]
for word in words:
    # the string should begin with "P" and end with "on"
    if re.search("^P.*on$", word):
        print(word, "found!")

# Python,  Pontoon, Pantheon