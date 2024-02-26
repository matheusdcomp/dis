
class Visible a where
  toString :: a -> toString
  size :: a -> Int

instance Visible Int where
  toString i = show i
  size i = length $ toString i

data Pares a = Par a a 
  deriving (Show)   

instance Show a => Visible Pares a where
  toString (Par x y) = show "Par " ++ show x ++ " " ++ show y
  size i = length $ toString i

data Ponto = Pnt {x :: Double, y :: Double}
  deriving (Show, Eq)

data Forma = 
  Circulo {centro :: Ponto, raio :: Double} |
  Retangulo {supesq :: Ponto, infdir :: Ponto}
  deriving (Show, Eq)

surface :: Forma -> Double
surface (Circulo _ r) = pi * r ** 2
surface (Retangulo (Pnt x1 y1) (Pnt x2 y2)) =
  abs (x1 - x2) * abs (y1 - y2)

newRetangulo :: Ponto -> Ponto -> Forma
newRetangulo p1 p2 = (Retangulo p1 p2)

data Booleano = Falso | Verdadeiro deriving (Show,Eq)

distancia :: Ponto -> Ponto -> Double
distancia (Pnt x1 y1) (Pnt x2 y2) = 
  sqrt ((x1-x2) ** 2 + (y1-y2) ** 2 )


dentro :: Ponto -> Forma -> Booleano
dentro p (Circulo c r) = distancia p c <= r
dentro (Pnt xp yp) (Retangulo (Pnt xse yse) (Pnt xid yid)) = 
  xse <= xp && xp <= xid && yid <= yp && yp <= yse  
  