maior :: Int -> Int -> Int 
maior a b = if a > b then a else b

funcao :: Double -> Double -> Double
funcao x y = if x == 0 then 1 else sin x / x * y

fatorial :: Int -> Int
fatorial x = if x <= 1 then 1 else x * fatorial (x-1)

fib:: Int -> Int
fib n = if n == 1 
  then 0 
  else if n == 2 
  	then 1 
  	else fib (n-2) + fib (n-1)

