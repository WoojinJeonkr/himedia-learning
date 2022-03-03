seat = [0] * 10
while True:
    print('\n영화예매 사이트입니다.')
    print('-------------------------')
    print(' ', end='')
    for x in range(0, 10):
        print(x, end='  ')
    print()
    print('-------------------------')
    print(seat)
    print('-------------------------')
    no = int(input('예매 좌석번호 선택(종료 -1)>> '))
    if no == -1:
        # 몇 좌석 예매가 되었는지 프린트
        #  => list에 1이 몇 개가 있는지
        seat_count =  seat.count(1)
        print('좌석 개수 >> ', seat_count)
        # 결제금액 한 자리당 1만원해서 프린트
        price = 10000
        print('예매 금액 >> %d원' % (price * seat_count))
        # 좌석 번호 프린트
        seat_list=[]
        for i in range(len(seat)):
            if(seat[i] == 1):
                seat_list.append(i)
        print('예매한 좌석은 >> %s' % seat_list)
        break # break를 포함하고 있는 반복문(while)문이 더이상 실행되지 않음.
    else:
        # 예매가 이미 된 자리인지 재입력하라고 출력
        if seat[no] == 0:
            # 예매 처리
            seat[no] = 1
            print('예매가 완료되었습니다.')
        else:
            print('이미 예매된 자리입니다.')
            print('다시 예매자리를 선택해주세요.')


