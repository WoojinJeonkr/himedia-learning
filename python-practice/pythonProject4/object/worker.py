# 창업문제
# ------
# 직원을 뽑으려고 합니다.
# Worker('홍길동', 25, '남')
# Worker('김길동', 23, '여')
# Worker('박길동', 28, '남')
# Worker('이길동', 21, '남')
# Worker('장길동', 29, '여')
# ------
class Worker:
    name = ''
    age = 0
    gender = ''
    count1 = 0
    count2 = 0
    age = 0

    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender
        if gender == '남':
            Worker.count1 += 1
        else:
            Worker.count2 += 1
        Worker.age += age

    def __str__(self):
        return self.name+ ' ' + \
                str(self.age) + ' ' + \
                self.gender

