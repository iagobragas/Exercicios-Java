package calculadora;

import java.util.Scanner;

public class ErroPercentual {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor medido: ");
		double VM = entrada.nextDouble();
		
		System.out.print("Informe a escala: ");
		double FE = entrada.nextDouble();
		
		System.out.print("Informe a classe de precisão: ");
		double CP = entrada.nextDouble();
		
		double erro_absoluto = (FE * CP) / 100;
		double erro_relativo = (erro_absoluto * 100) / VM;
		
		System.out.print("RESULTADO ERRO ABSOLUTO ");
		System.out.printf("%.2f" ,erro_absoluto);
		System.out.println();
		System.out.print("RESULTADO ERRO RELATIVO ");
		System.out.printf("%.2f" ,erro_relativo);
		entrada.close();
	}
}
