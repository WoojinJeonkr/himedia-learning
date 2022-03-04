# python은 다른 모듈에 있는 함수, 클래스를
# 사용할 때는 import를 해주어야 어디에 있는지
# 위치를 찾는다

# import 패키지.모듈명(파이썬 파일명)

# import function.fun02
# function.fun02.call1()

import function.fun02 as f02
import function.fun01 as f01
f02.call1()