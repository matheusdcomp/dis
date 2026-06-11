from tkinter import *  

class Formulario(Tk):

  def __init__(self):
    super().__init__()
    self.geometry("500x500")  
    self.title("registration form")  
      
    lb1= Label(self, text="Enter Name", width=10, font=("arial",12))  
    lb1.place(x=20, y=120)  
    en1= Entry(self)  
    en1.place(x=200, y=120)  
      
    lb3= Label(self, text="Enter Email", width=10, font=("arial",12))  
    lb3.place(x=19, y=160)  
    en3= Entry(self)  
    en3.place(x=200, y=160)  
      
    lb4= Label(self, text="Contact Number", width=13,font=("arial",12))  
    lb4.place(x=19, y=200)  
    en4= Entry(self)  
    en4.place(x=200, y=200)  
      
    lb5= Label(self, text="Select Gender", width=15, font=("arial",12))  
    lb5.place(x=5, y=240)  
    vars = IntVar()  
    Radiobutton(self, text="Male", padx=5,variable=vars, value=1).place(x=180, y=240)  
    Radiobutton(self, text="Female", padx =15,variable=vars, value=2).place(x=250,y=240)  
    Radiobutton(self, text="others", padx=15, variable=vars, value=3).place(x=350,y=240)  
      
    list_of_cntry = ("United States", "India", "Nepal", "Germany")  
    cv = StringVar()  
    drplist= OptionMenu(self, cv, *list_of_cntry)  
    drplist.config(width=15)  
    cv.set("United States")  
    lb2= Label(self, text="Select Country", width=13,font=("arial",12))  
    lb2.place(x=14,y=280)  
    drplist.place(x=200, y=275)  
      
    lb6= Label(self, text="Enter Password", width=13,font=("arial",12))  
    lb6.place(x=19, y=320)  
    en6= Entry(self, show='*')  
    en6.place(x=200, y=320)  
      
    lb7= Label(self, text="Re-Enter Password", width=15,font=("arial",12))  
    lb7.place(x=21, y=360)  
    en7 =Entry(self, show='*')  
    en7.place(x=200, y=360)  
      
    Button(self, text="Register", width=10).place(x=200,y=400)  



Formulario().mainloop()