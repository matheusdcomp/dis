dobraValores :: [Int] -> [Int]
dobraValores [] = []
dobraValores (a:b) = (a*2) : dobraValores b

remove :: Int -> [Int] -> [Int]
remove _ [] = []
remove x (h:t)
  | x == h    = remove x t 
  | otherwise = h : remove x t

soma :: [Int] -> Int
soma [] = 0
soma [a] = a
soma (a:b:c) = (a+b) + soma c

quicksort :: [Int] -> [Int]
quicksort [] = []
quicksort (p:r) = 
  quicksort [ x | x <- r, x < p] ++ [p] ++ quicksort [ x | x <- r, x >= p] 





