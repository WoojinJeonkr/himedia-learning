import socket

sock1 = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock2 = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
sock2.bind(('192.168.0.9', 3000))
print('192.168.0.9, 3000 port node start!')
print('----------------B-----------------')
while True:
    # b가 a에게 받는 부분
    data, addr = sock2.recvfrom(1024) # 1024: 잡아놓은 byte 공간
    print("Simple_chat_A >> ", data.decode('utf-8'))
    # data : a에게 받은 채팅 데이터

    # b가 a에게 보내는 부분
    data = input("Simple_chat_B >> ")
    sock1.sendto(data.encode('utf-8'), ('192.168.0.9', 4000))