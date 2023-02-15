package ep01;

import java.util.Scanner;

public class NumerosRomanosPrograma {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entre 1 y 99: ");
        int num = sc.nextInt();

        if (num <= 0 || num >= 100) {
            System.out.println("Error: El número debe ser entre 1 y 99.");
            return;
        }

        int decenas = num / 10;
        int unidades = num % 10;

        String romanoDecenas = NumerosRomanosCalculo.obtenerRomanoDecenas(decenas);
        String romanoUnidades = NumerosRomanosCalculo.obtenerRomanoUnidades(unidades);

        System.out.println("El número en romano es: " + romanoDecenas + romanoUnidades);

	}


}
