fun x = case x of
  0 -> 50
  1 -> 100
  2 -> 150
  3 -> 200
  _ -> 500

funcao :: Double -> Double -> Double
funcao x y = case x of 
  0 -> 1
  _ -> sin x / x * y

fatorial :: Int -> Int
fatorial n = case n of 
  0 -> 1
  1 -> 1
  _ -> n * fatorial (n-1) 

fib :: Int -> Int
fib n = case n of 
  1 -> 0
  2 -> 1
  _ -> fib (n-2) + fib (n-1)
