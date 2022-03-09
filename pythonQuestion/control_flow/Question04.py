# Battleship게임:
# 설명:
# 1) 랜덤한 좌표에 배 위치 선정
# 2) 포격 위치 선정
# 3) 컴퓨터의 배를 모두 포격 시 승리!

from random import randint

board = [] # board라는 빈 리스트 생성

for x in range(5): # 5번 반복 --> 5 x 5
    board.append(['ㅁ']*5) # 5열 생성

def p_board(board): # p_board 함수 생성
    for row in board:
        print(" ".join(row))
p_board(board) # 판 생성

def random_row(board): # 격추할 배 위치의 열 랜덤 생성
    return randint(0, len(board)-1)
def random_col(board): # 격추할 배 위치의 행 랜덤 생성
    return randint(0, len(board[0])-1)

# 격추할 배의 위치 생성
vessel_row = random_row(board)
vessel_col = random_col(board)

print() # 한 칸 띄움 --> Enter와 같은 효과

for turn in range(5): # 5번의 기회 --> 포격할 위치 5번 선택 가능
    print('turn', turn+1) # turn은 0부터 시작되므로 turn+1해줌
    player_row = int(input('움직일 열을 입력하세요(0~4)>> ')) # 포격할 위치의 열 입력
    player_col = int(input('움직일 행을 입력하세요(0~4)>> ')) # 포격할 위치의 행 입력
    if turn != 4: # 조건 1: 만약 turn이 4가 아니라면 --> turn+1이 5가 아니라면
        if player_row == vessel_row and player_col == vessel_col: # 조건 2: 만약 입력한 위치와 배의 위차가 같다면
            print('배를 격추했습니다.')
            break
        else: # 조건 2을 만족하지 않는다면
            if (player_row < 0 or player_row > 4) or (player_col < 0 or player_col > 4): # 입력한 위치가 범위를 벗어난다면
                print('배가 범위 안에 존재하지 않습니다.'+'\n')
            elif board[player_row][player_col] == 'X': # 입력한 위치가 이미 선택한 곳이라면
                print('이미 격추한 배입니다.'+'\n')
            else: # 위의 조건 2개 모두 아니라면
                print('빗나갔습니다.'+'\n')
                board[player_row][player_col] = 'X' # 입력한 위치를 'X'로 표시
                p_board(board) # 선택 뒤의 board 현황
                print() # 한 칸 띄움
    else: # 조건 1을 만족하지 않는다면
        print() # 한 칸 띄워주는 용도
        p_board(board) # 여태까지 선택한 board 현황 보여주기
        print() # 한 칸 띄워주는 용도
        print('배의 위치는',vessel_row, vessel_col,'였습니다.') # 맞춰야했던 배의 위치 알려주기
        print('Game Over!!')