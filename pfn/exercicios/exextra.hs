import System.IO

--1
data Disciplina = Dis {codigo::Int, nome::String, valor::Float}
  deriving (Show,Read,Eq)

--2
data Matricula = Mat {numero::Int, aluno::String, periodo::String, disciplinas::[Disciplina]}
  deriving (Show,Read,Eq)

--3
totalMatricula :: Matricula -> Float
totalMatricula (Mat _ _ _ ld) = sum [valor d | d <- ld]

totalMatricula2 :: Matricula -> Float
totalMatricula2 (Mat _ _ _ []) = 0
totalMatricula2 (Mat n a p (h:t)) = valor h + totalMatricula2 (Mat n a p t)

totalMatricula3 :: Matricula -> Float
totalMatricula3 (Mat _ _ _ ld) = totaldis ld
  where 
  	totaldis :: [Disciplina] -> Float
  	totaldis [] = 0
  	totaldis (h:t) = valor h + totaldis t

--4
menu :: String
menu = "\n0-Sair\n1-Disciplina\n2-Matrícula\nDigite sua opção: "

--5
menuDisciplina :: String
menuDisciplina = "\n0-Voltar\n1-Cadastrar Disciplina" ++
  "\n2-Vizualizar Disciplina\nDigite sua opção: "

menuMatricula :: String
menuMatricula = "\n0-Voltar\n1-Cadastrar Matrícula" ++
  "\n2-Vizualizar Matrícula\nDigite sua opção: "


--6
buscaDisciplina :: Int -> IO (Maybe Disciplina)
buscaDisciplina cod = do
  arq <- openFile "disciplinas.txt" ReadMode 
  dis <- buscaDis cod arq
  hClose arq
  return dis

buscaDis :: Int -> Handle -> IO (Maybe Disciplina)
buscaDis cod arq = do
  fim <- hIsEOF arq
  if fim
  then return Nothing
  else do	
    str <- hGetLine arq
    let dis = read str :: Disciplina 
    if cod == codigo dis
    then return (Just dis)
    else do
  	  buscaDis cod arq

--7
showDisciplina :: Disciplina -> String
showDisciplina (Dis c n v) = 
  "\nCódigo: " ++ show c ++
  "\nNome: " ++ n ++
  "\nValor: " ++ show v


--8
cadastrarDisciplina :: IO()
cadastrarDisciplina = do
  putStr "Digite o código da disciplina: "
  c <- getLine
  putStr "Digite o nome da disciplina: "
  n <- getLine
  putStr "Digite o valor da disciplina: "
  v <- getLine
  let dis = (Dis (read c) n (read v))
  arq <- openFile "disciplinas.txt" AppendMode
  hPutStrLn arq (show dis)
  hClose arq 

--9
main = do
  putStr menu
  op <- getLine
  case op of
  	"0" -> return ()
  	"1" -> do
  	  caddis
  	  main
  	"2" -> do
  	  cadmat
  	  main
  	_ -> main

caddis :: IO()
caddis = do
  putStr menuDisciplina
  op <- getLine
  case op of
  	"0" -> return ()
  	"1" -> do
  	  cadastrarDisciplina
  	  caddis
  	"2" -> do
  	  putStr "\nDigite o código da disciplina: "
  	  cod <- getLine	
  	  dis <- buscaDisciplina (read cod :: Int)
  	  if dis == Nothing
      then do
      	putStrLn "\nDisciplina inexistente."
      	caddis
      else do
        showDisciplina (fromJust dis)	
  	    caddis
  	_ -> caddis  
  	   
cadmat :: IO()
cadmat = do
  putStr menuMatricula	