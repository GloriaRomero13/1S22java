import java.util.Scanner;
import java.lang.Math;
public class P26_1s22{ 
	public static void main(String[] args) {
		java.util.Scanner teclado = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int x;
		int y;
		int aebd;
		// x = (ce-bf)/(ae-bd) = (af-cd)/(ae-bd)
		System.out.println("resolver la siguiente ecuacion: ");
		System.out.println("ax + by =c ");
		System.out.println("dx + ey =f ");
		System.out.println("escribe el valor de a: ");
		a = teclado.nextInt();
		System.out.println("escribe el valor de b: ");
		b = teclado.nextInt();
		System.out.println("escribe el valor de c: ");
		c = teclado.nextInt();
		System.out.println("escribe el valor de d: ");
		d = teclado.nextInt();
		System.out.println("escribe el valor de e: ");
		e = teclado.nextInt();
		System.out.println("escribe el valor de f: ");
		f = teclado.nextInt();
		aebd = (a*e-b*d);
		x = (c*e-b*f)/aebd;
		y = (a*f-c*d)/aebd;
		if (aebd!=0){ 
			System.out.println("el valor de X es: "+ x);
			System.out.println("el valor de Y es: "+ y);
		}else{ 
			System.out.println("la ecuacion no tiene sentido");
		}
    }
}


	