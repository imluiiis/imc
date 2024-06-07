package a;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	    Locale.setDefault(Locale.US);
	    
	    double peso, altura, imc;
	    
	    System.out.println("Informe seu peso: ");
	    peso=sc.nextDouble();
	    System.out.println("Informe sua altura: ");
	    altura=sc.nextDouble();
	    imc=peso/(altura*altura);
	    
	    if(imc<20) {
	    	System.out.println("Abaixo de 20. Abaixo do normal.");
	    }else if (imc>20 && imc<25) {
	    	System.out.println("Entre 20 e 25. Peso normal.");
	    }else if (imc>25 && imc<30) {
	    	System.out.println("Entre 25 e 30. Sobrepeso.");
	    }else if (imc>30 && imc<35) {
	    	System.out.println("Entre 30 e 35. Obesidade leve.");
	    }else if (imc>35 && imc<40) {
	    	System.out.println("Entre 35 e 40. Obesidade moderada.");
	    }else if (imc>=40) {
	    	System.out.println("Acima de 40. Obesidade mórbida.");
	    }
		System.out.printf("Cálculo do IMC : %.2f%n",imc);
	    sc.close();

	}

}
