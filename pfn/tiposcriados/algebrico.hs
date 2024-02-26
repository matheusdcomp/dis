
data Booleano = Falso | Verdadeiro deriving (Show)

data Forma = 
  Circulo Float Float Float | 
  Retangulo Float Float Float Float
  deriving (Show)

data DiaSemana = 
  Domingo | Segunda | Terca | Quarta | Quinta | Sexta | Sabado
  deriving (Eq, Show)

data Pessoa = 
  Pessoa {nome :: String, idade :: Int, altura :: Float} 
  deriving (Eq, Show, Read, Ord)

data Par a = Par a a  

surface :: Forma -> Float  
surface (Circulo _ _ r) = pi * r ^ 2  
surface (Retangulo x1 y1 x2 y2) = (abs $ x2 - x1) * (abs $ y2 - y1)

igualPar :: Eq a => Par a -> Bool
igualPar (Par x y) = (x == y)

data ChaveValor a b = CV a b deriving (Show)

instance (Eq a, Eq b) => Eq (ChaveValor a b) where
  (CV c1 v1) == (CV c2 v2) = c1 == c2 && v1 == v2
  cv1 /= cv2 = not (cv1 == cv2)
