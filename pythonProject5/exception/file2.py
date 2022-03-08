try:
    file = open('member.txt','r')
    lines = file.readlines() # ['','','']
    print('이름\t\t나이\t\t연락처')
    print('--------------------------')
    for line in lines: # for _ in range(len(lines)):
        one = line.split(',')
        print(one[0].strip()+'\t'+one[1].strip()+'\t\t'+one[2].strip())
except:
    print('파일을 처리하는 과정에서 문제가 발생했습니다..')
finally:
    try:
        file.close()
    except:
        print('closing 과정 중 문제가 발생했습니다.')