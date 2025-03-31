import Data.Char (digitToInt)

--1
nAnd :: Bool -> Bool -> Bool
nAnd True True = False
nAnd _ _ = True

--2
fibonacci :: Int -> Int
fibonacci 1 = 0
fibonacci 2 = 1
fibonacci p = fibonacci (p-1) + fibonacci (p-2) 

--3
soma :: Word -> Word -> Word
soma x 0 = x
soma x y = soma (succ x) (pred y)

--4
(!&) :: Bool -> Bool -> Bool
True !& True = False
_ !& _ = True

infixl 3 !& 

--5
(===) :: Int -> Char -> Bool
n === c = n == digitToInt c

--6
areaCirculo :: Float -> Float
areaCirculo r = pi * r ^ 2

--7
--x = 3 é a definição de uma função x, sem entradas, cujo resultado é sempre 3.
--x == 3 é uma expressão relacional que verifica se o valor de x é igual a 3.
 
--8
--O operador de difereça não é transitivo, ou seja, mesmo que n /= m && m /= p
--não é garantido que n /= p.