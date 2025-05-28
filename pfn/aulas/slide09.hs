--2
data Ponto = Pt { x::Float, y::FLoat } deriving (Show)

data Forma = 
  Circulo {centro::Ponto, raio::Float} |
  Retangulo {supesq::Ponto, infdir::Ponto}
  deriving (Show)

--3
newRetangulo :: Ponto -> Ponto -> Forma
newRetangulo se id = (Retangulo se id) 

newCirculo :: Ponto -> Float -> Forma
newCirculo c r = (Circulo c r)

newForma :: Ponto -> Maybe Ponto -> Maybe Float -> Maybe Forma
newForma c Nothing (Just r) = (Circulo c r)
newForma se (Just id) Nothing = (Retangulo se id)
newForma _ Nothing Nothing = Nothing
newForma _ _ _ = Nothing

--4
distancia :: Ponto -> Ponto -> Float
distancia (Pt x1 y1) (Pt x2 y2) = sqrt ((x1-x2)**2 + (y1-y2)**2) 

pertence :: Forma -> Ponto -> Bool
pertence (Circulo c r) p = distancia c p <= r
pertence (Retangulo (Pt ex ey) (Pt dx dy) ) (Pt px py) = 
  ex <= px && px <= dx && dy <= py && py <= ey     

pertence2 :: Forma -> Ponto -> Bool
pertence2 (Circulo c r) p = distancia c p <= r
pertence2 (Retangulo se id) pt = 
  x se <= x pt && x pt <= x id && y id <= y pt && y pt <= y se    