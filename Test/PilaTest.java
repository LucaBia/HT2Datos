import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilaTest {

    /**
     * Test de la clase Pila. Verifica el tamanio inicial del vector.
     */
    @Test
    public void sizeTest(){
        Pila pila = new Pila();
        int expectedResult = 0;
        int result = pila.size();
        assertEquals(expectedResult, result);
    }


}
