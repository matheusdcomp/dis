module Lista(Lista,add) where

add :: t -> Int -> Lista t -> Lista t

data Lista t = ListaVazia | Lst t (Lista t)

instance (Show t) => Show (Lista t) where
  show ls = "[" ++ (impr ls) ++ "]" 

impr :: Show t => Lista t -> String
impr (ListaVazia) = ""
impr (Lst x ListaVazia) = show x
impr (Lst x ls) = show x ++ "," ++ impr ls

add x 0 (ListaVazia) = Lst x ListaVazia
add _ _ (ListaVazia) = error "Posição inválida"
add x 0 (Lst y ls) = Lst x (Lst y ls)
add x i (Lst y ls) = Lst y (add x (i-1) ls)