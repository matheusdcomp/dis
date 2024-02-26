
import Data.Maybe (fromJust)  --para a funcao buscar no modulo Agenda 
------------------------------------------------------------------------------------
--module Hashtab (Hashtab, add, remove, exists, get) where

data Hashtab a b = HashEnd | Hash a b (Hashtab a b)

add :: Eq a => a -> b -> Hashtab a b -> Hashtab a b
remove :: Eq a => a -> Hashtab a b -> Hashtab a b
exists :: Eq a => a -> Hashtab a b -> Bool
get :: Eq a => a -> Hashtab a b -> Maybe b


instance (Show a, Show b) => Show (Hashtab a b) where
    show HashEnd = ""
    show (Hash ch vl ht) = show ch ++ ":" ++ show vl ++ "\n" ++ show ht 


add ch vl HashEnd = Hash ch vl HashEnd
add ch vl ht = if exists ch ht then ht else Hash ch vl ht 


remove _ HashEnd = HashEnd
remove c (Hash ch vl ht) = if c == ch then ht else Hash ch vl (remove c ht)


exists _ HashEnd = False
exists c (Hash ch _ ht) = if c == ch then True else exists c ht


get _ HashEnd = Nothing
get c (Hash ch vl ht) = if c == ch then Just vl else get c ht


------------------------------------------------------------------------------------
--module Datas (Data, readData) where

data Data = Dt Int Int Int deriving (Eq)

readData :: String -> Data

instance Show Data where
    show (Dt dia mes ano) = show dia ++ "/" ++ show mes ++ "/" ++ show ano


readData s =  Dt (read (dma !! 0)) (read (dma !! 1)) (read (dma !! 2)) 
    where
        dma = split s '/' 


split :: String -> Char -> [String]
split [] delim = [""]
split (c:cs) delim
    | c == delim = "" : rest
    | otherwise = (c : head rest) : tail rest
    where
        rest = split cs delim

------------------------------------------------------------------------------------
--module Agenda where


main :: IO ()
agenda :: Hashtab Data String -> IO ()
menu :: IO Int
cadastrar :: Hashtab Data String -> IO (Hashtab Data String)
apagar :: Hashtab Data String -> IO (Hashtab Data String)
buscar :: Hashtab Data String -> IO ()


main = agenda HashEnd


agenda ht = do
  op <- menu
  putStr "\n\n"
  case op of
    0 -> return ()
    1 -> do
        newht <- cadastrar ht
        agenda newht
    2 -> do
        newht <- apagar ht
        agenda newht
    3 -> do
        buscar ht
        agenda ht
    4 -> do
        putStrLn $ show ht
        agenda ht
    _ -> do
        putStrLn "\nOPCAO INVALIDA\n"
        agenda ht


menu = do
    putStr "\n\n0 - SAIR\n1 - CADASTRAR\n2 - APAGAR\n3 - BUSCAR\n4 - IMPRIMIR\n\nDIGITE SUA OPCAO: "
    op <- getLine 
    return (read op)
        

cadastrar ht = do
    putStr "Digite a data do compromisso: "
    dt <- getLine
    putStr "Digite a descricao do compromisso: "
    ds <- getLine
    return (add (readData dt) ds ht)


apagar ht = do
    putStr "Digite a data do compromisso: "
    dt <- getLine
    return (remove (readData dt) ht)


buscar ht = do
    putStr "Digite a data do compromisso: "
    dt <- getLine
    ds <- getDescricao (readData dt) ht
    if ds == Nothing 
    then putStrLn $ "\n\nNAO EXISTE COMPROMISSO EM " ++ dt
    else putStrLn $ "\n\n" ++ fromJust ds
      where
        getDescricao umaData hash = return (get umaData hash)

------------------------------------------------------------------------------------
    