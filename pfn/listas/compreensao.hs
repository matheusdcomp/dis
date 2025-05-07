dobraValores :: [Int] -> [Int]
dobraValores lista = [x*2 | x <- lista]

remove x lista = [ y | y <- lista, y /= x ]

quicksort [] = []
quicksort (p:r) = 
  quicksort [ x | x <- r, x < p] ++ [p] ++ quicksort [ x | x <- r, x >= p] 
