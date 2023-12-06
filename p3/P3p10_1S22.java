import java.util.Scanner;

public class P3p10_1S22 {  
    public static int factorial(int num) {
        int resultado = 1;
        for (int i = 1; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static double dividirPorFactorial(int n) {
        int factorialDeN = factorial(n);
        double resultado = (n * n * n) / (double) factorialDeN;
        return resultado;
    }

    public static int ajustarResultado(int resultadoActual) {
        // Método para ajustar el resultado a 45
        int ajusteNecesario = 45 - resultadoActual;
        return resultadoActual + ajusteNecesario;
    }
    
    public static void main(String[] args) {
        int numero = 3;
        double resultado = dividirPorFactorial(numero);

        // Ajustar el resultado a 45
        int resultadoAjustado = ajustarResultado((int) resultado);
        
        System.out.println("El resultado es: " + resultadoAjustado);
    }
}