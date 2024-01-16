class Bike:
    # 멤버변수 3개
    speed = 0
    location = ''
    person = 0

    # 이니셜라이저
    def __init__(self, speed, person, location):
        self.speed = speed
        self.person = person
        self.location = location

    # 멤버함수 3개
    def start(self):
        print('start!')
    def stop(self):
        print('stop!')
    def speed_up(self):
        return 10

    def __str__(self):
        return str(self.speed) + ' ' + self.location + ' ' + str(self.person)
    # 객체 1개 b1만 생성해서, 멤버 변수값 넣고, 프린트
    # 멤버함수 2개 이상 호출(리턴 x, 리턴 o)

class Car:
    # 멤버변수
    color = ''
    shape = ''

    # 이니셜라이저(멤버 변수 초기화할 목적으로 만들어두는 함수)
    # 객체 생성 시 자동호출됨.
    def __init__(self, shape, color):
        self.shape = shape
        self.color = color

    # 멤버함수
    def speed_up(self):
        print(self.color+'색인 자동차의 속도를 up!')
    def speed_down(self):
        print(self.color+'색인 자동차의 속도를 down!')

    def __str__(self):
        return self.color + ', ' + self.shape