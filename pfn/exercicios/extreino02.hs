import Data.Char

--1 versão 1
medialst :: [Double] -> Double
medialst [] = 0
medialst ls = somalst ls / fromIntegral (tamanho ls)

somalst [] = 0
somalst (a:b) = a + somalst b

tamanho [] = 0
tamanho (a:b) = 1 + tamanho b

--1 versão 2 usando funções do prelude
medialst' lst = sum lst / fromIntegral (length lst)


--2 versão 1
inv [] = []
inv (a:b) = inv b ++ [a]

--2 versão 2
inv' lst = inverte lst []

inverte [] l = l
inverte (a:b) l = inverte b (a:l)   


--3
enesimo (a:_) 0 = a
enesimo (a:b) n = enesimo b (n-1)


--4
upper :: String -> String
upper [] = []
upper (a:b) = upperc a : upper b

upperc :: Char -> Char
upperc c = if c >= 'a' && c <= 'z' then chr (ord c - 32) else c 


--5
camel :: String -> String
camel [] = []
camel str = unwords (camelw (words str))

camelw :: [String] -> [String]
camelw [] = []
camelw (a:b) = (upperc (head a) : tail a) : camelw b


--6 versão 1
letras :: String -> String
letras [] = []
letras str = [ c | c <- str, c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z']

--6 versão 2
letras' :: String -> String
letras' [] = []
letras' str = [ c | c <- str, elem c (['a'..'z']++['A'..'Z']) ]


--7
quebra _ [] = []
quebra t ls = take t ls : quebra t (drop t ls)


--8 versao 1
palindromo ls = inv ls == ls  

--8 versão 2
palindromo' [] = True
palindromo' (a:b) = a == last b && palindromo' (init b) 


--9
primos n
  | n < 2     = []
  | primo(n)  = primos (n-1) ++ [n]
  | otherwise = primos (n-1) 

primo :: Integer -> Bool
primo 0 = False
primo 1 = False
primo 2 = True
primo x = primo' x (truncate (sqrt (fromIntegral x)))

primo' :: Integer -> Integer -> Bool 
primo' _ 1 = True
primo' x d = if mod x d == 0 then False else primo' x (d-1)


--10
con [] = []
con [[]] = []
con (a:b) = a ++ con b


--11
medias :: [[Double]] -> [Double]
medias [] = []
medias (a:b) = medialst' a : medias b
