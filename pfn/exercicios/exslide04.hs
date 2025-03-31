--1
tamanho [] = 0
tamanho (a:b) = 1 + tamanho b

--2
repete :: Char -> Int -> String
repete _ 0 = []
repete c n = c : repete c (n-1)

--3
maioresMedia :: [Float] -> [Float]
maioresMedia lst = [x | x <- lst, x > media lst] 

maioresMedia2 :: [Float] -> [Float]
maioresMedia2 lst = mmaux lst (media lst)

mmaux :: [Float] -> Float -> [Float]
mmaux [] _ = []
mmaux (a:b) m =   
  | a > m = a : maioresMedia2 b
  | otherwise = maioresMedia2 b

media :: [Float] -> Float
media l = (soma l) / (fromInteger (tamanho l))

soma :: [Float] -> Float
soma [] = 0
soma (a:b) = a + soma b

--4
existe _ [] = False
existe a (b:c)
  | a == b = True
  | otherwise = existe a c

--5
inverte [] = []
inverte (a:b) = inverte b ++ [a]

--6
sublistas _ [] = []
sublistas n lst = take n lst : sublistas n (drop n lst)

--7
selectionsort [] = []
selectionsort lst = menor lst : selectionsort (remove1 (menor lst) lst)

menor [a] = a
menor (a:b) = min a (menor b)

remove1 _ [] = []
remove1 a (b:c)
  | a == b = c
  | otherwise = b : remove1 a c
