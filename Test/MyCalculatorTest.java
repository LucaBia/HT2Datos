import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyCalculatorTest {

    /**
     * Test de la clase MyCalculator. Verifica si el calculo aritmetico se realiza correctamente.
     */
    @Test
    public void calculatorTest(){
        int a = 3;
        int b = 7;
        String option = "+";
        MyCalculator calculator = new MyCalculator();
        int expectedResult = 10;
        int result = calculator.calculate(a,b,option);
        assertEquals(expectedResult, result);
    }
}
