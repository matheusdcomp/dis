--1
media ls = s / q
  where
  	s = soma ls
  	q = tam ls
    soma [] = 0
    soma (h:t) = h + soma t
    tam [] = 0
    tam (h:t) = 1 + tam t


media2 ls = s / fromIntegral q
  where
  	s = sum ls
  	q = length ls

--2
selectionsort [] = []
selectionsort ls = m : selectionsort x
  where
    m = menor ls
    x = remove m ls
    menor [e] = e
    menor (h:t)
      |	h < menorDet = h
      | otherwise = menorDet
      where
        menorDet = menor t
    remove _ [] = []
    remove e (h:t)
      | e == h = t
      | otherwise = h : remove e t

import Data.List

selectionsort2 [] = []
selectionsort2 ls = m : selectionsort2 x
  where
    m = minimum ls
    x = delete m ls  --delete pertence a Data.List

--3
mergesort []  = []
mergesort [x] = [x]
mergesort lst = conquistar (mergesort m1) (mergesort m2)
	where 
		metade = div (length lst) 2
		m1 = take metade lst
		m2 = drop metade lst
    conquistar [] lst = lst
    conquistar lst [] = lst
    conquistar (p1:r1) (p2:r2)
      | p1 < p2   = p1 : conquistar r1 (p2:r2)
      | otherwise = p2 : conquistar (p1:r1) r2 


--4 Considerei a versão em que fib 1 = 0
--  Para a versão em que fib 1 = 1, trocar os dois 0 por 1 
fib 1 = 0 
fib 2 = 1 
fib n = fib' n 0 1 
  where
    fib' 2 p s  = s
    fib' n p s = fib' (n-1) s (s+p)   

--fibonacci 1 2 3 4 5 6 7
--resposta  0 1 1 2 3 5 8 

--f 3 0 1 = f 2 1 1 = 1
--f 4 0 1 = f 3 1 1 = f 2 1 2 = 2
--f 5 0 1 = f 4 1 1 = f 3 1 2 = f 2 2 3 = 3
--f 6 0 1 = f 5 1 1 = f 4 1 2 = f 3 2 3 = f 2 3 5 = 5
--f 7 0 1 = f 6 1 1 = f 5 1 2 = f 4 2 3 = f 3 3 5 = f 2 5 8 = 8
