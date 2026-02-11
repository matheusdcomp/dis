package avancado;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import classes.Pessoa;

public class Reflexao2 {
  public static void main(String[] args) {

    Class<Pessoa> cp = Pessoa.class; //ou Class.forName("classes.Pessoa");
    System.out.println("\nNome simples: " + cp.getSimpleName());
    System.out.println("\nNome completo: " + cp.getName());

    System.out.println("\nAtributos:");
    Field atributos[] = cp.getDeclaredFields();
    for (int i = 0; i < atributos.length; i++)
      System.out.println("  " + atributos[i].toString());

    System.out.println("\nMétodos:");
    Method metodos[] = cp.getDeclaredMethods();
    for (int i = 0; i < metodos.length; i++)
      System.out.println("  " + metodos[i].toString());
  }  
}