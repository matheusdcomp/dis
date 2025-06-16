--module Exslide12q3 (
-- Lista, add, remove,
-- len, vazia, concatena,
-- fromList, readLst
-- ) where

add :: t -> Int -> Lista t -> Lista t
remove :: Int -> Lista t -> Lista t
len :: Lista t -> Int
vazia :: Lista t -> Bool
concatena :: Lista t -> Lista t -> Lista t
fromList :: [t] -> Lista t
readLst :: Read t => String -> Lista t

data Lista t = ListaVazia | Lst t (Lista t) deriving (Read)

instance (Show t) => Show (Lista t) where
  show ls = "[" ++ (impr ls) ++ "]"

data Ponto = Pt Float Float

impr :: Show t => Lista t -> String
impr ListaVazia = ""
impr (Lst x ListaVazia) = show x
impr (Lst x ls) = show x ++ "," ++ impr ls

--instance (Read t) => Read (Lista t) where
--  readsPrec d r = readLst


readLst "[]" = ListaVazia
readLst ls   = fromList [read x | x <- splitOn ',' lx ]
  where lx = [e | e <- ls, notElem e "[]"]

splitOn :: Char -> String -> [String]
splitOn _ [] = []
splitOn d ls = s : if null xs then [] else splitOn d (tail xs)
  where (s,xs) = break (==d) ls

fromList [] = ListaVazia
fromList (x:xs) = Lst x (fromList xs)

add x 0 ListaVazia = Lst x ListaVazia
add _ _ ListaVazia = error "Posição inválida"
add x 0 (Lst y ls) = Lst x (Lst y ls)
add x i (Lst y ls)
  | i < 0 || i > len (Lst y ls) = error "Posição inválida"
  | otherwise = Lst y (add x (i-1) ls)

remove _ ListaVazia = error "Posição inválida"
remove 0 (Lst x ls) = ls
remove i (Lst x ls) = Lst x (remove (i-1) ls)

len ListaVazia = 0
len (Lst _ ls) = 1 + len ls

vazia ListaVazia = True
vazia _ = False

concatena ListaVazia ly = ly
concatena lx ListaVazia = lx
concatena (Lst x lx) ly = Lst x (concatena lx ly)
