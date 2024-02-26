module ArvBin (ArvBin, tamanho, altura) where

tamanho :: ArvBin t -> Int --calcula a quantidade de elementos
altura :: ArvBin t -> Int --calcula a altura da árvore

data ArvBin t = Folha t | No (ArvBin t) t (ArvBin t)

instance (Show t) => Show (ArvBin t) where
  show (Folha x) = show x
  show (No esq x dir) = show esq ++ " | " ++ show x ++ " | " ++ show dir

tamanho (Folha _) = 1
tamanho (No esq _ dir) = 1 + tamanho esq + tamanho dir

altura (Folha _) = 1
altura (No esq _ dir) = 1 + max (altura esq) (altura dir)

