module Main where
import Pontos (Ponto, distancia)

main = do
  putStrLn "Digite dois pontos:"
  a <- getLine
  b <- getLine
  putStrLn $ "Distância entre os pontos: " ++ 
    show (distancia (read a) (read b))
