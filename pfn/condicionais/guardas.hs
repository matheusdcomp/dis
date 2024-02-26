maior :: Int -> Int -> Int 
maior a b
  | a > b = a 
  | otherwise = b

funcao :: Double -> Double -> Double
funcao x y 
  | x == 0 = 1
  | otherwise = sin x / x * y

fatorial :: Int -> Int
fatorial n 
  | n == 0 = 1
  | n > 0 = n * fatorial (n-1) 

fib :: Int -> Int
fib n 
  | n == 1 = 0
  | n == 2 = 1
  | otherwise = fib (n-2) + fib (n-1)
