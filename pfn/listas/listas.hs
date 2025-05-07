dobraValores :: [Int] -> [Int]
dobraValores [] = []
dobraValores (a:b) = (a*2) : dobraValores b

remove _ [] = []
remove x (h:t)
  | x == h    = remove x t 
  | otherwise = h : remove x t

soma [] = 0
soma [a] = a
soma (a:b:c) = (a+b) + soma c
