data Pilha t = Plh [t]

instance (Show t) => Show (Pilha t) where
  show (Plh []) = "|"
  show (Plh (a:b)) = "|" ++ show a ++ show (Plh b)

pinserir :: t -> Pilha t -> Pilha t
pinserir v (Plh lst) = Plh (v:lst)  

premover :: Pilha t -> Pilha t
premover (Plh []) = (Plh [])
premover (Plh (_:b)) = (Plh b)

topo :: Pilha t -> Maybe t
topo (Plh []) = Nothing
topo (Plh (a:_)) = Just a

base :: Pilha t -> Maybe t
base (Plh []) = Nothing
base (Plh [a]) = Just a
base (Plh (_:b)) = base (Plh b)

pvazia :: Pilha t -> Bool
pvazia (Plh []) = True
pvazia _ = False

pilha = Plh [1,2,3,4,5]


-- ----------------------------------
data Fila t = Vazia | Fl t (Fila t)

instance (Show t) => Show (Fila t) where
  show Vazia = "<"
  show (Fl x f) = "<" ++ (show x) ++ (show f)

finserir :: t -> Fila t -> Fila t
finserir x Vazia = Fl x Vazia
finserir x (Fl a f) = Fl a (finserir x f) 

fremover :: Fila t -> Fila t
fremover Vazia = Vazia
fremover (Fl x f) = f

primeiro :: Fila t -> Maybe t
primeiro Vazia = Nothing
primeiro (Fl x _) = Just x

ultimo :: Fila t -> Maybe t
ultimo Vazia = Nothing
ultimo (Fl x Vazia) = Just x
ultimo (Fl _ f) = ultimo f  

fvazia :: Fila t -> Bool
fvazia Vazia = True
fvazia _ = False

fila = Fl 1 (Fl 2 (Fl 3 (Fl 4 (Fl 5 Vazia))))
