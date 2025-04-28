--1
quicksort :: [Int] -> [Int]
quicksort [] = []
quicksort (p:r) = 
  quicksort (filter (<p) r) 
  ++ [p] ++ 
  quicksort (filter (>=p) r)

--2
mymap _ [] = []
mymap f (a:b) =  f a : mymap f b 

--3
myfoldl _ b [] = b
myfoldl f b (a:r) = myfoldl f (f b a) r

--4
fxl :: (Int->Int) -> Int -> Int -> [Int]
fxl _ _ 0 = []
fxl f x n = x : fxl f (f x) (n-1)  

--5
fgxl _ _ [] = []
fgxl f g (x:r) = (f.g) x : fgxl f g r 

--6
zipw f x y = [f x' y' | x' <- x, y' <- y] 

--7
--Na interface do GHCi, digite ((==0).(`mod` 2)) 1 para testar se o 1 é par.  
--Usando a função da questão 5: fgxl (==0) (`mod` 2) [1,2,3,4,5,6]
