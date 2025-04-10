--1
tam [] = 0
tam (a:b) = 1 + tam b

--2
repete1 :: Char -> Int -> [Char]
repete1 _ 0 = []
repete1 c n = c : repete1 c (n-1)

repete2 :: Char -> Int -> [Char]
repete2 c n = [c | _ <- [1..n]]

--3
maioresQMedia [] = []
maioresQMedia lst = [x | x <- lst, x > (sum lst)/fromIntegral(length lst) ]

--4
contem _ [] = False
contem e (a:b)
  | e == a = True
  | otherwhise = contem e b