# 파일 변수명/이름명.close()는
# 램에 만들어진 connection을 담당하는 stream 객체를
# 메모리에서 지우는 역할을 수행
# close함수를 호출하지 않으면 메모리에 계속 남아있어서
# 반드시 메모리에서 지워주어야 한다.

try:
    # test_file3 = open('test2.txt', 'w') # 기존 내용은 없어지고 overwriting
    test_file3 = open('test2.txt', 'a') # 기존 내용이 없어지지 않고 append
    # result = test_file3.write('hello hi lunch')
    # print(result)
    test_file3.write('hello hi lunch\n') # 줄바뀜(Enter효과)를 주고 싶다면 \n or \r을 이용하자
    test_file3.write('hello2 hi2 lunch2\n')
except FileNotFoundError:
    print('해당 파일을 찾을 수 없음')
except IOError:
    print('읽고 쓰는데 문제가 생겼음')
except:
    print('파일을 처리하는데 문제가 생겼음')
finally:
    try:
        test_file3.close()
    except:
        print("file을 closing하는데 문제가 생김.")