package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    @Test
    public void testaSoma() {
        assertEquals(3, Calculadora.soma(1,3), "A soma de 1 e 3 deve ser 4"); //Vai falhar
    }

}

