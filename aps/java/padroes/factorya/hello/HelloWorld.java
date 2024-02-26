package factorya.hello;

public class HelloWorld {

  public static void main(String[] args) {

    HelloWorldFactory factory1 = HelloWorldFactory.getFactory("tela");
    factory1.getFormatoSaida().saida();

    HelloWorldFactory factory2 = HelloWorldFactory.getFactory("arquivo");
    factory2.getFormatoSaida().saida();
  }

}
