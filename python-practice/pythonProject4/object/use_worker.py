from object.worker import Worker

if __name__ == '__main__':
    worker1 = Worker('홍길동', 25, '남')
    print(Worker.count1, ' ', Worker.age)
    worker2 = Worker('김길동', 23, '여')
    print(Worker.count2, ' ', Worker.age)
    worker3 = Worker('박길동', 28, '남')
    print(Worker.count1, ' ', Worker.age)
    worker4 = Worker('이길동', 21, '남')
    print(Worker.count1, ' ', Worker.age)
    worker5 = Worker('장길동', 29, '여')
    print(Worker.count2, ' ', Worker.age)
# 1. 전체 직원에 대한 정보를 프린트
    print(worker1)
    print(worker2)
    print(worker3)
    print(worker4)
    print(worker5)
# 2. 직원을 채용할 때마다 지금까지의 직원수를 프린트
    count = Worker.count1 + Worker.count2
    print(count)
# 3. 직원 나이의 평균 프린트
    print(Worker.age / count)
# 4. 성별 직원 수 프린트
    print(Worker.count1, Worker.count2)
    