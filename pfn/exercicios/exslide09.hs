--1
class Visible t where
  toString :: t -> String
  size :: t -> Int

instance Visible Int where
  toString n = "0"
  size _ = 1

data Pares a = Par a a deriving (Show)

instance Show a => Visible (Pares a) where
  toString (Par x y) = "Par " ++ show x ++ " " ++ show y
  size p = length $ toString p

--com o deriving (Show) em Pares, 
--toString também pode ser feita assim:
--toString p = show p


--2
data Ponto = Pt Float Float deriving (Show)

data Forma = 
  Circulo Ponto Float | 
  Retangulo Ponto Ponto
  deriving (Show)

surface :: Forma -> Float  
surface (Circulo _ r) = 2.0 * pi * r  
surface (Retangulo (Pt x1 y1) (Pt x2 y2)) = 
  (abs $ x2 - x1) * (abs $ y2 - y1)


--3 
retangulo :: Ponto -> Ponto
retangulo p1 p2 = (Retangulo p1 p2)


--4
data Booleano = Falso | Verdadeiro deriving (Show)

--no circulo, a distância entre o ponto e o centro deve ser menor que o raio
--no retângulo, o ponto deve estar entre os pontos superior e inferior do retângulo  
dentro :: Forma -> Ponto -> Booleano
dentro (Circulo (Pt cx cy) r)  (Pt x y) = 
  if sqrt ((x-cx)^2 + (y-cy)^2) <= r then Verdadeiro else Falso
dentro (Retangulo (Pt sx sy) (Pt ix iy)) (Pt x y) = 
  if x >= sx && x <= ix && y <= sy && y >= iy then Verdadeiro else Falso


--5
desloca :: Forma -> Float -> Float -> Forma
desloca (Circulo (Pt cx cy) r) x y = (Circulo (cx+x) (cy+y))
desloca (Retangulo (Pt sx sy) (Pt ix iy)) x y = (Retangulo ps pi)
  where 
  	ps = (Pt (sx+x) (sy+y))
  	pi = (Pt (ix+x) (iy+y))