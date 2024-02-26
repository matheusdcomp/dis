-- O tipo Maybe pertence ao Prelude.
-- Para usá-lo não é necessário importar sua biblioteca.
-- Contudo, para usar a função fromJust, 
-- que converte um valor do tipo Maybe x para o tipo x,
-- é necessário importar a biblioteca Data.Maybe

import Data.Maybe 

fatorial :: Int -> Maybe Int
fatorial 0 = Just 1
fatorial n = if n < 0 then Nothing 
             else Just (n * fromJust (fatorial (n-1)))
  

menor :: [Int] -> Maybe Int
menor [] = Nothing
menor [x] = Just x
menor (x:r) = Just (min x (fromJust (menor r)))

temvalor :: Eq a => Maybe a -> Bool
temvalor x = x /= Nothing