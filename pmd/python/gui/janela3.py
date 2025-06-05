from tkinter import *

class MinhaJanela:
 
    def __init__(self, master=None): 
        self.container1=Frame(master) #frame é um painel
        self.container2=Frame(master) #um painel é um container, assim como a janela
        self.container3=Frame(master) #cada painel permite uma configuração de layout
        self.container1.pack()
        self.container2.pack()
        self.container3.pack()
        #container1 alinha seus widgets pelo topo, pois pack() equivale a pack(side=TOP)
        Button(self.container1,text='B1').pack() 
        #container2 alinha seus widgets a esquerda
        Button(self.container2,text='B2').pack(side=LEFT) 
        Button(self.container2,text='B3').pack(side=LEFT)
        #container3 alinha seus widgets a direita
        self.b4=Button(self.container3,text='B4').pack(side=RIGHT)
        self.b5=Button(self.container3,text='B5').pack(side=RIGHT)
        self.b6=Button(self.container3,text='B6').pack(side=RIGHT)

 
root = Tk() 
app = MinhaJanela(root) 
root.mainloop()