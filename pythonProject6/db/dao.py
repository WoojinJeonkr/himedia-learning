# data access module
# crud 기능
# def 4개 필요!
import pymysql

def create(vo):
    try:
        # db 연결 connect()
        conn = pymysql.connect(
            host='localhost',  # 연결할 host명
            port=3366,  # 연결할 port 번호
            user='root',  # 연결할 user명
            password='1234',  # 연결할 user의 비밀번호
            db='big',  # 연결할 db명
            charset='utf8'  # encoding
        )

        print('1. 연결 성공!!!', conn.host_info)  # conn.host_info: conn의 host 정보

        # 연결된 통로(stream)를 통해, SQL문을 보내보자
        # 2. 연결된 통로를 지정(접근)할 수 있는 커서 객체를 획득
        cur = conn.cursor()

        # 3. sql문을 보내보자
        sql = "insert into book values(%s,%s,%s,%s)"

        # 커서로 sql문을 보냄
        result = cur.execute(sql, vo)
        print('sql문 전송 결과>> ', result)

        conn.commit()  # insert한 것을 반영
        conn.close()  # conn 종료

    except Exception as e:
        print('db 연결 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력

def read(id):
    try:
        # db 연결 connect()
        conn = pymysql.connect(
            host='localhost',  # 연결할 host명
            port=3366,  # 연결할 port 번호
            user='root',  # 연결할 user명
            password='1234',  # 연결할 user의 비밀번호
            db='big',  # 연결할 db명
            charset='utf8'  # encoding
        )

        print('연결 성공!!!', conn.host_info)

        # 연결된 통로(stream)를 통해, SQL문을 보내보자
        # 2. 연결된 통로를 지정(접근)할 수 있는 커서 객체를 획득
        cur = conn.cursor()

        # 3. sql문을 보내보자
        sql = "select * from book where id = %s"

        # 커서로 sql문을 보냄
        result = cur.execute(sql, (id))
        print('sql문 전송 결과>> ', result)

        # read인 경우, 커서로 연결 통로(stream)에 있는 검색 결과를 꺼내주어야 한다.
        row = cur.fetchone() # fetchone(): row 하나만 꺼내오기
        print(row)
        # select는 commit하지 않는다.(반영할 것이 없으므로...)
        conn.close()  # conn 종료
        return row # 검색 결과를 return!

    except Exception as e:
        print('db 연결 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력

def all():
    try:
        # db 연결 connect()
        conn = pymysql.connect(
            host='localhost',  # 연결할 host명
            port=3366,  # 연결할 port 번호
            user='root',  # 연결할 user명
            password='1234',  # 연결할 user의 비밀번호
            db='big',  # 연결할 db명
            charset='utf8'  # encoding
        )

        print('연결 성공!!!', conn.host_info)

        # 연결된 통로(stream)를 통해, SQL문을 보내보자
        # 2. 연결된 통로를 지정(접근)할 수 있는 커서 객체를 획득
        cur = conn.cursor()

        # 3. sql문을 보내보자
        sql = "select * from book order by id asc"

        # 커서로 sql문을 보냄
        result = cur.execute(sql)
        print('sql문 전송 결과>> ', result)

        # read인 경우, 커서로 연결 통로(stream)에 있는 검색 결과를 꺼내주어야 한다.
        # row = cur.fetchone() # fetchone(): row 하나만 꺼내오기
        row = cur.fetchall() # fetchone(): 많이 꺼내오기
        # row = cur.fetchmany(5) # fetchone(): row 개수를 정해서 꺼내오기
        print(row)
        # select는 commit하지 않는다.(반영할 것이 없으므로...)
        conn.close()  # conn 종료
        return row # 검색 결과를 return!

    except Exception as e:
        print('db 연결 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력

def update(vo):
    try:
        conn = pymysql.connect(
            host='localhost',  # 연결할 host명
            port=3366,  # 연결할 port 번호
            user='root',  # 연결할 user명
            password='1234',  # 연결할 user의 비밀번호
            db='big',  # 연결할 db명
            charset='utf8'  # encoding
        )

        print('연결 성공!!!', conn.host_info)

        cur = conn.cursor()
        sql = "update book set name = %s where id = %s"
        result = cur.execute(sql, vo)
        print('sql문 전송 결과>> ', result)
        conn.commit()
        conn.close()
    except Exception as e:
        print('update 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력

def delete(vo):
    try:
        conn = pymysql.connect(
            host='localhost',  # 연결할 host명
            port=3366,  # 연결할 port 번호
            user='root',  # 연결할 user명
            password='1234',  # 연결할 user의 비밀번호
            db='big',  # 연결할 db명
            charset='utf8'  # encoding
        )

        print('연결 성공!!!', conn.host_info)

        cur = conn.cursor()
        sql = "delete from book where id = %s"
        result = cur.execute(sql, vo)
        print('sql문 전송 결과>> ', result)
        conn.commit()
        conn.close()
    except Exception as e:
        print('delete 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력