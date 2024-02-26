distanciaPontos :: (Float,Float) -> (Float,Float) -> Float
distanciaPontos (xa, ya) (xb, yb) = sqrt ( (xb-xa)**2 + (yb-ya)**2 )

shift :: ((Int, Int), Int) -> (Int, (Int, Int))
shift ((a,b),c) = (a, (b,c))

nome :: (String, String, Int) -> String
nome (n, f, i) = n

idade :: (String, String, Int) -> Int
idade (n, f, i) = i

somaNotas :: (String, [Float]) -> Float
somaNotas (_, []) = 0
somaNotas (n, (a:b)) = a + somaNotas (n,b)

mediaNotas :: (String, [Float]) -> String
mediaNotas (nome, notas) = 
  "A media das notas de " ++ nome ++ " eh " ++ 
  show ((sum notas) / fromIntegral (length notas)) 

pontoMaisAlto :: [(Float,Float)] -> (Float,Float)
pontoMaisAlto [(x,y)] = (x,y) 
pontoMaisAlto ((x,y):r) 
  | max y (cordY (pontoMaisAlto r)) == y = (x,y)
  | otherwise = pontoMaisAlto r 

cordY :: (Float,Float) -> Float
cordY (_,y) = y