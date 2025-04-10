--q1
divif :: Int -> Int -> Int
divif a b = if a < b 
  then 0 
  else 1 + divif (a-b) b

divg :: Int -> Int -> Int
divg a b 
  | a < b = 0 
  | otherwise = 1 + divg (a-b) b

--3
--Faça uma função que verifique se um ano é bissexto ou não. 
--Um ano é bissexto se ele for divisível por 400 ou é 
--divisível por 4 mas não por 100.
bissexto :: Int -> Bool
bissexto a = mod a 400 == 0 || (mod a 4 == 0 && mod a 100 /= 0)

--5
--Faça uma função que lê 2 inteiros e verifica se eles são múltiplos ou não.
multiplos :: Int -> Int -> Bool
multiplos a b = mod a b == 0 || mod b a == 0


--6
--Faça uma função que recebe um caractere e retorna True 
--se for uma letra ou False, caso não seja.
letra :: Char -> Bool
letra a = a >= 'A' && a <= 'Z' || a >= 'a' && a <= 'z'


--7
triangulo a b c 
  | a == b && a == c = "equilatero"
  | a == b || a == c || b == c = "isoceles"
  | True = "escaleno"
  