package calculadora;

public class Triangulo {

	public static void main(String[] args) {
		
		int A = 3;
		int B = 5;

		boolean C = (A != B) ^ (!(B - 2 >= A));

		System.out.println(C);
		
	}

}
