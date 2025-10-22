package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {

    @Test
    public void testaSoma() {
        assertEquals(3, Calculadora.soma(1,2), 0);
    }

}

