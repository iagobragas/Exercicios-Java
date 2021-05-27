package calculadora;

import java.util.Scanner;

public class Triangulo3 {

	public static void main(String[] args) {
		
int escolha;
		
		Scanner entrada = new Scanner(System.in);
		
		double pm;
		
		do {
			
		System.out.println("\n-------------------------");
		
		System.out.print("Informe o valor do lado A: ");
		double la = entrada.nextDouble();
		
		System.out.print("Informe o valor do lado B: ");
		double lb = entrada.nextDouble();
		
		System.out.print("Informe o valor do lado C (maior): ");
		double lc = entrada.nextDouble();
		
		System.out.println("\n-----------------------");
		System.out.println("LADO A("+la+") LADO B("+lb+") LADO C("+lc+")");
		System.out.println("-----------------------");
		
		System.out.println("ESCOLHA:");
		System.out.println("Sair -> (-1)");
		System.out.println("Informações de um triângulo -> (0)");
		
		System.out.print("Opção: ");
		escolha = entrada.nextInt();
		
		System.out.println("-----------------------");
		
		switch (escolha) {
		
		case 0:
			
			double p=la+lb+lc;
			pm = p/2;
			
			double area = Math.sqrt((pm * (pm -la) * (pm-lb) * (pm-lc)));
			
			if ((Math.pow(lc,2) == Math.pow(la,2) + Math.pow(lb,2))){
				System.out.println("Triangulo retangulo");
			} else if ((Math.pow(lc,2) > Math.pow(la,2) + Math.pow(lb,2))) {
				System.out.println("Triangulo obtusangulo");
			} else if ((Math.pow(lc,2) < Math.pow(la,2) + Math.pow(lb,2))) {
				System.out.println("Triangulo acutangulo");
			}
			
			if (la==lb && lc==la) {
				System.out.println("Triangulo equilatero");
			} else if (la==lb | lc==la | lc==lb) {
				System.out.println("Triangulo isoceles");
			} else if (la!=lb && lc!=la && lc!=lb) {
				System.out.println("Triangulo escaleno");
			}
			
			System.out.println("O perimetro é "+ p+" e a área é "+area);
		break;
		
		default:
			System.out.println("Obrigado!!");;
		}
		
		} while (escolha != -1);
		entrada.close();
	}
}

