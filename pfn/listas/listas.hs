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

palavras :: String -> [String]
palavras [] = []
palavras st
  | s == []   = [p]
  | otherwise = p : palavras s 
  where 
    (s,p) = palavra st []
    palavra [] pl = ([],pl)
    palavra (a:b) pl
      | a == ' '  = (b,pl)
      | otherwise = palavra b (pl++[a]) 
