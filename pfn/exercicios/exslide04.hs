import Data.Char (ord)

-- 1
divisao :: Int -> Int -> Int
divisao x y
  | x < y = 0
  | x >= y = 1 + divisao (x-y) y

--2
maior :: Int -> Int -> Int -> Int
maior a b c = 
  if a >= b && a >= c then a
  else if b >= a && b >= c then b
  else c

--3
bissexto :: Int -> Bool
bissexto a 
  | mod a 400 == 0 = True
  | mod a 4 == 0 && mod a 100 /= 0 = True
  | otherwise = False

--4
crescente :: Int -> Int -> Int -> String
crescente a b c
  | a <= b && a <= c = show a ++ " " ++ crescente2 b c
  | b <= a && b <= c = show b ++ " " ++ crescente2 a c
  | c <= b && c <= a = show c ++ " " ++ crescente2 a b

crescente2 :: Int -> Int -> String
crescente2 a b
  | a <= b = show a ++ " " ++ show b
  | otherwise = show b ++ " " ++ show a

--5
multiplos :: Int -> Int -> Bool
multiplos a b = mod a b == 0 || mod b a == 0

--6
letra :: Char -> Bool
letra c = ord c >= 65 && ord c <= 90 || 
          ord c >= 97 && ord c <= 122 

--7
triangulo :: Float -> Float -> Float -> String
triangulo a b c 
  | a == b && b == c = "Equilatero"
  | a /= b && a /= c && b /= c = "Escaleno"
  | otherwise = "Isosceles"
