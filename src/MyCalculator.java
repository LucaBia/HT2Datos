public class MyCalculator implements Calculator {

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
