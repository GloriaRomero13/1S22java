import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            numeros[i] = captura(i+1);
        }

        double promedio = calcularPromedio(numeros);
        System.out.println("El promedio de los 10 números ingresados es: " + promedio);
    }

    public static int captura(int num) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número " + num + ": ");
        int n = sc.nextInt();
        return n;
    }

    public static double calcularPromedio(int[] numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return (double) suma / numeros.length;
    }
}