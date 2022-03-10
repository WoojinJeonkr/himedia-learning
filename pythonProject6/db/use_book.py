# 북마크 테이블에 대한 crud 실행
# from db import dao
# from 패키지 import 모듈
# --> 모듈, 함수(), 모듈.클래스명()
import sys
from tkinter import messagebox
from db.dao_func import * # db.dao 안의 함수들을 모두 사용
# from 패키지명, 모듈명 import 함수명, 클래스명, *
# --> 함수()

if __name__ == '__main__':
    choice = input('crud 중 선택>> 1)create 2)read(one) 3)read(all) 4)update 5)delete>> ')
    if choice == '1':
        vo = input('id, name, url, img>> ').split(',')
        # id = input('id 입력>> ')
        # name = input('name 입력>> ')
        # url = input('url 입력>> ')
        # img = input('img 입력>> ')
        # vo = (id, name, url, img)
        # create(id, name, url, img)
        create(vo)
    elif choice == '2':
        id = input('id 입력>> ')
        print('id: ', id) # 입력한 id를 확인하기 위해 출력
        row = read(id) # id를 주면서 검색하라고 요청
        messagebox.showinfo('결과', '검색 결과는 '+row[0]+','+
                                                row[1]+','+
                                                row[2]+','+
                                                row[3]
                            )
    elif choice == '3':
        all = all() #((),(),(),())
        # 출력
        print('id   name        url     img')
        print('----------------------------')
        for one in all:
            print('%s   %s      %s      %s' % one) # one의 type: tuple ---> %s에 one의 값이 하나씩 들어간다.
    elif choice == '4':
        vo = input('name, id 입력>> ').split(',')
        print(vo) # 입력한 vo 정보를 확인하기 위해 출력
        update(vo) # vo 정보로 update
    elif choice == '5':
        vo = input('id 입력>> ')
        print(vo)
        delete(vo)
    else:
        sys.exit(0) # 종료