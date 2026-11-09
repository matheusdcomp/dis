from tkinter import * #dependendo do SO, pode precisar instalar

class Janela:
 
  def __init__(self): 
    janela = Tk() #cria a janela do programa
    #janela.title("JANELA")
    #janela.geometry("500x400")
    self.bt1 = Button(janela, text="SAIR", fg="red", command=janela.destroy)
    self.bt1.pack(side=LEFT) 
    self.bt2 = Button(janela, text="Hello", command=self.hello)
    self.bt2.pack(side=LEFT)
    janela.mainloop() #ativa a janela

  def hello(self):
    print ("Hello World!")
 


app = Janela() 
