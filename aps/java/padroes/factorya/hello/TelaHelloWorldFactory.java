package factorya.hello;

public class TelaHelloWorldFactory extends HelloWorldFactory {

  @Override
  public FormatoSaida getFormatoSaida() {
    return new SaidaTela();
  }

}
