import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        //para leer el archivo
        ArrayList<String> cubilete = new ArrayList<String>();
        try {
            Stream<String> lines = Files.lines(
                    Paths.get(""),
                    StandardCharsets.UTF_8
            );
            lines.forEach(a -> cubilete.add(a));
        }catch (IOException e ){
            System.out.println("Error!");
        }
        //crear el objeto pila
        Pila pila = new Pila();
        //crear el objeto calculadora
        Calculator calculator = new MyCalculator();


        for (int a=0; a<cubilete.size();a++) {


            String[] caracteres = cubilete.get(a).split("");
            ArrayList<String> operacion = new ArrayList<>();
            for (int i = 0; i < caracteres.length; i++) {
                operacion.add(caracteres[i]);
            }

            for (int car = 0; car < operacion.size(); car++) {
                int num;
                String caracter = operacion.get(car);
                try {
                    num = Integer.parseInt(caracter);
                    pila.push(num);
                } catch (Exception e) {
                    if (!caracter.equals(" ")) {
                        int num1 = (int) pila.pop();
                        int num2 = (int) pila.pop();
                        int resultado = calculator.calculate(num2, num1, caracter);
                        pila.push(resultado);
                    }
                }
            }
            System.out.println("resultado = " + pila.peek());
        }
    }
}
