import java.util.Scanner;
public class P3p3_1S22{
    public static void alcuadrado(int pasada, int valor){
    if (!(pasada == 6)) alcuadrado(pasada+1,valor*2);
    System.out.println("valor contiene" + valor);
    }
    



    public static void main(String[] args){
    	//2*2*2*2*2*2
    	//Como puedo elevar al cuadrado un numero x sin utlizar for
    alcuadrado(2,2*2);    



}
}