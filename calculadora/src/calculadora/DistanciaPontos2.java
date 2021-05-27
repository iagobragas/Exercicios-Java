package calculadora;

import java.util.Scanner;

public class DistanciaPontos2 {

	public static void main(String[] args) {
		
		int escolha;
		
		Scanner entrada = new Scanner(System.in);
		
		do {
			
		System.out.println("\n-------------------------");
		
		System.out.print("Informe o valor de x1: ");
		double x1 = entrada.nextDouble();
		
		System.out.print("Informe o valor de y1: ");
		double y1 = entrada.nextDouble();
	
		System.out.print("Informe o valor de x2: ");
		double x2 = entrada.nextDouble();
				
		System.out.print("Informe o valor de y2: ");
		double y2 = entrada.nextDouble();
		
		System.out.println("\n-----------------------");
		System.out.println("   A("+ x1+ ","+ y1+ ") e B("+ x2+ ","+ y2+")");
		System.out.println("-----------------------");
		
		System.out.println("ESCOLHA:");
		System.out.println("Sair -> (-1)");
		System.out.println("Dist�ncia -> (0)");
		System.out.println("Quadrante -> (1)");
		System.out.println("Bissetriz -> (2)\n");
		
		System.out.print("Op��o: ");
		escolha = entrada.nextInt();
		
		System.out.println("-----------------------");
		
		switch (escolha) {
		case 0:
			
		if(x1 == x2 || y1 == y2) {
			if(x1-x2 != 0) {
				System.out.println(x1 - x2);
			} else {
				System.out.println(y1-y2);
			}		
		} else {
			
			double deltax = x2 - x1;
			double deltay = y2 - y1;
			
			double xquadrado = (int) Math.pow(deltax, 2);
		    double yquadrado = (int) Math.pow(deltay, 2);
			
			double somaquadrado = xquadrado + yquadrado;
			
			System.out.println("Raiz de " + somaquadrado);
		}
		break;
		
		case 1:
			
		if(x1 > 0) {
			if(y1 > 0) {
				System.out.println("A est� no primeiro quadrante");
			} else {
				System.out.println("A est� no quarto quadrante");
			} 
		} else {
			if (y1 > 0) {
				System.out.println("A est� no segundo quadrante");
			} else {
				System.out.println("A est� no terceiro quadrante");
			}
		}
		
		if(x2 > 0) {
			if(y2 > 0) {
				System.out.println("B est� no primeiro quadrante");
			} else {
				System.out.println("B est� no quarto quadrante");
			} 
		} else {
			if (y2 > 0) {
				System.out.println("B est� no segundo quadrante");
			} else {
				System.out.println("B est� no terceiro quadrante");
			}
		}
		break;
		
		case 2:
			
			if (x1==y1 && (x1 > 0 || x1 < 0)) {
				System.out.println("A na Bissetriz dos quadrantes �MPARES");
			} else if (x1 == (-1) * y1 && (x1 != 0)) {
				System.out.println("A na Bissetriz dos quadrantes PARES");
			} else {
				System.out.println("A N�o est� na bissetriz");
			}
			
			if (x2==y2 && (x2 > 0 || x2 < 0)) {
				System.out.println("B na Bissetriz dos quadrantes �MPARES");
			} else if (x2 == (-1) * y2 && (x2 != 0)) {
				System.out.println("B na Bissetriz dos quadrantes PARES");
			} else {
				System.out.println("B N�o est� na bissetriz");
			}
			
		break;
		
		default:
			System.out.println("Obrigado!!");;
		}
		
		} while (escolha != -1);
		entrada.close();
	}
}
