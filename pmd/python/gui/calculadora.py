from tkinter import *
#from tkinter.ttk import *

class Calculadora(Tk):

  def __init__(self):

    super().__init__()    
    self.title("Calculadora")
    self.resizable(False, False)
    self.valor = None
    self.operador = None 
    f = ("arial",20)

    self.display = Entry(self, text="0", font=f)
    self.display.pack(fill='x')
    self.display.focus_force()
    
    p1 = Frame(self)
    p1.pack()
    self.btsoma = Button(p1, text="+", width=10, font=f, command=self.opSoma)
    self.btsoma.pack(side=LEFT)
    self.btsubt = Button(p1, text="-", width=10, font=f, command=lambda: self.cliqueOP("-"))
    self.btsubt.pack(side=LEFT)
    
    p2 = Frame(self)
    p2.pack()
    self.btmult = Button(p2, text="x", width=10, font=f, command=lambda: self.cliqueOP("*"))
    self.btmult.pack(side=LEFT)
    self.btdivi = Button(p2, text="÷", width=10, font=f, command=lambda: self.cliqueOP("/"))
    self.btdivi.pack(side=LEFT)
    
    p3 = Frame(self)
    p3.pack()
    self.btrstd = Button(p3, text="=", width=10, font=f, command=self.cliqueRstd)
    self.btrstd.pack(side=LEFT)
    self.btzera = Button(p3, text="C", width=10, font=f, command=self.cliqueZera)
    self.btzera.pack(side=LEFT)

  def opSoma(self):
    self.cliqueOP("+")

  def executaOperacao(self):
    s = self.display.get()
    if self.operador == "+":
      self.valor += float(s) 
    elif self.operador == "-":
      self.valor -= float(s) 
    elif self.operador == "*":
      self.valor *= float(s) 
    elif self.operador == "/":
      self.valor /= float(s)
    else:
      print("Operação inválida")
   

  def cliqueOP(self, operador):   
    if self.valor == None:
      self.valor = float(self.display.get()) 
    else:
      self.executaOperacao()        
    self.operador = operador     
    self.display.delete(0,END)
    self.display.focus_force()
    print(self.valor, " | ", self.operador )


  def cliqueRstd(self):
    if (self.valor,self.operador) == (None,None): 
      return
    self.executaOperacao()
    print(self.valor, " | ", self.operador )
    self.display.delete(0,END)
    self.display.insert(0,str(self.valor))
    self.valor = None
    self.operador = None
  

  def cliqueZera(self):
    self.valor = None
    self.operador = None
    self.display.delete(0,END)
    self.display.focus_force()



Calculadora().mainloop()