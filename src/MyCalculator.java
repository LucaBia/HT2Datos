/**
 * MyCalculator implementa la interfaz Calculator para realizar operaciones (postfix)
 */
public class MyCalculator implements Calculator {

    /**
     * Calcula cuales van a ser los numeros u operandos y el signo u operador
     * @param num1 primer operando / numero
     * @param num2 segundo operando / numero
     * @param op operando o signo artimetico
     * @return resultado del calculo
     */
    @Override
    public int calculate(int num1, int num2, String op){
        int res = 0;

        switch (op) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }
        return res;
    }
}
