
soma a b = a + b

maior :: Int -> Int -> Int
maior a b = if a > b then a else b

impar :: Int -> Bool
impar a = case a of
    0 -> False
    1 -> True
    2 -> False
    _ -> mod a 2 /= 0

par :: Int -> Bool
par a
  | a == 0 = True
  | a == 1 = False
  | a == 2 = True
  | otherwise = mod a 2 == 0

zero :: Int -> Bool
zero 0 = True
zero 1 = False
zero _ = False

fatorial :: Int -> Int
fatorial 0 = 1
fatorial n = n * fatorial (n-1)

fib :: Int -> Int
fib 1 = 0
fib 2 = 1
fib p = fib (p-1) + fib (p-2)

somaLista :: [Int] -> Int
somaLista [] = 0
somaLista [e] = e
somaLista (a:b) = a + somaLista b

tamanho [] = 0
tamanho (_:b) = 1 + tamanho b

primeiros 0 _ = []
primeiros n (a:b) = a : primeiros (n-1) b

remove n lst = [ e | e <- lst, e /= n ]

nome :: (String,String) -> String
nome (n,_) = n

type Nome = String
type Sobrenome = String
type Pessoa = (Nome, Sobrenome)

sobrenome :: Pessoa -> Sobrenome
sobrenome (_,s) = s

qsort [] = []
qsort (a:b) = qsort menores ++ [a] ++ qsort maiores
  where
    menores = [ e | e <- b, e <= a ]
    maiores = [ e | e <- b, e > a ]
