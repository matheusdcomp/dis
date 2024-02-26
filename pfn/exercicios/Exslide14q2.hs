-- questão 2 do slide 14.
-- o módulo deveria se chamar Formas,
-- mas para vincular este arquivo à questão,
-- eu defini outro nome.

--1
module Exslide14q2 (Forma(..),contido) where

import Pontos

--pse siginifica ponto superior esquerdo
--pid siginifica ponto inferior direito
data Forma = 
  Circulo {ponto::Ponto, raio::Float} |
  Retangulo {pse::Ponto, pid::Ponto}
  deriving (Show,Read)

contido :: Forma -> Ponto -> Bool
contido (Circulo c r) p = distancia p c <= r
contido (Retangulo (Pt psex psey) (Pt pidx pidy)) (Pt x y) =
  x >= psex && x <= pidx && y <= psey && y >= pidy
