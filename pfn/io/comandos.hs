import Control.Monad 
import Data.Char  
 
nomes :: IO ()  
nomes = do
    putStr "Digite um nome ou fim: "  
    s <- getLine  
    when (s /= "fim") $ do  
        putStrLn ("Você digitou " ++ s)  
        nomes 

sequencia :: IO ()
sequencia = do  
    rs <- sequence [getLine, getLine, getLine]  
    print rs

main = forever $ do  
    putStr "Informe uma entrada: "  
    l <- getLine  
    putStrLn $ map toUpper l