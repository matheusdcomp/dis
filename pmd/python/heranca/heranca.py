class A:   
  def __init__(self):	      
    print("Construtor de A")

class B (A):   
  def __init__(self):	 
    super().__init__()     
    print("Construtor de B")


B()
