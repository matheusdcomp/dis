--1
inv ls = inv' ls []
  where
    inv' [] sl = sl
    inv' (a:b) sl = inv' b (a:sl)


--2
resultado :: [Float] -> String
resultado notas
  | media < 4.0 = "REPROVADO"
  | media >= 6.0 = "APROVADO"
  | otherwise = "RECUPERACAO"
  where media = sum notas / fromIntegral (length notas)


--3
equacao2grau a b c   --a não pode ser 0
  | delta < 0 = [] 
  | delta > 0 = [x,y] 
  | otherwise = [x] 
  where
    delta = b**2 - 4*a*c
    x = (-b + sqrt delta) / 2*a
    y = (-b - sqrt delta) / 2*a


--4
fiblist :: Int -> [Int]
fiblist n = fiblist' 1 n []
  where
    fib :: Int -> Int
    fib 1 = 0
    fib 2 = 1
    fib p = fib (p-1) + fib (p-2)
    fiblist' :: Int -> Int -> [Int] -> [Int]
    fiblist' p f ls
      | p > f = ls
      | otherwise = fib p : fiblist' (p+1) f ls


--5
split :: Int -> [a] -> [[a]]
split 0 _  = []
split n ls = split' n tam ls 
  where 
    tam = div (length ls) n
    split' :: Int -> Int -> [a] -> [[a]]
    split' 1 _ ls = [ls]
    split' n t ls = take t ls : split' (n-1) t (drop t ls)
