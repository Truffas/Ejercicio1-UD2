package sumando;

import java.util.Scanner;

public class Sumando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Dame un número: ");
		int num1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Dame otro número: ");
		int num2 = entrada.nextInt();
		
		System.out.println("La suma de ambos es " + (num1 + num2));
		
		entrada.close();
	}

}
