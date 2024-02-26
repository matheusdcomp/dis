package factorya.hello;

public class ArquivoHelloWorldFactory extends HelloWorldFactory {

  @Override
  public FormatoSaida getFormatoSaida() {
    return new SaidaArquivo();
  }

}
