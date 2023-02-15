package ep01;

import java.util.Scanner;

public class MayorQuePrograma {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = input.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = input.nextInt();

        int mayor = MayorQueCalculo.obtenerMayor(num1, num2);

        System.out.println("El número mayor es: " + mayor);

	}

}
