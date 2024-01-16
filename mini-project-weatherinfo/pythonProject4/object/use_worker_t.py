import random

from object.woker_t import Worker2

gender_list = ['남', '여']
if __name__ == '__main__':
    for index in range(1000):
        age_rand = random.randint(20, 35)
        gender_choice = random.choice(gender_list)
        Worker2('홍길동'+str(index), age_rand, gender_choice)
        print('채용인원>> ', Worker2.count)

    w1 = Worker2('홍길동', 25, '남')
    print('채용인원>> ', Worker2.count)

    w2 = Worker2('김길동', 23, '여')
    print('채용인원>> ', Worker2.count)

    w3 = Worker2('박길동', 28, '남')
    print('채용인원>> ', Worker2.count)

    w4 = Worker2('이길동', 21, '남')
    print('채용인원>> ', Worker2.count)

    w5 = Worker2('장길동', 29, '여')
    print('채용인원>> ', Worker2.count)

    print(w1)
    print(w2)
    print(w3)
    print(w4)
    print(w5)
    print(Worker2.age_sum)
    print(Worker2.count)
    print(Worker2.age_sum//Worker2.count)
    print('남자 직원수 >> ', Worker2.m)
    print('여자 직원수 >> ', Worker2.f)