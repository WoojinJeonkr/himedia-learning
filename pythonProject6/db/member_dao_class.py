import pymysql

class DAO:
    conn = None
    cur = None

    def __init__(self):  # conn, cur
        try:
            self.conn = pymysql.connect(
                host='localhost',
                port=3366,
                user='root',
                password='1234',
                db='big',
                charset='utf8'
            )

            print('연결 성공!!', self.conn.host_info)
            self.cur = self.conn.cursor()
        except Exception as e:
            print('db연결 중 에러발생!!')
            print('에러정보>> ', e)
    def sign_up(self, vo):
        # 3. sql문을 보내보자
        sql = "insert into member values(%s,%s,%s,%s)"

        # 커서로 sql문을 보냄
        result = self.cur.execute(sql, vo)
        print('sql문 전송 결과>> ', result)

        self.conn.commit()  # insert한 것을 반영
        self.conn.close()  # conn 종료
        return result

    def search(self, id):

        # 3. sql문을 보내보자
        sql = "select * from member where id = %s"

        # 커서로 sql문을 보냄
        result = self.cur.execute(sql, (id))
        print('sql문 전송 결과>> ', result)

        row = self.cur.fetchone()
        print(row)
        self.conn.close()  # conn 종료
        return row # 검색 결과를 return!

    def login(self, vo):

        # 3. sql문을 보내보자
        sql = "select * from member where id = %s and pw = %s"

        # 커서로 sql문을 보냄
        result = self.cur.execute(sql, vo)
        print('sql문 전송 결과>> ', result)

        row = self.cur.fetchone()
        print(row)
        self.conn.close()  # conn 종료
        return row # 검색 결과를 return!

    def sign_out(self, id):

        sql = "delete from member where id = %s"
        result = self.cur.execute(sql, id)
        print('sql문 전송 결과>> ', result)
        self.conn.commit()
        self.conn.close()
