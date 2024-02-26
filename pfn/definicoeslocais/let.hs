import Data.Char (ord)

funcao x = let t = x * x * x
  in t * 2 + 2 ** t + 1 / t

letra :: Char -> Bool
letra c = let n = ord c
    in n >= 65 && n <= 90 || 
       n >= 97 && n <= 122


quicksort [] = []
quicksort (p:r) = 
  let 
    menores = [ y | y <- r, y < p ]
    maiores = [ y | y <- r, y >= p ]
  in quicksort menores ++ [p] ++ quicksort maiores

maioresQueMedia a b c = let m = (a + b + c) / 3 
  in fromBool (a > m) + fromBool (b > m) + fromBool (c > m)

fromBool True = 1
fromBool False = 0

funlet 0 = 1 --y não existe aqui
funlet x 
    | x < 0  = let y = x ** (1/x) 
               in abs x / y
    | x > 0  = let y = x ** (1/x) 
               in x / y 
