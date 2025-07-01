import System.IO
import Data.Maybe


data Bloco = Vazio | Blc Char
  deriving Eq 

instance Show Bloco where
  show Vazio   = "[ ]"
  show (Blc c) = '[':c:"]"
  

data Jogador = Jgd {nome::String, letra::Char} 
 deriving Read
 
instance Show Jogador where
  show j = nome j ++ " " ++ [letra j]


data Tabuleiro = Tab {
  j1::Jogador,
  j2::Jogador,
  bs::[Bloco]
}

blocos = [Vazio,Vazio,Vazio,Vazio,Vazio,Vazio,Vazio,Vazio,Vazio]

instance Show Tabuleiro where
  show tab = show (j1 tab) ++ " | " ++ show (j2 tab) ++
    "\n" ++ show ((bs tab) !! 0) ++ show ((bs tab) !! 1) ++ show ((bs tab) !! 2) ++ 
    "\n" ++ show ((bs tab) !! 3) ++ show ((bs tab) !! 4) ++ show ((bs tab) !! 5) ++ 
    "\n" ++ show ((bs tab) !! 6) ++ show ((bs tab) !! 7) ++ show ((bs tab) !! 8)


menu :: String -> IO()
menu arq = do
  putStr "Digite o nome do jogador X: "
  n1 <- getLine
  putStr "Digite o nome do jogador O: "
  n2 <- getLine
  let tab = Tab (Jgd n1 'X') (Jgd n2 'O') blocos
  ntab <- jogar tab 1
  putStrLn $ "\n" ++ show ntab
  salvar ntab arq


jogar :: Tabuleiro -> Int -> IO Tabuleiro
jogar (Tab j1 j2 bs) turno = do
  if (turno > 9) then
    return (Tab j1 j2 bs)
  else if alguemGanhou bs then do
    putStrLn $ "Jogador " ++ show j2 ++ " ganhou!\n"
    return (Tab j1 j2 bs)
  else do 
    print (Tab j1 j2 bs)
    putStr $ "\nJogador " ++ show j1 ++ ", informe a posição (1-9) da jogada: "
    pj <- getLine
    let bs1 = registrarJogada j1 (read pj :: Int) bs
    if bs1 == Nothing then do
      putStrLn $ "\nA posição " ++ pj ++ " está ocupada." 
      jogar (Tab j1 j2 bs) turno
    else jogar (Tab j2 j1 (fromJust bs1)) (turno+1)


alguemGanhou :: [Bloco] -> Bool
alguemGanhou bs = 
  ag 0 1 2 || ag 3 4 5 || ag 6 7 8 || 
  ag 0 3 6 || ag 1 4 7 || ag 2 5 8 ||
  ag 0 4 8 || ag 2 4 6
  where 
    ag a b c = bs!!a /= Vazio && bs!!a == bs!!b && bs!!a == bs!!c

registrarJogada :: Jogador -> Int -> [Bloco] -> Maybe [Bloco]
registrarJogada j 1 (a:b) 
  | a == Vazio = Just (Blc (letra j) : b) 
  | otherwise = Nothing 
registrarJogada j p (a:b) 
  | rec /= Nothing = Just (a : fromJust rec)  
  | otherwise = rec  
  where rec = registrarJogada j (p-1) b

salvar tab arq = do
  handle <- openFile arq WriteMode
  hPutStrLn handle (show tab)
  hClose handle