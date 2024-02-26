package heranca;

import java.io.Serializable;

public class PessoaFisica extends Pessoa implements Identificavel, Serializable {

  private String cpf;

  public PessoaFisica() {
    super();
    this.cpf = null;
  }

  public PessoaFisica(String nome, String cpf) {
    super(nome);
    this.cpf = cpf;
  }

  public String getCPF() {
    return this.cpf;
  }

  public void setCPF(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return super.toString() + "\tCPF: " + this.cpf;
  }

  public String getDocumento() {
    return "CPF: " + this.cpf;
  }

  public String getId() {
    return this.cpf;
  }

}