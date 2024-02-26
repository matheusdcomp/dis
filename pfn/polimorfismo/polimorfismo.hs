tamanho :: [a] -> Int
tamanho [] = 0
tamanho (_:r) = 1 + tamanho r

inverte :: [a] -> [b]
inverte [] = []
inverte (x:r) = inverte r ++ [x] 

mymap :: (a -> b) -> [a] -> [b]
mymap _ [] = []
mymap f (x:r) = f x : mymap f r

myfst :: (a,b) -> a
myfst (x,_) = x 


