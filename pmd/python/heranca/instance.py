class A:   
  def __init__(self): pass

class B (A):   
  def __init__(self): pass


b = B()

if issubclass(A,object): print("A classe A eh filha da classe object");
if issubclass(B,A): print("A classe B eh filha da classe A");
if isinstance(b,B): print("O objeto b eh uma instancia da classe B");
if isinstance(b,A): print("O objeto b eh uma instancia da classe A");
    
