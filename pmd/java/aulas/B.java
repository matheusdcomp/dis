package aulas;

public class B extends A {

 protected int y = 8;

 public String print() {
   return super.print() + "\ny: " + y;
 }
}

