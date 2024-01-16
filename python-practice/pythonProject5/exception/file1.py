# member.txt에 member 정보를 3명 입력받아 넣어보자
# file2.py에서 member.txt를 읽어온 후
# 다음과 같이 출력되도록 해보자.
# 이름       나이      연락처
# --------------------------
# hong      100        011
# park      150        019
# song      200        017

try:
    file = open('member.txt','w')

    for _ in range(3):
        name = input('당신의 이름은 >> ')
        age = input('당신의 나이는 >> ')
        tel = input('당신의 연락처는 >> ')
        data = name + "," + age + "," + tel + "\n"
        one = data.split(',')
        file.write(data)

        print('---------------')

except FileNotFoundError:
    print('파일을 찾을 수 없습니다.')
except IOError:
    print('파일을 읽고 쓰는 과정에서 문제가 발생했습니다.')
except:
    print('파일을 처리하는 과정에서 문제가 발생했습니다..')
finally:
    try:
        file.close()
    except:
        print('closing 과정 중 문제가 발생했습니다.')