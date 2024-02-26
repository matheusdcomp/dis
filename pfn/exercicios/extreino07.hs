--Escrevi em um arquivo só para manter o nome extreino07, 
--mas o exercício peque que seja um mõdulo Aluno (arquivo Aluno.hs) 
--e outro Main (arquivo Main.hs).

--module Aluno where

import System.IO

--1
data Aluno = Aluno Int String deriving (Eq, Read) 

instance Show Aluno where
  show (Aluno rg nome) = "Aluno " ++ show rg ++ " - " ++ nome

readAluno :: String -> Aluno
readAluno s = (Aluno rg nm)
  where
    rg = read ((words s) !! 1)
    nm = (words s) !! 3


--2
novoAluno :: String -> Aluno -> IO ()
novoAluno arq aln = do
  handle <- openFile arq AppendMode
  hPutStrLn handle (show aln)
  hClose handle


--3
loadAlunos :: String -> IO [Aluno]
loadAlunos arq = do
  handle <- openFile arq ReadMode  
  alunos <- loadAlunos' handle []
  hClose handle
  return alunos
  where
    loadAlunos' :: Handle -> [Aluno] -> IO [Aluno]
    loadAlunos' handle alunos = do
      isEOF <- hIsEOF handle
      if isEOF 
      then return alunos
      else do
        str <- hGetLine handle
        loadAlunos' handle (alunos ++ [readAluno str]) 


--4
buscaAluno :: String -> String -> IO (Maybe Aluno)
buscaAluno arq nome = do
  alunos <- loadAlunos arq 
  return (buscaAluno' nome alunos)
  where
    buscaAluno' :: String -> [Aluno] -> Maybe Aluno
    buscaAluno' _ [] = Nothing
    buscaAluno' n ((Aluno rg nm):restante) 
      | n == nm = Just (Aluno rg nm)
      | otherwise = buscaAluno' n restante 


--module Main where
--import Aluno

arquivo = "extreino07.txt"

--7
main = programa

--5
menu :: IO Int
menu = do
  putStr "\n\n0 - SAIR\n1 - GRAVAR ALUNO\n2 - BUSCAR ALUNO\n3 - VISUALIZAR ALUNOS\n\nDIGITE SUA OPCAO: "
  op <- getLine 
  return (read op)

--6
programa :: IO ()
programa = do
  op <- menu
  putStr "\n\n"
  if op == 0 then return () 
  else do
    case op of
      1 -> cadastrar
      2 -> buscar
      3 -> visualizar
      _ -> putStrLn "\nOPCAO INVALIDA\n"
    programa

  where
  
    cadastrar :: IO ()
    cadastrar = do
      putStr "Digite o registro do aluno: "
      rg <- getLine
      putStr "Digite o nome do aluno: "
      nm <- getLine
      novoAluno arquivo (Aluno (read rg) nm)
    
    buscar :: IO ()
    buscar = do
      putStr "Digite o nome do aluno: "
      nm <- getLine
      aluno <- buscaAluno arquivo nm
      if aluno == Nothing 
      then putStrLn $ "NAO EXISTE ALUNO CHAMADO " ++ nm
      else putStrLn $ show aluno
    
    visualizar :: IO ()
    visualizar = do
      alunos <- loadAlunos arquivo
      putStrLn $ unlines (map show alunos)