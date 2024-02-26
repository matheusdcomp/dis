package heranca;

public class PessoaJuridica extends Pessoa implements Identificavel {

  private String cnpj;

  public PessoaJuridica() {
    super();
    this.cnpj = null;
  }

  public PessoaJuridica(String nome, String cnpj) {
    super(nome);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  @Override
  public String toString() {
    return super.toString() + "\tcnpj: " + this.cnpj;
  }

  public String getDocumento() {
    return "CNPJ: " + this.cnpj;
  }

  public String getId() {
    return this.cnpj;
  }

}
