module Tabela (Tabela, add, tamanho) where

add :: t -> Int -> Int -> Tabela t -> Tabela t
tamanho :: Tabela t -> Int

data Tabela t = Tb [[t]]

instance (Show t) => Show (Tabela t) where
  show (Tb []) = ""
  show (Tb (l:ls)) = prt l ++ "\n" ++ show (Tb ls)
    where
      prt [] = ""
      prt (h:t) = show h ++ " " ++ prt t

add v i j (Tb ls) = Tb (addl v i j ls) 

addl :: t -> Int -> Int -> [[t]] -> [[t]]
addl v _ _ [] = [[v]] 
addl v 0 j (l:ls) = addc v j l : ls
addl v i j (l:ls) = l : addl v (i-1) j ls

addc :: t -> Int -> [t] -> [t]
addc v _ [] = [v]
addc v 0 ls = v:ls
addc v j (c:s) = c : addc v (j-1) s

tamanho (Tb ls) = length (concat ls)

