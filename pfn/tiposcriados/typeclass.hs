
class Nominal t where
  nome :: t -> String

instance Nominal Int where
  nome n = show n

class Visible t where
  toString :: t -> String
  size :: t -> Int

instance Visible Char where
  toString ch = [ch]
  size _ = 1

instance Visible Int where
  toString n = "0"
  size _ = 1
