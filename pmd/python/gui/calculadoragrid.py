from tkinter import *
#from tkinter.ttk import *

class Calculadora(Tk):

  def __init__(self):
    super().__init__()  
    self.title("Calculadora")
    self.valor = None
    self.operador = None 
    
    f = ("arial",20)
    m = (N, S, E, W)
    self.display = Entry(self, text="0", width=22, font=f)
    self.display.grid(row=0, column=0, rowspan=1, columnspan=2, sticky=m)
    self.display.focus_force()
    self.btsoma = Button(self, text="+", font=f, command=lambda: self.cliqueOP("+"))
    self.btsoma.grid(row=1, column=0, sticky=m)
    self.btsubt = Button(self, text="-", font=f, command=lambda: self.cliqueOP("-"))
    self.btsubt.grid(row=1, column=1, sticky=m)
    self.btmult = Button(self, text="x", font=f, command=lambda: self.cliqueOP("*"))
    self.btmult.grid(row=2, column=0, sticky=m)
    self.btdivi = Button(self, text="÷", font=f, command=lambda: self.cliqueOP("/"))
    self.btdivi.grid(row=2, column=1, sticky=m)
    self.btrstd = Button(self, text="=", font=f, command=self.cliqueRstd)
    self.btrstd.grid(row=3, column=0, sticky=m)
    self.btzera = Button(self, text="C", font=f, command=self.cliqueZera)
    self.btzera.grid(row=3, column=1, sticky=m)

    self.rowconfigure(0, weight=1)
    self.rowconfigure(1, weight=1)    
    self.rowconfigure(2, weight=1)
    self.rowconfigure(3, weight=1)
    self.columnconfigure(0, weight=1)
    self.columnconfigure(1, weight=1)
  

  def executaOperacao(self):
    s = self.display.get()
    if self.operador == "+":
      self.valor += float() 
    elif self.operador == "-":
      self.valor -= float(s) 
    elif self.operador == "*":
      self.valor *= float(s) 
    elif self.operador == "/":
      self.valor /= float(s)
    
  
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