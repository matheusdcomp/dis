--module Exslide15q4 (ArvBusBin,add,remove,tamanho,altura,fromList) where

add :: Ord t => t -> ArvBusBin t -> ArvBusBin t
remove :: Ord t => t -> ArvBusBin t -> ArvBusBin t
tamanho :: ArvBusBin t -> Int
altura :: ArvBusBin t -> Int
fromList :: Ord t => [t] -> ArvBusBin t

data ArvBusBin t = ArvVazia | No (ArvBusBin t) t (ArvBusBin t)

instance (Show t) => Show (ArvBusBin t) where
  show ArvVazia = "#"
  show (No esq v dir) = show esq ++ " " ++ show v ++ " " ++ show dir

add x ArvVazia = No ArvVazia x ArvVazia
add x (No esq v dir)
  | x < v = No (add x esq) v dir
  | otherwise = No esq v (add x dir)

remove _ ArvVazia = error "Árvore vazia"
remove x (No esq v dir)
  | x < v  = No (remove x esq) v dir
  | x > v  = No esq v (remove x dir)
  | x == v = removeNo (No esq v dir)

removeNo :: Ord t => ArvBusBin t -> ArvBusBin t
removeNo (No ArvVazia v ArvVazia) = ArvVazia
removeNo (No esq v ArvVazia) = esq
removeNo (No ArvVazia v dir) = dir
removeNo (No esq v dir) = No (remove me esq) me dir
  where me = maiorElem esq

maiorElem :: Ord t => ArvBusBin t -> t
maiorElem ArvVazia = error "Árvore vazia"
maiorElem (No _ v ArvVazia) = v
maiorElem (No _ v dir) = maiorElem dir

tamanho ArvVazia = 0
tamanho (No esq _ dir) = 1 + tamanho esq + tamanho dir

altura ArvVazia = 0
altura (No esq _ dir) = 1 + max (altura esq) (altura dir)

fromList ls = fList ls ArvVazia
  where
    fList [] arv = arv
    fList (x:xs) arv = fList xs (add x arv) 
