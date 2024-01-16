import pymysql

def sign_up(vo):
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

        print('연결 성공!!!', conn.host_info)  # conn.host_info: conn의 host 정보

        # 연결된 통로(stream)를 통해, SQL문을 보내보자
        # 2. 연결된 통로를 지정(접근)할 수 있는 커서 객체를 획득
        cur = conn.cursor()

        # 3. sql문을 보내보자
        sql = "insert into member values(%s,%s,%s,%s)"

        # 커서로 sql문을 보냄
        result = cur.execute(sql, vo)
        print('sql문 전송 결과>> ', result)

        conn.commit()  # insert한 것을 반영
        conn.close()  # conn 종료

    except Exception as e:
        print('db 연결 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력

def search(id):
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
        sql = "select * from member where id = %s"

        # 커서로 sql문을 보냄
        result = cur.execute(sql, (id))
        print('sql문 전송 결과>> ', result)

        row = cur.fetchone()
        print(row)
        conn.close()  # conn 종료
        return row # 검색 결과를 return!

    except Exception as e:
        print('db 연결 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력

def login(vo):
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
        sql = "select * from member where id = %s and pw = %s"

        # 커서로 sql문을 보냄
        result = cur.execute(sql, vo)
        print('sql문 전송 결과>> ', result)

        row = cur.fetchone()
        print(row)
        conn.close()  # conn 종료
        return row # 검색 결과를 return!

    except Exception as e:
        print('db 연결 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력

def sign_out(id):
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
        sql = "delete from member where id = %s"
        result = cur.execute(sql, id)
        print('sql문 전송 결과>> ', result)
        conn.commit()
        conn.close()
    except Exception as e:
        print('delete 중 에러 발생')  # 에러가 발생할 경우 프린트
        print('에러 정보>> ', e)  # 어떤 에러가 발생했는지 정보 출력