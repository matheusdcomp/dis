from tkinter import *
#from tkinter.ttk import *

class Calculadora:

  def __init__(self):

    self.valor = None
    self.operador = None 
    
    janela = Tk()
    janela.title("Calculadora")
    #janela.geometry("800x400")

    self.display = Entry(janela, text="0", width=20, font=("arial",20))
    self.display.grid(row=0, column=0, rowspan=1, columnspan=2, sticky=(N, S, E, W))
    self.display.focus_force()
    self.btsoma = Button(janela, text="+", width=10, font=("arial",20), command=lambda: self.cliqueOP("+"))
    self.btsoma.grid(row=1, column=0, sticky=(N, S, E, W))
    self.btsubt = Button(janela, text="-", width=10, font=("arial",20), command=lambda: self.cliqueOP("-"))
    self.btsubt.grid(row=1, column=1, sticky=(N, S, E, W))
    self.btmult = Button(janela, text="x", width=10, font=("arial",20), command=lambda: self.cliqueOP("*"))
    self.btmult.grid(row=2, column=0, sticky=(N, S, E, W))
    self.btdivi = Button(janela, text="÷", width=10, font=("arial",20), command=lambda: self.cliqueOP("/"))
    self.btdivi.grid(row=2, column=1, sticky=(N, S, E, W))
    self.btrstd = Button(janela, text="=", font=("arial",20), command=self.cliqueRstd)
    self.btrstd.grid(row=3, column=0, sticky=(N, S, E, W))
    self.btzera = Button(janela, text="C", font=("arial",20), command=self.cliqueZera)
    self.btzera.grid(row=3, column=1, sticky=(N, S, E, W))

    janela.rowconfigure(0, weight=1)
    janela.rowconfigure(1, weight=1)    
    janela.rowconfigure(2, weight=1)
    janela.rowconfigure(3, weight=1)
    janela.columnconfigure(0, weight=1)
    janela.columnconfigure(1, weight=1)
    janela.mainloop()

  def executaOperacao(self):
    if self.operador == "+":
      self.valor += float(self.display.get()) 
    elif self.operador == "-":
      self.valor -= float(self.display.get()) 
    elif self.operador == "*":
      self.valor *= float(self.display.get()) 
    elif self.operador == "/":
      self.valor /= float(self.display.get())
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


Calculadora()