package factorya.hello;

public abstract class HelloWorldFactory {

  public static HelloWorldFactory getFactory(String factory) {
    if (factory.equals("tela"))
      return new TelaHelloWorldFactory();
    else
      return new ArquivoHelloWorldFactory();
  }

  public abstract FormatoSaida getFormatoSaida();

}
