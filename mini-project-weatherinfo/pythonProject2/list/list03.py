print('동계올림픽 순위입니다.')
rank = []
rank.append('김연아')
rank.append('나몰라')
rank.append('김상화')
rank.append('모태범')
print('1위', rank[0])
print('2위', rank[1])
print('3위', rank[2])
print('4위', rank[3])
del rank[1]
rank[2] = '모모범'
print(rank)