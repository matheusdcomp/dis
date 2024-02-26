--questão 1
media :: Float -> Float -> Float -> Float
media a b c = (a+b+c)/3

--questão 2
volumeEsfera :: Float -> Float
volumeEsfera r  = 4 * pi * r ^ 3

--questão 3
custoCarro :: Float -> Float
custoCarro cf  = cf + cf*0.28 + cf*0.45 --cf * 1.73

--questão 4
maioresQueMedia :: Float -> Float -> Float -> Int
maioresQueMedia a b c =
  bool2Int (a > media a b c) +
  bool2Int (b > media a b c) +
  bool2Int (c > media a b c)

bool2Int :: Bool -> Int
bool2Int True = 1
bool2Int False = 0

--questão 5
hms :: Int -> String
hms s =
  show (div s 3600) ++ ":" ++
  show (div (mod s 3600) 60) ++ ":" ++
  show (mod (mod s 3600) 60)

--questão 6
decrescente :: Int -> Int -> Int -> String
decrescente a b c
    | a >= b && a >= c = show a ++ " " ++ decrescente2 b c
    | b >= a && b >= c = show b ++ " " ++ decrescente2 a c
    | c >= b && c >= a = show c ++ " " ++ decrescente2 a b

decrescente2 :: Int -> Int -> String
decrescente2 a b
    | a >= b = show a ++ " " ++ show b
    | otherwise = show b ++ " " ++ show a

--questão 7
parImpar :: Int -> String
parImpar a = if mod a 2 == 0 then "par" else "impar"

--questão 8
multi :: Int -> Int -> Int
multi 0 _ = 0
multi _ 0 = 0
multi a 1 = a
multi a b = a + multi a (b-1)

--questao 9
valorE :: Int -> Double
valorE 0 = 1
valorE n = (valorE (n-1)) + 1 / fromIntegral (fat n)

fat :: Int -> Int
fat 0 = 1
fat 1 = 1
fat n = n * fat (n-1)

--questao 10
mdc :: Int -> Int -> Int
mdc a b
  | a == b = a
  | a > b = mdc (a-b) b
  | a < b = mdc b a

--questao 11
mmc1 :: Int -> Int -> Int      --versão 1
mmc1 a b = mmcaux a b (max a b)

mmcaux :: Int -> Int -> Int -> Int
mmcaux a b m
  | mod m a == 0 && mod m b == 0 = m
  | otherwise = mmcaux a b (m+1)

mmc2 :: Int -> Int -> Int      --versão 2
mmc2 a b = div (a*b) (mdc a b)

--questão 12
primo :: Int -> Bool
primo 1 = False
primo 2 = True
primo n = primoaux n (div n 2)

primoaux :: Int -> Int -> Bool
primoaux _ 1 = True
primoaux n d = if mod n d == 0 then False else primoaux n (d-1)
