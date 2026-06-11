from tkinter import *

class MinhaJanela(Tk):

  def __init__(self):
    super().__init__()
    container1 = Frame(self)  # frame é um painel
    # um painel é um container, assim como a janela
    container2 = Frame(self)
    # cada painel permite uma configuração de layout
    container3 = Frame(self)
    container1.pack()
    container2.pack()
    container3.pack()
    # container1 alinha seus widgets pelo topo, pois pack() equivale a pack(side=TOP)
    Button(container1, text='B1', font=("Arial", 30)).pack()
    # container2 alinha seus widgets a esquerda
    Button(container2, text='B2', font=("Arial", 30)).pack(side=LEFT)
    Button(container2, text='B3', font=("Arial", 30)).pack(side=LEFT)
    # container3 alinha seus widgets a direita
    Button(container3, text='B4', font=("Arial", 30)).pack(side=RIGHT)
    Button(container3, text='B5', font=("Arial", 30)).pack(side=RIGHT)
    Button(container3, text='B6', font=("Arial", 30)).pack(side=RIGHT)



app = MinhaJanela()
app.mainloop()