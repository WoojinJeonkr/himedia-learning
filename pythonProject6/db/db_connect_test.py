import pymysql

try:
    # db 연결 connect()
    conn = pymysql.connect(
        host='localhost', # 연결할 host명
        port= 3366, # 연결할 port 번호
        user='root', # 연결할 user명
        password='1234', # 연결할 user의 비밀번호
        db= 'big', # 연결할 db명
        charset='utf8' # encoding
    )

    print('1. 연결 성공!!!', conn.host_info) # conn.host_info: conn의 host 정보

    # 연결된 통로(stream)를 통해, SQL문을 보내보자
    # 2. 연결된 통로를 지정(접근)할 수 있는 커서 객체를 획득
    cur = conn.cursor()

    # 3. sql문을 보내보자
    sql = "insert into book values('5','hi','http://www.himedia.com','hi.png')"

    # 커서로 sql문을 보냄
    result = cur.execute(sql)
    print('sql문 전송 결과>> ', result)

    conn.commit() # insert한 것을 반영
    conn.close()  # conn 종료

except Exception as e:
    print('db 연결 중 에러 발생') # 에러가 발생할 경우 프린트
    print('에러 정보>> ', e) # 어떤 에러가 발생했는지 정보 출력

