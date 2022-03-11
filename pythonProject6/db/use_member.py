import sys
from db.member_dao import *

if __name__ == '__main__':
    choice1 = input('1)회원 가입 2)회원 정보 검색, 3)로그인 처리, 4)회원 탈퇴>> ')
    if choice1 == '1':
        vo = input('id, pw, name, tel>> ').split(',')
        sign_up(vo)
    elif choice1 == '2':
        id = input('id 입력>> ')
        print('id: ', id)
        row = search(id)

    elif choice1 == '3':
        id = input('id 입력>> ')
        pw = input('pw 입력>> ')
        vo = (id,pw)
        if vo == login(vo):
            print('로그인되었습니다.')
        else:
            print('로그인 실패!!!')

    elif choice1 == '4':
        id = input('id 입력>> ')
        print(id)
        sign_out(id)
    else:
        sys.exit(0) # 종료