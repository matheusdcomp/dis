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
  | otherwise = contem e b

--5
inverte1 [] = []
inverte1 (a:b) = inverte1 b ++ [a]

inverte2 [] = []
inverte2 lst = last lst : inverte2 (init lst)

inverte3 lst = invrt lst []
invrt [] li = li
invrt (a:b) li = invrt b (a:li) --versão mais eficiente

--6
reparte _ [] = []
reparte n lst = take n lst : reparte n (drop n lst)

--7
--esta versão não aceita repetido
selsort1 [] = []
selsort1 lst = minimum lst : selsort1 [ x | x <- lst, x /= minimum lst]

--esta versão aceita repetido
selsort2 [] = []
selsort2 lst = minimum lst : selsort2 (rem1 (minimum lst) lst)
rem1 _ [] = []
rem1 e (a:b) = if e == a then b else a : rem1 e b