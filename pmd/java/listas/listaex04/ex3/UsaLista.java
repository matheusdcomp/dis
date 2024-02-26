package listas.listaex04.ex3;

public class UsaLista {

  public static void main(String[] args) {

    Lista<Numero> lint = new Lista<>();
    lint.add(new Numero("51235421"));
    lint.add(new Numero("78532984"));
    lint.add(new Numero("2552345"));
    lint.add(new Numero("99921"));
    System.out.println(lint.toString());
    // System.out.println("Index do 4: " + lint.indexOf("4"));
    lint.remove(1);
    System.out.println(lint.toString());

    Lista<Pessoa> lpes = new Lista<>();
    lpes.add(new Pessoa("JOAO", 15));
    lpes.add(new Pessoa("MARIA", 10));
    lpes.add(new Pessoa("JOSE", 25));
    lpes.add(new Pessoa("ANTONIO", 18));
    System.out.println(lpes);

  }

}
