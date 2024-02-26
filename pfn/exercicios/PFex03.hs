import System.IO

--1
class Color t where
  (+&) :: t -> t -> t


--2
data Cor = Amarelo | Azul | Vermelho | Laranja | Verde | Roxo | Branco
  deriving (Show, Read)   

instance Color Cor where
  Amarelo +& Amarelo   = Amarelo
  Amarelo +& Azul      = Verde
  Amarelo +& Vermelho  = Laranja
  Amarelo +& Laranja   = Laranja
  Amarelo +& Verde     = Verde
  Amarelo +& Roxo      = Branco
  Amarelo +& Branco    = Amarelo
  Azul +& Azul         = Azul
  Azul +& Vermelho     = Roxo
  Azul +& Laranja      = Branco
  Azul +& Verde        = Verde
  Azul +& Roxo         = Roxo
  Azul +& Branco       = Azul
  Azul +& x            = x +& Azul
  Vermelho +& Vermelho = Vermelho
  Vermelho +& Laranja  = Laranja
  Vermelho +& Verde    = Branco
  Vermelho +& Roxo     = Roxo
  Vermelho +& Branco   = Vermelho
  Vermelho +& x        = x +& Vermelho
  Laranja +& Laranja   = Laranja
  Laranja +& Verde     = Amarelo
  Laranja +& Roxo      = Vermelho
  Laranja +& Branco    = Laranja
  Laranja +& x         = x +& Laranja
  Verde +& Verde       = Verde
  Verde +& Roxo        = Azul
  Verde +& Branco      = Verde
  Verde +& x           = x +& Verde
  Roxo +& Roxo         = Roxo
  Roxo +& Branco       = Roxo
  Roxo +& x            = x +& Roxo
  Branco +& Branco     = Branco
  Branco +& x          = x +& Branco


--3
data RGB = Cod Int Int Int deriving (Show, Read, Eq, Ord)

instance Color RGB where
  (Cod x y z) +& (Cod a b c) = 
     (Cod (mod (x+a) 256) (mod (y+b) 256) (mod (z+c) 256) )


--4
digitaCor :: IO ()
digitaCor = do
  putStr "Digite uma cor: "
  c1 <- getLine
  putStr "Digite outra cor: "
  c2 <- getLine
  print $ (read c1 :: Cor) +& (read c2 :: Cor)


--5
digitaRGB :: IO ()
digitaRGB = do
  putStr "Digite uma cor RGB: "
  c1 <- getLine
  putStr "Digite outra cor RGB: "
  c2 <- getLine
  print $ (read c1 :: RGB) +& (read c2 :: RGB)  


--6
cadcolor :: IO ()
cadcolor = do
  putStr "SAIR\nCOR\nRGB\nDigite sua opção: "
  op <- getLine
  case op of
    "SAIR" -> return ()
    "COR"  -> do
      cadcor
      cadcolor    
    "RGB"  -> do
      cadrgb
      cadcolor
    _      -> cadcolor -- _ é equivalente ao default do switch do C

cadcor :: IO ()
cadcor = do
  putStr $ "\n\n0 - Voltar\n1 - Cadastar Cor no arquivo" ++
    "\n2 - Combinar cores do arquivo\nDigite sua opção: "
  op <- getLine
  case op of 
    "0" -> return ()
    "1" -> do
      putStr "\nDigite uma cor: "
      cor <- getLine
      arq <- openFile "cor.txt" AppendMode
      hPutStrLn arq cor
      hClose arq
      cadcor
    "2" -> do
      arq <- openFile "cor.txt" ReadMode
      cores <- lecores arq []
      hClose arq
      if null cores 
      then cadcor
      else do
        putStrLn $ "\nCor resultante: " ++ show (combinacolors cores)        
        cadcor
    _ -> cadcor

cadrgb :: IO ()
cadrgb = do
  putStr $ "\n\n0 - Voltar\n1 - Cadastar cor RGB no arquivo" ++
    "\n2 - Combinar cores RGB do arquivo\nDigite sua opção: "
  op <- getLine
  case op of 
    "0" -> return ()
    "1" -> do
      putStr "\nDigite uma cor RGB: "
      rgb <- getLine
      arq <- openFile "rgb.txt" AppendMode
      hPutStrLn arq rgb
      hClose arq
      cadrgb
    "2" -> do
      arq <- openFile "rgb.txt" ReadMode
      rgbs <- lergbs arq []
      hClose arq
      if null rgbs 
      then cadrgb
      else do
        putStrLn $ "\nCor RGB resultante: " ++ show (combinacolors rgbs)
        cadrgb
    _ -> cadrgb      

lecores :: Handle -> [Cor] -> IO [Cor]
lecores arq cores = do
  eof <- hIsEOF arq
  if eof then return cores
  else do 
    cor <- hGetLine arq
    lecores arq (cores ++ [read cor])

lergbs :: Handle -> [RGB] -> IO [RGB]
lergbs arq rgbs = do
  eof <- hIsEOF arq
  if eof then return rgbs
  else do 
    rgb <- hGetLine arq
    lergbs arq (rgbs ++ [read rgb])

combinacolors :: Color a => [a] -> a
combinacolors [a]   = a
combinacolors (h:t) = h +& (combinacolors t)
