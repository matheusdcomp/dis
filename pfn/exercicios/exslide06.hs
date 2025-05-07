--1
q1v1 = fst ( snd ( fst (("Hello", (4, True)), 15.5) ) )
q1v2 = (fst.snd.fst) (("Hello", (4, True)), 15.5)

--2
type Trapezio = (Float,Float,Float)

areaTrapezio :: Trapezio -> Float
areaTrapezio (teto, piso, altura) = (teto + piso) * altura / 2

--3
type Ponto = (Float,Float)

somaPontos :: [Ponto] -> Ponto
somaPontos [] = (0,0)
somapontos (p:r) = soma2pontos p (somaPontos r) 

soma2pontos :: Ponto -> Ponto -> Ponto
soma2pontos (xa,ya) (xb,yb) = (xa+xb,ya+yb) 

--4
fstlst lista = (head lista, last lista)

--5
type Jogador = String
type Tabuleiro = (Char,Int)
type Jogada = (Jogador, Tabuleiro)

jogadasde :: [Jogada] -> Jogador -> Int
jogadasde lista j = length [(x,y) | (x,y) <- lista, x == j ]

--6
type Triangulo = (Float,Float,Float)

equilateros :: [Triangulo] -> [Triangulo]
equilateros lista = [(x,y,z) | (x,y,z) <- lista, x == y && x == z ]
