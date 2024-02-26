from tkinter import filedialog
from tkinter import *

root = Tk()
root.filename =  filedialog.askopenfilename(initialdir = "c:\\",title = "Select file",filetypes = (("Arquivo de texto","*.txt"),("Todos os arquivos","*.*")))
print (root.filename)