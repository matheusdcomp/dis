from enum import Enum
from tkinter import *
from tkinter import filedialog
from tkinter import messagebox

from arquivo import Arquivo


class BlocoNotas (Frame):

    def __init__(self, master=None):        
        super().__init__(master)               
        self.configuraJanela()
        self.arquivo = Arquivo()
        

    def configuraJanela(self):    

        self.master.title('Bloco de Notas - Sem título')
        self.master.geometry('600x450')
        self.grid(padx=10, pady=10)
        self.master.protocol("WM_DELETE_WINDOW", self.fechar)  

        self.master.option_add('*tearOff', FALSE)
        mainmenu = Menu(self.master)
        self.master.config(menu=mainmenu) 
        
        menuArquivo = Menu(mainmenu) 
        mainmenu.add_cascade(label='Arquivo', menu=menuArquivo) 
        menuArquivo.add_command(label='Novo', command=self.novo)
        menuArquivo.add_command(label='Abrir', command=self.abrir)
        menuArquivo.add_command(label='Salvar', command=self.salvar)
        menuArquivo.add_command(label='Salvar Como', command=self.salvar)
        menuArquivo.add_separator()
        menuArquivo.add_command(label='Fechar', command=self.fechar)
        
        menuAjuda = Menu(mainmenu)
        mainmenu.add_cascade(label='Ajuda', menu=menuAjuda)
        menuAjuda.add_command(label='Créditos', command=self.creditos)

        self.texto = Text(self)        
        self.texto.grid(row=1, column=1, sticky=NSEW)        
        scroll=Scrollbar(self, orient=VERTICAL, command=self.texto.yview)
        scroll.grid(row=1, column=2, rowspan=15, columnspan=1, sticky=NSEW)
        self.texto.config(yscrollcommand=scroll.set, font=('Arial', 10))
        

    def arquivoModificado(self):
        #END adiciona um \n no retorno de get, end-1c remove o \n
        if self.arquivo.conteudo == self.texto.get(1.0,'end-1c'):
            return Option.NO
        resp = messagebox.askyesnocancel( 'Alerta',
            'O arquivo foi modificado. Deseja salvá-lo?')
        if resp == None: 
            return Option.CANCEL
        elif resp: 
            return Option.YES
        else: 
            return Option.NO 


    def novo(self):        
        salvar = self.arquivoModificado()
        if salvar == Option.YES:
            self.salvar()
        if salvar != Option.CANCEL:
            self.arquivo = Arquivo()
            self.texto.delete(1.0,END) #apaga do caractere 0 da linha 1 até o final
            self.master.title('Bloco de Notas - Sem título')


    def abrir(self):
        salvar = self.arquivoModificado()
        if salvar == Option.YES:
            self.salvar()
        if salvar != Option.CANCEL:
            arq = filedialog.askopenfilename(
                #initialdir = "c:\\",
                title = "Abrir",
                filetypes = (("Arquivo de texto","*.txt"),("Todos os arquivos","*.*")))
            if arq != '':
                self.arquivo.path = arq
                self.arquivo.abrir()
                self.texto.delete(1.0,END) #apaga do caractere 0 da linha 1 até o final
                self.texto.insert(1.0,self.arquivo.conteudo)
                self.master.title('Bloco de Notas - ' + self.arquivo.path)


    def salvar(self):
        if not self.arquivo.salvo:
            arq = filedialog.asksaveasfilename(
                #initialdir = "c:\\",
                title = "Salvar",
                filetypes = (("Arquivo de texto","*.txt"),("Todos os arquivos","*.*")))
            if arq != '':
                self.arquivo.path = arq
        self.arquivo.conteudo = self.texto.get(1.0,'end-1c')
        self.arquivo.salvar()
        self.master.title('Bloco de Notas - ' + self.arquivo.path)


    def fechar(self): 
        opcao = self.arquivoModificado()
        if opcao == Option.YES:
            self.salvar()
            self.master.destroy()
        elif opcao == Option.NO:
            self.master.destroy()
        

    def creditos(self): 
        messagebox.showinfo('Créditos', 'Desenvolvedor: Matheus Viana')


class Option(Enum):
    CANCEL = 0
    YES = 1
    NO = 2


master = Tk()
BlocoNotas(master)
master.mainloop()
