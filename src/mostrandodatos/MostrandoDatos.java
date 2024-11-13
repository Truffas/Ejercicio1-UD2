package mostrandodatos;

import java.util.Scanner;

public class MostrandoDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dame tu nombre: ");
		
		String nombre = entrada.nextLine();
		
		System.out.print("Dame tu primer apellido: ");
		
		String apellido = entrada.nextLine();
		
		System.out.print("Tu nombre y apellido son: " + nombre + " " + apellido);

		entrada.close();
	}

}
