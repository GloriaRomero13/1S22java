 import java.util.Scanner;
 public class P3p7_1S22{

    public static int[][] capturar(){
    	int[][] matriz = new int[3][3];
    	Scanner teclado = new Scanner(System.in);
    	for (int f=0;f<3;f++){
    	for (int c=0;c<3;c++){
    		System.out.println("Ingrese el valor para la posicion["+f+"]["+c+"]: ");
    		matriz[f][c]=teclado.nextInt();
    	}
    }
    return matriz;
 }
 	public static void main(String[] args) {
 		int ma[][] = capturar();
 		int mb[][] = capturar();

 	public static int[][] multiplicarMatriz(){
 		int[][] resultado = new int [3][3];
 		for (int f=0;f<3;f++){
 		for (int c=0;c<3;c++){
 		resultado[f][c]+= matriz[f] * matriz[c];
 		}
 		}
 		
 	}
 	return resultado;
 		
 	}
 }