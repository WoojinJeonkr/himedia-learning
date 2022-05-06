num <- 55

if(num > 50){
  print('50보다 크다')
}else{
  print('50보다 작다')
}

# 3항 연산자
result <- ifelse(num>50, '크다', '작다')
cat('50보다', result)

2 + 3 # 2항 연산자
# a++ # 1연산자 --> 단항 연산자
  
# -------------------

for(x in 1:5){
  print(x)
}

for(x in c(1, 5, 6, 7)){
  print(x)
}

array <- c(100, 300, 500) # index 1 ~ 3

for(x in array){
  print(x)
}

print(array[1])

for(x in 1:3){
  print(array[x])
}

result2 <- c(array, 455)
print(result2)

result2[4] <-  777
print(result2)

result2[c(1, 3)] <-  c(222, 999)
print(result2)

result2[1:2] <- 55:56
print(result2)

result2[5] <- 888
print(result2)

result2 <- append(result2, 333, after = 1)
print(result2)
