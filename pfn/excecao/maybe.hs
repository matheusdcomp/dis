import Data.Maybe

fatorial :: Int -> Maybe Int
fatorial 0 = Just 1
fatorial n 
  | n < 0 = Nothing 
  | otherwise = Just (n * fromJust (fatorial (n-1))) 

getFatorial :: Int -> IO (Maybe Int)
getFatorial n = return (fatorial n)

main = do
	putStr "Digite um inteiro: "
	n <- getLine
	f <- getFatorial (read n)
	if f == Nothing
	then putStr (n ++ " não é uma entrada válida para a função fatorial.\n")
	else putStr ("O fatorial de " ++ n ++ " é " ++ show (fromJust f) ++ ".\n") 
