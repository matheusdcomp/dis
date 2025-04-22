import Text.Read

--1
areacirc :: IO ()
areacirc = do
  putStr "Digite o raio do circulo: "
  r <- getLine
  if (readMaybe r :: Maybe Double) == Nothing
    then error $ r ++ " nao eh um numero."
    else putStrLn $ "Area: " ++ show (pi * read r ** 2)
  

--2
palindromo :: IO ()
palindromo = do
  putStr "Digite uma String para verificar se eh palindome ou ENTER para sair: "
  str <- getLine
  if str == "" 
    then  return ()
    else do
      if reverse str == str
        then putStrLn $ str ++ " eh palindromo."
        else putStrLn $ str ++ " nao eh palindromo."
      palindromo


--3
mmm :: IO ()
mmm = do
  numeros <- readNumeros []
  putStrLn $ 
    "\nMaior: " ++ show (maximum numeros) ++ 
    "\nMenor: " ++ show (minimum numeros) ++ 
    "\nMedia: " ++ show (sum numeros / fromIntegral (length numeros))
  where
    readNumeros :: [Double] -> IO [Double]
    readNumeros lst = do
      putStr "Digite um numero ou ENTER para sair: "
      n <- getLine
      if n == "" then return lst else readNumeros (read n:lst)


--4
figuras :: IO ()
figuras = do
  op <- menu
  case op of 
    0 -> putStr "\n"
    _ -> do
      (ld,ch) <- readFigura
      putStr "\n"
      if op == 1 then desenhaR 1 ld ch else desenhaT 1 ld ch
      figuras

  where    

      menu :: IO Int
      menu = do
        putStr "\n0 Sair\n1 Retangulo\n2 Triangulo\nDigite sua opcao: "
        op <- getLine
        return (read op) 

      readFigura :: IO (Int,Char)
      readFigura = do
        putStr "Digite o tamanho do lado: "
        ld <- getLine
        putStr "Digite o caractere de desenho: "
        ch <- getLine
        return (read ld, ch !! 0)

      desenhaR :: Int -> Int -> Char -> IO ()
      desenhaR ln ld ch
        | ln > ld = return ()
        | otherwise = do
            putStrLn (replicate ld ch) 
            desenhaR (ln+1) ld ch

      desenhaT :: Int -> Int -> Char -> IO ()
      desenhaT ln ld ch
        | ln > ld = return ()
        | otherwise = do
            putStrLn (replicate ln ch) 
            desenhaT (ln+1) ld ch


--5
data Pessoa = Ps { nome :: String, idade :: Int } deriving (Show)

pessoas :: IO ()
pessoas = do
  ps <- cadastraPessoas []
  imprimePessoas (qSortPessoas ps)

  where

    cadastraPessoas :: [Pessoa] -> IO [Pessoa] 
    cadastraPessoas ps = do
      putStr "Deseja cadastrar uma pessoa (s/n): "
      r <- getLine
      if r == "n" || r == "N" 
        then return ps
        else do
          putStr "Digite o nome da pessoa: "
          n <- getLine
          putStr "Digite a idade da pessoa: "
          i <- getLine
          cadastraPessoas ((Ps n (read i)) : ps)  
  
    qSortPessoas :: [Pessoa] -> [Pessoa]
    qSortPessoas [] = []
    qSortPessoas (p:r) = 
      qSortPessoas [ x | x <- r, nome x < nome p ] 
      ++ [p] ++ 
      qSortPessoas [ y | y <- r, nome y >= nome p ]
          
    imprimePessoas :: [Pessoa] -> IO ()
    imprimePessoas ps = do
      putStrLn $ (alinhaEsq "Nome") ++ "Idade"
      imprimep ps
      where
        alinhaEsq :: String -> String
        alinhaEsq s = s ++ replicate (30 - length s) ' ' 
        imprimep :: [Pessoa] -> IO ()
        imprimep [] = return ()
        imprimep ((Ps n i):r) = do
          putStrLn $ alinhaEsq n ++ show i  
          imprimep r
       
      
        
  

