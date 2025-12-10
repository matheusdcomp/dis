package testes;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SampleTest {

 private java.util.List<Object> listaVazia;

 //Este método será chamado antes de cada método de teste.
 @BeforeAll
 protected void inicializar() {
	 listaVazia = new java.util.ArrayList<Object>();
 } 

 //Após cada método de teste, este método é invocado para limpar o lixo.
 @AfterAll
 protected void terminou() {
	 listaVazia = null;
 }

 //Todo método com a anotação @Test será executado pelo JUnit.
 //O método comportamento faz uma chamada ao método assertEquals 
 //(mensagem, valor esperado, valor atual) que verifica se o resultado 
 //de "listaVazia.size()" é igual a 0 (zero) que é o valor esperado, 
 //caso contrário emite uma mensagem.
 @Test
 public void comportamento() {
   Assertions.assertEquals(
    0, listaVazia.size(), "A lista vazia deve ter 0 elementos");
 }

 //Este método testa a exceção. Ela deve ser lançada, pois não existe
 //nenhum item na lista. Caso contrário a implementação tem problemas.
 @Test
 public void lancarException() {
  IndexOutOfBoundsException e = Assertions.assertThrows(
    IndexOutOfBoundsException.class,
    () -> { listaVazia.get(0); },
    "Era esperada uma IndexOutOfBoundsException, mas não foi lançada."	 
   );
 }
}