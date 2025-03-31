import Control.Monad (when)

--1
--A função map aplica a função print para cada elemento da lista.
--Assim, a função print imprime cada elemento da lista em uma lisnha separada.
--Como cada chamada à função print retorna o valor IO (),
--o comando sequence coleta esses valores removendo a parte IO,
--o que resulta na lista [(),(),(),(),()].


--2
leiaAte :: IO ( )
leiaAte = do
  putStr "Digite o nome de um aluno ou digite fim para sair do programa: "
  nome <- getLine
  if nome == "fim" || nome == "FIM"
  then return ()
  else do
  	putStrLn "Digite as três notas do aluno: "
  	n1 <- getDouble
  	n2 <- getDouble
  	n3 <- getDouble
  	putStr ("Aluno: " ++ nome ++ " - Média: " ++ show ((n1+n2+n3)/3.0) ++ "\n")
  	leiaAte

getDouble :: IO Double
getDouble = do
  dado <- getLine
  return (read dado :: Double)


--3
inverte :: [a] -> [a]
inverte [] = []
inverte (h:t) = inverte t ++ [h]

palindromo :: Eq a => [a] -> Bool
palindromo lista = lista == inverte lista

palimdromoIO :: IO ()
palimdromoIO = do
  putStr "Digite uma string: "
  str <- getLine
  putStrLn $ str ++ " invertida fica " ++ inverte str
  if (palindromo str)
  then putStrLn $ str  ++ " é palindromo"
  else putStrLn $ str  ++ " não é palindromo"


--4
parimparIO :: IO ()
parimparIO = do
  putStrLn "Digite as três inteiros: "
  a <- getLine
  b <- getLine
  c <- getLine
  putStr (parimpar a b c)

parimpar :: String -> String -> String -> String
parimpar a b c =
  a ++ (if even (read a) then " é par.\n" else " é ímpar.\n") ++
  b ++ (if even (read b) then " é par.\n" else " é ímpar.\n") ++
  c ++ (if even (read c) then " é par.\n" else " é ímpar.\n")


--5
main = do
  putStrLn menu
  op <- getLine
  when (op /= "0") $ do
    processaopcao op
    main

menu :: String
menu = "\n0 - SAIR\n1 - SOMAR\n2 - MULTIPLICAR" ++
  "\n3 - FATORIAL\nDigite sua opção: "

processaopcao :: String -> IO ()
processaopcao op
  | op == "1" = do
      putStrLn "Digite dois números: "
      n1 <- getDouble
      n2 <- getDouble
      putStrLn $ "Soma: " ++ show (n1 + n2)
  | op == "2" = do
      putStrLn "Digite dois números: "
      n1 <- getDouble
      n2 <- getDouble
      putStrLn $ "Multiplicação: " ++ show (n1 * n2)
  | op == "3" = do
      putStrLn "Digite um inteiro: "
      n <- getLine
      putStrLn $ "Fatorial de " ++ n ++ ": " ++
        show (product [1..(read n)])
