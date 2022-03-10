# data access module
# crud기능
# def 4개 필요!
import pymysql

class DAO:
    # 인스턴스 변수
    conn = None  # 변수 생성된 위치가 중요!
        # 클래스 바로 아래에 생긴 변수는 클래스 안 전체에서 사용 가능
        # 전역 변수(글로벌 변수)
    cur = None

    def __init__(self): #conn, cur
        # 함수 내에서 청므으로 만들어진 변수는
        # 함수 밖에서 인식 불가
        # 변수 위치가 중요!
        # 파이썬에서 변수는 언제 만들어지나??
        # 변수명= 초기값
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

            # 연결된 통로(stream)을 통해, SQL문을 보내보자.
            # 2. 연결된 통로를 지정(접근할 수 있는) 커서 객체를 획득
            self.cur = self.conn.cursor()
        except Exception as e:
            print('db연결 중 에러발생!!')
            print('에러정보>> ', e)

    # def create(id, name, url, img):
    def create(self, vo):

        # 3. sql문을 보내보자.
        sql = "insert into book values (%s, %s, %s, %s)"

        # 커서로 sql문을 보냄.
        result = self.cur.execute(sql, vo)
        print('sql문 전송 결과>', result)

        self.conn.commit()  # create한 것 반영해줘!
        self.conn.close()

    def read(self, id):
        # 3. sql문을 보내보자.
        sql = "select * from book where id = %s"

        # 커서로 sql문을 보냄.
        result = self.cur.execute(sql, (id))
        print('sql문 전송 결과>', result)

        row = self.cur.fetchone()
        print(row)
        self.conn.close()
        return row  # 검색결과를 return!

    def all(self):
        # 3. sql문을 보내보자.
        sql = "select * from book"

        # 커서로 sql문을 보냄.
        result = self.cur.execute(sql)
        print('sql문 전송 결과>', result)

        row = self.cur.fetchall()  # 모두 꺼내!
        print(row)
        self.conn.close()
        return row  # 검색결과를 return!

    def update(self, vo):
        # 3. sql문을 보내보자.
        sql = "update book set name = %s where id = %s"

        # 커서로 sql문을 보냄.
        result = self.cur.execute(sql, vo)
        print('sql문 전송 결과>', result)

        self.conn.commit()  # update한 것 반영해줘!
        self.conn.close()

    def delete(self, vo):
            # 3. sql문을 보내보자.
            sql = "delete from book where id = %s"

            # 커서로 sql문을 보냄.
            result = self.cur.execute(sql, vo)
            print('sql문 전송 결과>', result)

            self.conn.commit()  # delete한 것 반영해줘!
            self.conn.close()