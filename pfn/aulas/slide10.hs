--1
q1 = sequence (map print [1,2,3,4,5])

--2
leiaAte :: IO ( )
leiaAte = do 
  putStr "Digite o seu nome ou fim para encerrar: "
  nome <- getLine
  if nome == "fim"
  then return ()
  else do 
    putStr "Digite 3 notas: "
    notas <- sequence [getDouble, getDouble, getDouble]
    putStrLn ("Nome: " ++ nome ++ "\tMedia: " ++ show (sum notas/3.0))
    leiaAte

getDouble :: IO Double
getDouble = do 
  dado <- getLine
  return (read dado :: Double)


--3. Crie uma função que solicita do usuário uma string, 
-- imprime ela invertida e informa se a mesma é um palíndromo ou não.

palindromo :: IO ()
palindromo = do
  putStr "Digite uma string: "
  s <- getLine
  rs <- toIO (reverse s)
  putStrLn $ "String invertida: " ++ rs
  if rs == s 
    then putStrLn $ s ++ " é palíndromo."
    else putStrLn $ s ++ " não é palíndromo."

toIO s = return s


--4. Crie uma função que solicita do usuário uma 
--sequência de 3 inteiros e imprime se cada um é par ou ímpar. 

parImpar :: IO ( )
parImpar = do 
  putStr "Digite 3 inteiros: "
  inteiros <- sequence [getInt, getInt, getInt]
  putStrLn $ show (inteiros !! 0) ++ (if even (inteiros !! 0) then " é par" else "é impar" )
  putStrLn $ show (inteiros !! 1) ++ (if even (inteiros !! 1) then " é par" else "é impar" )
  putStrLn $ show (inteiros !! 2) ++ (if even (inteiros !! 2) then " é par" else "é impar" )

getInt :: IO Int
getInt = do 
  dado <- getLine
  return (read dado :: Int)


--5. Faça um programa compilado que mostre ao usuário 
--um menu com as opções sair do programa, somar 2 números 
-- e multiplicar 2 números e fatorial de um inteiro. 
--O programa só encerra se o usuário optar por sair. 
