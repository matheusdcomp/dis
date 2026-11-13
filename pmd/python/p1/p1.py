class CorRGB:
  def __init__(self, r,g,b):
    self.r = 0
    self.g = 0
    self.b = 0
    if r >= 0 and r <= 255:
      self.r = r        
    if g >= 0 and g <= 255:
      self.g = g        
    if b >= 0 and b <= 255:
      self.b = b        

  def __str__(self):
    return f"{self.r},{self.b},{self.b}"    


class CorRGBA:
  def __init__(self, r,g,b,a):
    super().__init__(r,g,b)
    #self.a = 0      
    #if a >= 0.0 and a <= 1.0:
    self.a = a if a >= 0.0 and a <= 1.0 else self.a = 0       

  def __str__(self):
    return f"{super().__str__()},{self.a}" 

  def transparente(self):
      return self.a == 0.0 


class CorMain:
  cores = []
  def main(self):
    CorMain.cores.append(CorRGB(1,2,3))
    CorMain.cores.append(CorRGB(10,20,30))
    CorMain.cores.append(CorRGBA(1,2,3,0))
    CorMain.cores.append(CorRGBA(13,21,63,1))  

    for c in CorMain.cores:
      print(c)
      if isinstance(CorRGBA,c):
        print("Transparente? ", c.transparente())   