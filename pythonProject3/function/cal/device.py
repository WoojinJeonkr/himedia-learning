# 입력, 처리내용, 반환
# add(100, 200) => 사용
def add(x, y = 555): # => 실행, x, y => 매개변수(파라메터), x, y의 default 값은 555
    return x + y

def minus(x, y):
    return x - y

# 함수 이름을 하나로 동일하게 쓸 수 없다.
# 다형성(오버로딩)을 지원하지 않음
# def minus(x):
#     return x - 100

def mul(x, y):
    return x * y

def div(x, y):
    return x // y