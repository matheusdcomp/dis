--1
maiormenor [x] = (x,x) --caso base opcional
maiormenor lst = (minimum lst, maximum lst)

--2
split :: Int -> [a] -> [[a]]
split 0 _  = []
split n ls = split' n tam ls 
  where 
    tam = div (length ls) n
    split' :: Int -> Int -> [a] -> [[a]]
    split' 1 _ ls = [ls]
    split' n t ls = take t ls : split' (n-1) t (drop t ls)


--3
primo :: Int -> (Bool,Int)
primo 1 = (False,1)
primo n = primoaux n (div n 2)
  where
    primoaux :: Int -> Int -> (Bool,Int)
    primoaux _ 1 = (True,1)
    primoaux n d
      | mod n d == 0 = (False,d)
      | otherwise = primoaux n (d-1)


--4
mdcmmc :: Int -> Int -> (Int,Int)  --versão 1
mdcmmc x y = (mdc, mmc)
  where
    mdc = gcd x y
    mmc = lcm x y

mdcmmc2 :: Int -> Int -> (Int,Int)  --versão 2
mdcmmc2 x y = (mdc x y, mmc x y)
  where
    mdc :: Int -> Int -> Int
    mdc a b
      | a == b = a
      | a > b = mdc (a-b) b
      | a < b = mdc b a
    mmc :: Int -> Int -> Int
    mmc a b = div (a*b) (mdc a b)


--5
inv ls = inv' ls []
  where
    inv' [] sl = sl
    inv' (a:b) sl = inv' b (a:sl)


--6
type Dia = Int
type Mes = Int
type Ano = Int

abx :: [Int] --dias em cada mês de um ano bissexto
abx = [0,31,29,31,30,31,30,31,31,30,31,30,31]

anb :: [Int] --dias em cada mês de um ano não bissexto
anb = [0,31,28,31,30,31,30,31,31,30,31,30,31]

bissexto :: Ano -> Bool
bissexto a = mod a 4 == 0 && mod a 100 /= 0 || mod a 400 == 0

diasDoMes :: Ano -> Mes -> Int
diasDoMes a m 
  | m < 1 && m > 12 = 0
  | bissexto a = abx !! m 
  | otherwise = anb !! m


--7
type Data = (Dia,Mes,Ano)

datasIguais :: Data -> Data -> Bool
datasIguais d1 d2 = d1 == d2

diasEntre :: Data -> Data -> Int
diasEntre (d1,m1,a1) (d2,m2,a2)
  | a2 > a1 = dafm1 + dafa1 (m1+1) + daa2 (a1+1) + dam2 1 + d2
  | otherwise = if m2 > m1 then dafm1 + dam2 (m1+1) + d2 else d2 - d1  
  where
    dafm1 = diasDoMes a1 m1 - d1
    dafa1 m = if m > 12 then 0 else diasDoMes a1 m + dafa1 (m+1)
    qda a = if bissexto a then sum abx else sum anb  
    daa2 a = if a >= a2 then 0 else qda a + daa2 (a+1)
    dam2 m = if m >= m2 then 0 else diasDoMes a2 m + dam2 (m+1)  


--8
type Descricao = String
type Compromisso = (Descricao,Data)
type Agenda = [Compromisso]

agenda :: Agenda -- para testar as funções
agenda = [("PF",(30,4,2019)),("REUNIAO",(3,5,2019)),("CLP",(30,4,2019))]

compromissos :: Agenda -> Data -> [Descricao]
compromissos [] _ = []
compromissos ((ds,dt):b) d
  | dt == d   = ds : compromissos b d 
  | otherwise = compromissos b d


--9
dataMaisLotada :: Agenda -> Data -- versão 1
dataMaisLotada [(_,dt)]   = dt
dataMaisLotada ((_,dt):b) 
  | max qvdt qvdb == qvdt = dt 
  | otherwise = dmlb
  where
    qvdt = 1 + qtdData dt b     --quantidade de vezes de dt
    bsdt = (removeData dt b)    --b sem dt
    dmlb = dataMaisLotada bsdt  --data mais lotada de bsdt
    qvdb = (qtdData dmlb bsdt)  --quantidade de vezes de dmlb

dataMaisLotada2 :: Agenda -> Data -- versão 2
dataMaisLotada2 ag = dml2 (qpdt ag)
  where 
    dml2 :: [(Data,Int)] -> Data
    dml2 [(dt,_)] = dt
    dml2 ((dt1,qt1):(dt2,qt2):b) 
      | qt1 > qt2 = dml2 ((dt1,qt1):b)
      | otherwise = dml2 ((dt2,qt2):b)
    qpdt :: Agenda -> [(Data,Int)]
    qpdt [] = []
    qpdt ((_,dt):b) = (dt, 1 + qtdData dt b) : qpdt (removeData dt b)

--funções auxiliares usadas pelas duas versões
qtdData :: Data -> Agenda -> Int
qtdData _ [] = 0
qtdData d ((_,dt):b) = (if d == dt then 1 else 0) + qtdData d b

removeData :: Data -> Agenda -> Agenda
removeData _ [] = []
removeData d ((ds,dt):b) 
  | d == dt   = removeData d b
  | otherwise = (ds,dt) : removeData d b


--10
faltamQntDias :: Agenda -> Descricao -> Data -> (Data,Int)
faltamQntDias [] _ da = (da,0)
faltamQntDias ((ds,dt):b) de da
  | ds == de  = ( dt, diasEntre da dt )
  | otherwise = faltamQntDias b de da