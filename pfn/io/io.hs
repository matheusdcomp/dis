soma2num :: IO ()
soma2num = do 
  putStr "Digite um número: "
  y <- getLine
  putStr "Digite outro número: "
  x <- getLine
  putStr ("Soma: " ++ show (read x + read y) ++ "\n")

main = do 
  soma2num 


leiaAte :: IO ( )
leiaAte = do 
  nome <- getLine
  if nome == "fim"
  then return ()
  else do
  	n1 <- getDouble
  	n2 <- getDouble
  	n3 <- getDouble
  	putStr (nome ++ show ((n1+n2+n3)/3.0) ++ "\n")
  	leiaAte

getDouble :: IO Double
getDouble = do 
  dado <- getLine
  return (read dado :: Double)