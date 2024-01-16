food = ['coffee', 'water']

try:
    food[2] = 'juice' # 에러 가능성이 있는 코드 블록
except IndexError as index: # 제일 작은 에러부터 처리한다
    print(index) # 에러 정보를 출력
    food[0] = 'juice' # IndexError 발생 시 처리할 코드
    print(food) # 예외처리한 내용 출력
except ZeroDivisionError:
    print('특별히 예외 처리할 내용이 없음')
except: # 명시되어 있지 않더라도 또다른 에러들을 위해 명시
    pass
finally:
    print('"필요한 예외 처리를 하였음"')