--1
process :: [Int] -> Int -> Int -> Maybe Int
process lst n m 
  | n > m = Nothing
  | n < 1 || m > length lst = Nothing
  | otherwise = Just (sum ( drop (n-1) (take m lst) ) ) 


--2
substring :: [a] -> Int -> [a]
substring [] _    = []
substring (h:t) i |
  i < 0     = error "Índice inválido" 
  i == 0    = [] 
  otherwise = h : substring t (i-1)


--3
aplica :: [(a -> b)] -> [a] -> [Maybe b]
aplica [] []       = []
aplica [] (_:r)    = Nothing : aplica [] r
aplica (_:c) []    = Nothing : aplica c []
aplica (f:c) (x:r) = Just (f x) : aplica c r
