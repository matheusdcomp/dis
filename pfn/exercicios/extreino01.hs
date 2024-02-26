import Data.Char


--1
perimetro :: Double -> Double
perimetro r = 2.0 * pi * r


--2
media3 :: Float -> Float -> Float -> Float
media3 a b c = (a + b + c)/3


--3
digito :: Char -> Bool
digito c = c >= '0' && c <= '9'


--4
toUpper :: Char -> Char
toUpper c = if c >= 'a' && c <= 'z'
  then chr (ord c - 32) 
  else c 


--5
(+/) :: Double -> Double -> Double
a +/ b = (a + b) / 2

--6
somaEntre :: Int -> Int -> Int
somaEntre a b
  | a < b  = a + somaEntre (a+1) b
  | a == b = a
  | a > b  = somaEntre b a  


--7
(++/) :: Int -> Int -> Double
a ++/ b = fromIntegral (somaEntre a b) / fromIntegral (abs (b - a) + 1)


--8
potencia :: Int -> Int -> Double
potencia x y = if y < 0 then 1 / potenciap x y 1 else potenciap x y 1 

potenciap :: Int -> Int -> Int -> Double
potenciap _ 0 p = fromIntegral p
potenciap x y p = potenciap x (y-1) (x*p) --recursão em cauda 


--9
(%%) :: Int -> Int -> Int
a %% b
  | a == b = 0
  | a < b  = a
  | a > b  = (a-b) %% b


--10
mdc :: Int -> Int -> Int
mdc a b 
  | a == b = a
  | a < b = mdc b a
  | a > b = mdc (a-b) b  


--11 versão usando mdc
mmc :: Int -> Int -> Int
mmc a b = div (a * b) (mdc a b)


--11 versão recursiva 
mmcr :: Int -> Int -> Int
mmcr a b = mmc_aux a b 2 

mmc_aux :: Int -> Int -> Int -> Int
mmc_aux a b f
  | a == 1 && b == 1 = 1
  | mod a f == 0 && mod b f == 0 = f * mmc_aux (div a f) (div b f) f  
  | mod a f == 0 && mod b f /= 0 = f * mmc_aux (div a f) b f  
  | mod a f /= 0 && mod b f == 0 = f * mmc_aux a (div b f) f  
  | mod a f /= 0 && mod b f /= 0 = mmc_aux a b (proxPrimo f)  

proxPrimo :: Int -> Int
proxPrimo p = if primo (p+1) then p+1 else proxPrimo (p+1)

primo :: Int -> Bool
primo 1 = False
primo 2 = True
primo p = primo_aux p 2

primo_aux :: Int -> Int -> Bool
primo_aux p f
  | mod p f == 0 = False
  | f > div p 2  = True
  | otherwise    = primo_aux p (f+1)   


--12
algarismos :: Int -> Int
algarismos x 
  | abs x < 10 = 1
  | otherwise = 1 + algarismos (div x 10) 


--13
ocorre :: Int -> Int -> Int
ocorre 0 _ = 0
ocorre n d = ocorre (quot n 10) d + (if rem (abs n) 10 == d then 1 else 0) 


--14
binario :: Int -> String
binario 0 = ""
binario x = binario (div x 2) ++ show (mod x 2) 


--15
somaalg :: Int -> Int
somaalg x
  | x < 10 = x
  | otherwise = somaalg (div x 10) + mod x 10 


--16 OBS: essa série tem alta complexidade. Quanto maior o m, menor deve ser o n. ackermann 3 9 levou um "século" para resolver.    
ackermann :: Int -> Int -> Int
ackermann m n
  | m == 0          = n + 1
  | m > 0 && n == 0 = ackermann (m-1) 1
  | m > 0 && n > 0  = ackermann (m-1) (ackermann m (n-1))
