import Data.Maybe (fromJust)

--1
mytake :: Int -> [a] -> [a]
mytake 0 _ = []
mytake n (h:t) = h : mytake (n-1) t

mydrop :: Int -> [a] -> [a]
mydrop 0 ls = ls
mydrop n (h:t) = mydrop (n-1) t

--2
cat :: [a] -> [a] -> [a]
cat l1 [] = l1
cat [] l2 = l2
cat (h1:t1) l2 = h1 : cat t1 l2

--3
mylast :: [a] -> Maybe a
mylast [] = Nothing
mylast [e] = Just e
mylast (h:t) = mylast t

--4
menor :: [Int] -> Maybe Int
menor [] = Nothing
menor [x] = Just x
menor (x:r) = Just (min x (fromJust (menor r)))

--5
bubblesort :: Ord a => [a] -> [a]
bubblesort [] = []
bubblesort lst = bubblesort (init (bsort lst)) ++ [last (bsort lst)]

bsort :: Ord a =>  [a] -> [a]
bsort (x:y:xs)
  | x > y = y : bsort (x:xs)
  | otherwise = x : bsort (y:xs)
bsort xs = xs
