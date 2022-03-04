def spring(month, location):
    data = str(month) + '월에 ' + location + '에 가요!'
    print(data)

        # default로 설정하고 싶다면 파라메터 위치를
        # 뒤에서부터 써주어야 한다
        # 앞의 파라메터는 입력해주고, 입력해주지 않은 뒤의 파라메터를
        # default값으로 입력해주라고 처리되기 때문!
        # location, month, price= 10000
def summer(location, month, price = 10000):
    if month == 6:
        price -= 2000 # cost = cost - 2000
    elif month == 7:
        price -= 1000 # cost = cost - 1000
    elif month == 8:
        pass
    else:
        price += 2000 # cost = cost + 2000
    data = str(month) + '월에 ' + location + '를 가는 비용은 ' + \
            str(price)+ '원입니다'
    return data

if __name__ == '__main__':
    spring(3, '제주도')
    result = summer('을릉도', 8)
    print(result)
    result2 = summer('을릉도', 6)
    print(result2)