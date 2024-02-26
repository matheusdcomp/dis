--1
remove :: Eq a => a -> [a] -> [a]
remove _ [] = []
remove e (h:t)
  | e == h    = remove e t
  | otherwise = h : remove e t


--2
particiona :: [a] -> ([a],[a])
particiona ls = (p1, p2)
  where
    mt = div (length ls) 2
    p1 = take mt ls
    p2 = drop mt ls


--3
palindromo :: Eq a => [a] -> Bool --versão 1
palindromo []  = True
palindromo [e] = True
palindromo ls
  | head ls == last ls = palindromo (init (tail ls))
  | otherwise = False

palindromo2 :: Eq a => [a] -> Bool --versão 2
palindromo2 ls = ls == reverse ls


--4
primosAte :: Int -> [Int]
primosAte n = primosAteaux n 2
  where
    primosAteaux :: Int -> Int -> [Int]
    primosAteaux n d
      | d > n     = []
      | primo d   = d : primosAteaux n (d+1)
      | otherwise = primosAteaux n (d+1)

primo :: Int -> Bool
primo n = primoaux n 2
  where
    primoaux :: Int -> Int -> Bool
    primoaux n d
      | d > div n 2  = True
      | mod n d == 0 = False
      | otherwise    = primoaux n (d+1)


--5
inteiro :: Int -> (Bool,Bool,Bool)
inteiro n = (primo n, odd n, n > 10)


--6
tuplamap :: (a -> b) -> (a -> c) -> [a] -> [(b,c)]
tuplamap _ _ []    = []
tuplamap f g (h:t) = (f h, g h) : tuplamap f g t


--7
reversemap :: a -> [(a -> b)] -> [b]
reversemap _ []    = []
reversemap x (f:t) = f x : reversemap x t


--8
currymap :: (a -> b) -> (b -> c) -> [a] -> [c]
currymap _ _ []    = []
currymap f g (x:r) = (g . f) x : currymap f g r


--9
mergesort :: Ord a => [a] -> [a]
mergesort []  = []
mergesort [e] = [e]
mergesort ls  = conquista (mergesort l1) (mergesort l2)
  where
    mt = div (length ls) 2
    l1 = take mt ls
    l2 = drop mt ls
    conquista :: Ord a => [a] -> [a] -> [a]
    conquista lx [] = lx
    conquista [] ly = ly
    conquista (hx:tx) (hy:ty)
      | hx < hy  = hx : conquista tx (hy:ty)
      | hx >= hy = hy : conquista (hx:tx) ty


--10
type Data = (Int, Int, Int)
type Nome = String
type Pessoa = (Nome, Data)

estatpes :: [Pessoa] -> ((Nome,Int),[Int])
estatpes lp = (ma, la)
  where
    ma = maisaparece lp
    la = listaanos (fst ma) lp
    maisaparece :: [Pessoa] -> (Nome,Int)
    maisaparece [] = ("",0)
    maisaparece (h:t)
      | och > snd mat = (fst h, och)
      | otherwise     = mat
      where
         och = ocornome (fst h) (h:t)
         mat = maisaparece t
         ocornome :: Nome -> [Pessoa] -> Int
         ocornome _ [] = 0
         ocornome n (h:t) = (if n == fst h then 1 else 0) + ocornome n t
    listaanos :: Nome -> [Pessoa] -> [Int]
    listaanos _ [] = []
    listaanos n (h:t) = (if n == fst h then [ano h] else []) ++ listaanos n t
      where
          ano :: Pessoa -> Int
          ano (n, (d,m,a)) = a

pessoas :: [Pessoa] --criei só para testar a função statpes
pessoas = [("JOAO", (1,1,2012)), ("MATHEUS", (10,10,1990)),
  ("JOAO", (3,9,2002)),("MATHEUS", (8,4,1982)),
  ("MARIA", (20,5,2000)),("MATHEUS", (31,7,2005))]
