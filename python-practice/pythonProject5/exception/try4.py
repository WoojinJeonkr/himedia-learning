# 파일 변수명/이름명.close()는
# 램에 만들어진 connection을 담당하는 stream 객체를
# 메모리에서 지우는 역할을 수행
# close함수를 호출하지 않으면 메모리에 계속 남아있어서
# 반드시 메모리에서 지워주어야 한다.

try:
    # test_file2 = open('test.txt', 'r')
    test_file2 = open('test2.txt', 'r')
    # one = test_file2.readline() # readline()은 파일에서 한 줄 씩 읽어온다.
    # print(one)
    # one2 = test_file2.readline()
    # print(one2)
    # one3 = test_file2.readline()
    # print(one3)
    lines = test_file2.readlines() # readlines()는 파일의 모든 줄을 읽어서 각각의 줄을 요소로 갖는 리스트로 돌려준다.
    # print(lines)
    for line in lines:
        print(line)
except FileNotFoundError:
    print('해당 파일을 찾을 수 없음')
except IOError:
    print('읽고 쓰는데 문제가 생겼음')
except:
    print('파일을 처리하는데 문제가 생겼음')
finally:
    try:
        test_file2.close()
    except:
        print("file을 closing하는데 문제가 생김.")