package imcteste;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double peso,altura,imc;
		imc=0;
		
		System.out.println("Informe seu peso: ");
		peso=sc.nextDouble();
		System.out.println("Informe sua altura: ");
		altura=sc.nextDouble();
		
		imc=peso/(altura*altura);
		
		if(imc<18.5) {
			System.out.printf("Seu IMC é de %.2f Considerado Peso baixo. ",imc);
		}else if (imc>18.5 && imc<25.0) {
			System.out.printf("Seu IMC é de %.2f Considerado Peso normal. ",imc);
		}else if (imc>25.0 && imc<30.0) {
			System.out.printf("Seu IMC é de %.2f Considerado Excesso de peso. ",imc);
		}else if (imc>30.0 && imc <35.0) {
			System.out.printf("Seu IMC é de %.2f Considerado Obesidade. ",imc);
		}else if (imc>35) {
			System.out.printf("Seu IMC é de: %.2f%n Considerado Obesidade extrema.",imc);
		}
				
		sc.close();

	}

}
