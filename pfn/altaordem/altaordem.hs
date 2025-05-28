funAltaOrd :: (Int -> Int -> Int) -> Int -> Int -> Int
funAltaOrd f a b = f a b

filtra :: (Int -> Bool) -> [Int] -> [Int]
filtra _ [] = []
filtra f (a:b) 
  | f a       = a : filtra f b 
  | otherwise = filtra f b  


soma :: Int -> (Int -> Int)
soma x = (+x)

incrementa :: Int -> Int
incrementa = soma 1