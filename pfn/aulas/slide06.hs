--1
--fst (snd (fst (("Hello", (4, True)), 15.5) ) )

--2
type Teto = Float
type Altura = Float
type Piso = Float
type Trapezio = (Teto, Piso, Altura)

areaTrapezio :: Trapezio -> Float
areaTrapezio (t,p,a) = (t + p) * a / 2


--3
type Ponto = (Float,Float)

somaPontos :: [Ponto] -> Ponto
somaPontos [] = (0,0)
somaPontos ((x,y):ps) = (x + fst sp, y + snd sp)
  where sp = somaPontos ps


--4
getHL lst = (primeiro lst, ultimo lst)
  where
    primeiro (a:_) = a
    ultimo [a] = a
    ultimo (a:b) = ultimo b


--5
type Jogador = String
type Jogada = (Jogador,Tabuleiro)
type Tabuleiro = (Char,Int)

getJogadas :: [Jogada] -> Jogador -> Int
getJogadas [] _ = 0
getJogadas ((nj,tb):b) j = getJogadas b j + (if j == nj then 1 else 0)


--6
type Triangulo = (FLoat,Float,Float)

filtraEquilateros ::[Triangulo] -> [Triangulo]
filtraEquilateros [] = []
filtraEquilateros ((l1,l2,l3):b) -- = [(a,b,c)|(a,b,c) <- ]
  | a == b && b == c = (a,b,c) : filtraEquilateros b
  | otherwise = filtraEquilateros b


filtraEquilateros2 ::[Triangulo] -> [Triangulo]
filtraEquilateros2 ts = [(a,b,c)|(a,b,c) <- ts, a == b && b == c ]