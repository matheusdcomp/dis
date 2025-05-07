-- Obs.: Só é obrigatório definir o cabeçalho da questão 7, pois
-- é a única questão que está definida para um tipo específico (Int)

--1
foldll f (h:t) = foldll' f h t

foldll' _ r [] = r
foldll' f r (h:t) = foldll' f (f r h) t

-- foldll (+) [1,2,3,4]
-- foldll' (+) 1 [2,3,4]
-- foldll' (+) ((+) 1 2) [3,4]
-- foldll' (+) ((+) ((+) 1 2) 3) [4]
-- foldll' (+) ((+) ((+) ((+) 1 2) 3) 4) []
-- (+) ((+) ((+) 1 2) 3) 4
-- (+) ((+) 3 3) 4 
-- (+) 6 4 
-- 10 


--2
foldrl _ [x] = x
foldrl f (h:t) = f (foldrl f t) h

-- foldrl (+) [1,2,3]
-- (+) (foldrl (+) [2,3]) 1
-- (+) ((+) (foldrl (+) [3]) 2) 1
-- (+) ((+) 3 2) 1
-- (+) 5 1
-- 6


--3
q3 _ [] = False
q3 f (h:t) = if f h then True else q3 f t
 

--4 
--Não tem caso base, pois se nenhum elemento der True 
--ou a lista for vazia, o programa acusa erro
q4 f (h:t) = if f h then h else q4 f t


--5
q5 v [] = v
q5 v (f:t) = q5 (f v) t


--6 versão em que a entrada e saída das funções 
--  devem ser do mesmo tipo
q6 [] lv = lv
q6 lf [] = []
q6 (f:ft) (v:vt) = (f v) : q6 ft vt

--6 versão em que a entrada e saída das funções 
--  podem ser de tipos diferentes
q6' [] lv = []
q6' lf [] = []
q6' (f:ft) (v:vt) = (f v) : q6' ft vt


--7
q7 :: (Int -> Bool) -> (Int -> Int) -> [Int] -> [Int]
q7 _ _ [] = []
q7 fb fi (h:t)
  | fb h      = fi h : q7 fb fi t
  | otherwise = q7 fb fi t


--8
cabeca lst = (last.reverse) lst
