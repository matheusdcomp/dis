import Data.Char (ord)

funcao x = t * 2 + 2 ** t + 1 / t
  where t = x * x * x


letra :: Char -> Bool
letra c = 
    n >= 65 && n <= 90 || 
    n >= 97 && n <= 122
 where n = ord c 


quicksort [] = []
quicksort (p:r) = quicksort menores ++ [p] ++ quicksort maiores
  where
    menores = [ y | y <- r, y < p ]
    maiores = [ y | y <- r, y >= p ] 


maioresQueMedia a b c =  
  fromBool (a > m) + fromBool (b > m) + fromBool (c > m)
  where m = (a + b + c) / 3

fromBool True = 1
fromBool False = 0


funwhere 0 = 1 --y não existe aqui
funwhere x
  | x < 0 = abs x / y
  | x > 0 = x / y
  where y = x ** (1/x)


primo :: Int -> Bool
primo 1 = False
primo n = primoaux n (div n 2)
  where 
    primoaux :: Int -> Int -> Bool 
    primoaux _ 1 = True
    primoaux n d 
      | mod n d == 0 = False 
      | otherwise = primoaux n (d-1)
