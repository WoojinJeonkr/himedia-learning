class Worker2:
    name = ''
    age = 0
    gender = ''
    count = 0 #직원수 누적
    age_sum = 0 #나이 누적
    m = 0 #성별누적
    f = 0 #성별누적
    def __init__(self, name, age, gender):
        self.name = name
        self.age = age
        self.gender = gender
        Worker2.count += 1
        Worker2.age_sum += age
        if gender == '남':
            Worker2.m += 1
        else:
            Worker2.f += 1

    def __str__(self):
        return self.name + ' ' + \
               str(self.age) +  ' ' + \
               self.gender