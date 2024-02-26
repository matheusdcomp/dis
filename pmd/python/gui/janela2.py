from tkinter import *

class MinhaJanela (Frame): #Esta classe é um painel
 
    def __init__(self, master = None): 
        super().__init__(master) #isso faz com que self.master = master
        self.pack(padx=20, pady=20) #margem do painel
        self.botao1 = Button(self, text = 'Oi!')
        self.botao1['background'] = 'green'
        self.botao1['font'] = ('Verdana', '12', 'italic', 'bold')
        self.botao1['height'] = 3
        self.botao1.pack()
        self.botao2 = Button(self, bg = 'red', font = ('Times','16'))
        self.botao2['text'] = 'Tchau!'
        self.botao2['fg'] = 'yellow'
        self.botao2['width'] = 12
        self.botao2['command'] = master.quit 
        self.botao2.pack()

 
master = Tk() 
MinhaJanela(master) 
master.mainloop()