mysum <- function(x){
  result <-  x + 100
  return(result)
}

mysum2 <- function(x, y){
  result = x + y
  return(result)
}

mysum3 <- function(x, y=1000){ #default값!
  #함수를 호출할 때 넣지 않으면, default값을 사용
  result = x + y
  return(result)
}

mysum.minus <- function(x, y){
  s1 <- x + y
  m1 <- x - y
  return(list(s = s1, m = m1))
}

## 입력용 함수 
input.fun <- function(){
  name <-  dlgInput('your name>> ')$res
  height <-  dlgInput('your height>> ')$res
  weight <-  dlgInput('your weight>> ')$res
  height2 <- as.numeric(height)
  weight2 <- as.numeric(weight)
  return(list(n = name, h = height2, w = weight2))
}

## 적정몸무게구하는 함수 
proper.weight <- function(w, h){
  rates = 0.9
  pro.w <- (h - w) *  rates
  return(list(r = rates, prow = pro.w))
}