from tkinter import *

class MinhaJanela:
 
    def __init__(self, master=None): 
        self.bt1 = Button(master, text="SAIR", fg="red", command=master.quit)
        self.bt1.pack(side=LEFT) 
        self.bt2 = Button(master, text="Hello", command=self.hello)
        self.bt2.pack(side=LEFT)
 
    def hello(self):
        print ("Hello World!")
 

root = Tk() #cria a janela principal do programa
app = MinhaJanela(root) #cria nossa classe que preenche a janela
root.mainloop() #ativa a janela