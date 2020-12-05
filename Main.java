import logica.*;

public class Main {

	public static void main(String[] args) {
		
		Fecha fecha1=new Fecha(12,10,2000);
		Alumno b=new Alumno("Ruiz",2,2000,fecha1);
		Becado bec1=new Becado(350,"Silva", 2, 400, fecha1);
		
		System.out.println("El alumno a es:"+bec1.toString());
		
		if (bec1.boletoGratis())
			System.out.println("Le corresponde boleto gratis");
		else
			System.out.println("No le corresponde boleto gratis");
		
		
	}

}