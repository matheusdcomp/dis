package excecoes;

import java.util.Scanner;

public class ArgumentoInvalidoException extends Exception {
    public ArgumentoInvalidoException(int arg){
      super("Argumento invalido: " + arg);
    }
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      try{        
        System.out.print("Digite um inteiro: ");
        int inteiro = s.nextInt();
        s.close();
        if(inteiro > 10 || inteiro < 0)
          throw new ArgumentoInvalidoException(inteiro);
     }  
     catch(ArgumentoInvalidoException e){
       System.err.println(e.getMessage());
     }     
   }
}
