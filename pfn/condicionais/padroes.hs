eLogico :: Bool -> Bool -> Bool
eLogico True True = True
eLogico False _ = False
eLogico _ False = False

funcao :: Double -> Double -> Double
funcao 0 _ = 1
funcao x y = sin x / x * y

fatorial :: Int -> Int
fatorial 0 = 1
fatorial n = n * fatorial (n-1)

fib :: Int -> Int
fib 1 = 0
fib 2 = 1
fib n = fib (n-2) + fib (n-1)