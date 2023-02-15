package ep01;

import java.util.Scanner;

public class AritmeticaPrograma {

	public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			System.out.print("Ingrese el primer número: ");
	        int num1 = input.nextInt();

	        System.out.print("Ingrese el segundo número: ");
	        int num2 = input.nextInt();

	        System.out.print("Ingrese el operador (+, -, *, /, % o **): ");
	        String operador = input.next();

	        int resultado = ArtimeticaCalculo.calcular(num1, num2, operador);

	        System.out.println("El resultado de " + num1 + " " + operador + " " + num2 + " es: " + resultado);

	}

}
