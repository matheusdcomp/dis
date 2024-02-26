--1
menorMaior :: Ord a => [a] -> (a,a)
menorMaior ls = (minimum ls, maximum ls)


--2
separa :: (a -> Bool) -> [a] -> ([a],[a])
separa f ls = ([ x | x <- ls, f x ], [ x | x <- ls, (not.f) x ])


--3
data Pacote a = Vazio | Pac a

instance Show a => Show (Pacote a) where
  show Vazio = "------\n|    |\n------"
  show (Pac c) = t ++ "\n| " ++ s ++ " |\n" ++ t
    where
      s = show c
      t = replicate (length s + 4) '-'

desempacota :: Pacote a -> Maybe a
desempacota Vazio = Nothing
desempacota (Pac c) = Just c


--4
data Pessoa = 
  Pf {nome::String, cpf :: Int} |
  Pj {nome::String, cnpj :: Int}
  deriving (Show,Eq)


--5
isPF :: Pessoa -> Bool
isPF (Pf _ _) = True
isPF (Pj _ _) = False


--6
instance Ord Pessoa where
  p1 > p2 = nome p1 > nome p2
  p1 < p2 = nome p1 < nome p2
  p1 >= p2 = nome p1 >= nome p2
  p1 >= p2 = nome p1 >= nome p2
  max p1 p2 = max (nome p1) (nome p2)
  min p1 p2 = min (nome p1) (nome p2)


--7
class Unico t where
  igual :: t -> t -> Bool
  checkID :: [t] -> [t]


--8
instance Unico Pessoa where

  igual (Pf _ c1) (Pf _ c2) = c1 == c2
  igual (Pj _ c1) (Pj _ c2) = c1 == c2
  igual pj pf = False

  checkID [] = []
  checkID (h:t) = h : checkID [ x | x <- t, not (igual x h) ]

--para testar checkID
pessoas = [(Pf "maria" 4),(Pf "joao" 1),(Pf "jose" 3),(Pf "joao" 1)]
