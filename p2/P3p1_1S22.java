import java.util.Scanner;
public class P3p1_1S22{


static Scanner teclado = new Scanner(System.in);

    public static void Suma(){
    	System.out.println("Suma de 2 numeros");
    	System.out.println("Ingresa el primer numero");
    	int a = teclado.nextInt();
    	System.out.println("Ingresa el segundo numero");
    	int b = teclado.nextInt();
    	int c = a+b;
    	System.out.println("La Suma fue "+c);
    }
    public static void Resta(){
    	System.out.println("Resta de 2 numeros");
    	System.out.println("Ingresa el primer numero");
    	int a = teclado.nextInt();
    	System.out.println("Ingresa el segundo numero");
    	int b = teclado.nextInt();
    	int c = a-b;
    	System.out.println("La Resta fue "+c);
    }
    public static void Division(){
    	System.out.println("Division de 2 numeros");
    	System.out.println("Ingresa el primer numero");
    	int a = teclado.nextInt();
    	System.out.println("Ingresa el segundo numero");
    	int b = teclado.nextInt();
    	int c = a/b;
    	System.out.println("La Division fue "+c);
    }
    public static void Multiplicacion(){
    	System.out.println("Multiplicacion de 2 numeros");
    	System.out.println("Ingresa el primer numero");
    	int a = teclado.nextInt();
    	System.out.println("Ingresa el segundo numero");
    	int b = teclado.nextInt();
    	int c = a*b;
    	System.out.println("La Multiplicacion fue "+c);
    }
    public static void menu(){
    	System.out.println("Menu de Operaciones Basico");
    	System.out.println("\n A) Suma");
    	System.out.println("B) Resta");
    	System.out.println("C) Division");
    	System.out.println("D) Multiplicacion");
    	System.out.println("E) Salir");
    	System.out.println("Que opcion deseas: ");

    }
	public static void main(String[] args) {
		String opc;

		menu();
		opc=teclado.nextLine();
		while (opc.equals("A")) Suma();
		while (opc.equals("B")) Resta();
		while (opc.equals("C")) Division();
		while (opc.equals("D")) Multiplicacion();
		while (opc.equals("E")) break;
	}
}