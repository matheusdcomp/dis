leiaAte :: IO ( )
leiaAte = do
  putStrLn "Digite um nome ou fim para encerrar: " 
  nome <- getLine
  if nome == "fim"
  then return ()
  else do
    putStrLn "Digite 3 numeros: "  
    ns <- 
    putStrLn (nome ++ " " ++ show ((sum ns)/3.0) ++ "\n")
    leiaAte

getDouble :: IO [Double]
getDouble = sequence [readLn::IO Double, readLn::IO Double, readLn::IO Double]

main = leiaAte