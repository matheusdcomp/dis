import Control.Exception
import System.IO
import Data.Maybe


--Com catch, a função testada tem que resultar em IO algo. 
--A exceção tem que ocorrer no catch.
--Não pode ser numa operação interna da função testada.
catch1 = catch (print (div 5 0)) handler
  where
    handler :: SomeException -> IO ()
    handler ex = do
      putStrLn $ "Deu ruim: " ++ show ex
      return ()


--O try retorna IO Either, mas a função testada não precisa ser IO algo.
--A exceção também tem que ocorrer diretamente.
getInt :: IO Int
getInt = do
  putStr "Digite um inteiro: "
  i <- getLine
  result <- try (evaluate (read i :: Int)) :: IO (Either SomeException Int)
  case result of
    Left ex -> do
      putStrLn $ "Deu ruim: " ++ show ex
      getInt
    Right val -> return val
  