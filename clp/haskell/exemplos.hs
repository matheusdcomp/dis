
soma3Int a b c = a + b + c

bissexto ano = if (mod ano 400) == 0 
  then "Bisexto" 
  else "Nao bissexto" 

funA _ [] = []
funA 0 lst = lst
funA x (_:t) = funA (x-1) t



 