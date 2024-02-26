import System.IO
import Control.Monad (forever)


--1
qtdChar :: IO ()
qtdChar = do
  putStr "\nInforme o arquivo: "
  path <- getLine
  arq <- openFile path ReadMode
  conteudo <- hGetContents arq
  hClose arq
  putStr $ "\nTamanho do arquivo em caracteres: " ++
    show (length conteudo) ++ "\n\n"


--2
qtdLinhas :: IO ()
qtdLinhas = do
  putStr "\nInforme o arquivo: "
  path <- getLine
  arq <- openFile path ReadMode
  conteudo <- hGetContents arq
  hClose arq
  putStr $ "\nTamanho do arquivo em linhas: " ++
    show (length (lines conteudo)) ++ "\n\n"


--3
addLinhas :: IO ()
addLinhas = do
  putStr "\nInforme o arquivo: "
  path <- getLine
  arq <- openFile path AppendMode
  addLinha arq
  hClose arq

addLinha :: Handle -> IO ()
addLinha arq = do
  putStrLn "\nDigite uma linha de texto:"
  linha <- getLine
  if linha == "EOF"
  then return ()
  else do
    hPutStrLn arq linha
    addLinha arq


--4
operacao :: IO()
operacao = do
  putStr "fim\nsum\nsub\nDigite sua opção: "
  op <- getLine
  case op of
    "fim" -> return ()
    "sum"  -> do
      putStrLn "\nDigite 2 números:"
      n1 <- getLine
      n2 <- getLine
      let opr = n1 ++ " + " ++ n2 ++ " = " ++ show (read n1 + read n2)
      putStrLn opr
      arq <- openFile "exslide13q4.txt" AppendMode
      hPutStrLn arq opr
      hClose arq
      operacao
    "sub"  -> do
      putStrLn "\nDigite 2 números:"
      n1 <- getLine
      n2 <- getLine
      let opr = n1 ++ " - " ++ n2 ++ " = " ++ show (read n1 - read n2)
      putStrLn opr
      arq <- openFile "exslide13q4.txt" AppendMode
      hPutStrLn arq opr
      hClose arq
      operacao
    _      -> operacao -- _ é equivalente ao default do switch do C
