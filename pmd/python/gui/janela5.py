from tkinter import *
#from tkinter.ttk import *

class Minhaself(Tk):

  def __init__(self):
    super().__init__()
    #self.geometry("800x600")
    ct = Entry(self, font=("Arial", 30), width=30)
    ct.grid(row=0, column=0, columnspan=2, sticky=(N,S,E,W))
    bt = Button(self, text="Botao 1", command=lambda: self.imprime(ct.get()) )
    bt.grid(row=1, column=0, sticky=(N,S,E,W))
    bt = Button(self, text="Botao 2" )
    bt.grid(row=1, column=1, sticky=(N,S,E,W))
    self.columnconfigure(0, weight=1)
    self.rowconfigure(0, weight=1)
    self.columnconfigure(1, weight=1)
    self.rowconfigure(1, weight=1)
    
  
  def imprime(self, texto):
    print(texto)


j = Minhaself()
j.mainloop()