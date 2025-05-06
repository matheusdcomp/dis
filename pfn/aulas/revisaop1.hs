inv [] = []
inv (a:b) = inv b ++ [a]

inverte ls =  invt ls []
  where 
    invt [] rs = rs
    invt (a:b) rs = invt b (a:rs)   

rmv e ls = [x | x <- ls, x/=e]