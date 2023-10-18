public class P3p2_1S22{ 
	public static void main(String[] args) {
		int a=0;

		while(a<11){ 
			System.out.println("el valor de a" +a);
		a++;
	}

    a=0;
    boolean estado = true;
    while(estado){ 
    	System.out.println("·Nuevamente a vale" +a);
    	if (a>9) break;
    	a++;
    }

    estado = false;
    while(estado){ 
         System.out.println("Se mostrara la linea?");
    }


 }
}