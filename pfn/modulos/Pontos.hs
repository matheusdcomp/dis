
module Pontos (
 Ponto(..),
 distancia
) where

data Ponto = Pt Float Float
  deriving(Show,Read,Eq)

distancia :: Ponto -> Ponto -> Float
distancia a b = sqrt ( (subX2 a b) + (subY2 a b) ) 

subX2 :: Ponto -> Ponto -> Float
subX2 (Pt xa _) (Pt xb _) = (xb-xa)^2 

subY2 :: Ponto -> Ponto -> Float
subY2 (Pt _ ya) (Pt _ yb) = (yb-ya)^2
