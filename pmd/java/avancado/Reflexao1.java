package avancado;

import java.lang.reflect.InvocationTargetException;

import classes.Pessoa;

public class Reflexao1 {
  public static void main(String[] args) {
    
    try {
      Class<?> classe = Class.forName("classes.Pessoa");
      Pessoa p = (Pessoa) classe.getConstructor(int.class, String.class).newInstance(15,"JOAO");      
      System.out.println(p);      
    } catch (ClassNotFoundException e) {
      System.err.println("Nome incorreto da classe.");
    } catch (InstantiationException e) {
      System.err.println("A classe não pode ser instanciada porque é abstrata ou interface.");
    } catch (IllegalAccessException e) {
      System.err.println("O construtor da classe não é acessível.");
    } catch (IllegalArgumentException e) {
      System.err.println("Não existe construtor com esses parâmetros");
    } catch (InvocationTargetException e) {
      System.err.println("O construtor não pôde ser invocado.");
    } catch (NoSuchMethodException e) {
      System.err.println("Não existe esse método (construtor)");
    } catch (SecurityException e) {
      System.err.println("O método invocado é privado ou protegido.");
    }
  }
}
