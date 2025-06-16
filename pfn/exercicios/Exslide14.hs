-- Módulo mais da questão 1 do slide 14.

--1
module Main where

import System.IO
import Exslide14q1	

main = do
  op <- menu
  case op of
  	"sair" -> return ()
  	"soma" -> do
  	  (a,b) <- pedeNumeros
  	  putStrLn $ "Soma: " ++ show (soma a b)
  	  main
  	"subt" -> do
  	  (a,b) <- pedeNumeros
  	  putStrLn $ "Subtração: " ++ show (subt a b)
  	  main
  	"mult" -> do
  	  (a,b) <- pedeNumeros
  	  putStrLn $ "Multiplicação: " ++ show (mult a b)
  	  main
  	"divi" -> do 
  	  (a,b) <- pedeNumeros
  	  putStrLn $ "Divisão: " ++ show (divi a b)
  	  main
  	_ -> main


menu :: IO String
menu = do
  putStr "\nsair\nsoma\nsubt\nmult\ndivi\nDigite sua opção: "
  op <- getLine
  return op


pedeNumeros :: IO (Float,Float)
pedeNumeros = do
  putStrLn "\nDigite dois números:"
  x <- getLine
  y <- getLine
  return (read x :: Float, read y :: Float)