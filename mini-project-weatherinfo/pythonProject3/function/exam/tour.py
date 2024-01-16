def spring(month, place):
    # data = str(month) + '에' + place + '에 가요!'
    # print(data)
    print(month,'월에',place,'에 가요!')

def summer(place, month, cost = 10000):
    if month == 6:
        cost -= 2000 # cost = cost - 2000
    elif month == 7:
        cost -= 1000 # cost = cost - 1000
    elif month == 8:
        pass
    else:
        cost += 2000 # cost = cost + 2000
    print(month,'월에',place,'를 가는 비용은',cost,'입니다')