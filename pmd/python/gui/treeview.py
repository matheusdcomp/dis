#!/usr/bin/env python
# -*- coding: utf-8 -*-
#
#  ttkTreeview.py
#  Copyright 2018-09-20 tavares <tavares@tavares-Inspiron-5558>
#  1.0
#  #
#
import tkinter as tk
from tkinter import ttk
 
 
class TtkDemo(object):
 
    def __init__(self, **kw):
 
        self.root = tk.Tk()
        self.root.title("TTK Treview demo 1")
        self.createframe()
        self.createTreeview()
 
    def createTreeview(self):
        self.tvw = ttk.Treeview(self.mainframe)
        self.oferta = self.tvw.insert('', 'end', 'ofertas', text='Ofertas do dia')
        idMono = self.tvw.insert('ofertas', 'end', text='Monociclos')
        idDici = self.tvw.insert('ofertas', 'end', text='Diciclos')
        idPati = self.tvw.insert('ofertas', 'end', text='Patinetes')
        idBici = self.tvw.insert('ofertas', 'end', text='Bicicletas')
 
        idMonoMarca1 = self.tvw.insert(idMono, 'end', text='Marca1')
        idMonoMarca2 = self.tvw.insert(idMono, 'end', text='Marca2')
        idMonoMarca3 = self.tvw.insert(idMono, 'end', text='Marca3')
 
        idDiciMarca1 = self.tvw.insert(idDici, 'end', text='Marca11')
        idDiciMarca2 = self.tvw.insert(idDici, 'end', text='Marca21')
        idDiciMarca3 = self.tvw.insert(idDici, 'end', text='Marca31')
         
        idPatiMarca1 = self.tvw.insert(idPati, 'end', text='Marca12')
        idPatiMarca2 = self.tvw.insert(idPati, 'end', text='Marca22')
        idPatiMarca3 = self.tvw.insert(idPati, 'end', text='Marca32')
         
        idBiciMarca1 = self.tvw.insert(idBici, 'end', text='Marca12')
        idBiciMarca2 = self.tvw.insert(idBici, 'end', text='Marca22')
        idBiciMarca3 = self.tvw.insert(idBici, 'end', text='Marca32')       
        self.tvw.pack()
 
    def createframe(self):
        self.s=ttk.Style()
        self.s.theme_use('classic')
         
        self.s.configure('TFrame', background='yellow', borderwidth='10',
                    relief=tk.RAISED)
        self.mainframe = ttk.Frame(self.root,
                                   padding='1c')
        self.mainframe.pack(fill=tk.BOTH, expand='yes')
 
    def execute(self):
        self.root.mainloop()
 
 
def main(args):
    myApp = TtkDemo()
    myApp.execute()
    return 0
 
    return 0
 
if __name__ == '__main__':
    import sys
    sys.exit(main(sys.argv))