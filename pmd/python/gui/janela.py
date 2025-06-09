from tkinter import *
#from tkinter.ttk import *

class MinhaJanela:

  def __init__(self, janela=None):
    #janela.geometry("800x600")
    self.ct = Entry(janela, font=("Arial", 30))
    self.ct["width"] = 30
    ct.grid(row=0, column=0, columnspan=2, sticky=(N,S,E,W))
    bt = Button(janela, text="Botao 1", command=lambda: self.imprime(ct.get()) )
    bt.grid(row=1, column=0, sticky=(N,S,E,W))
    bt = Button(janela, text="Botao 2" )
    bt.grid(row=1, column=1, sticky=(N,S,E,W))
    janela.columnconfigure(0, weight=1)
    janela.rowconfigure(0, weight=1)
    janela.columnconfigure(1, weight=1)
    janela.rowconfigure(1, weight=1)
  
  def imprime(self, texto):
    print(texto)

janela = Tk()
mj = MinhaJanela(janela)
janela.mainloop()