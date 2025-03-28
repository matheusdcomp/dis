main = do { 
  a <- readLn ; 
  b <- readLn ; 
  print (soma a b) }

soma :: Int -> Int -> Int
soma x y = x + y

