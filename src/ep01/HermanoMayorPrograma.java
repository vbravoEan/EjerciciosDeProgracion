package ep01;

import java.util.Scanner;

public class HermanoMayorPrograma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 // Pedimos los nombres y edades de los hermanos
        System.out.print("Ingrese el nombre del primer hermano: ");
        String nombre1 = input.next();
        System.out.print("Ingrese la edad del primer hermano: ");
        int edad1 = input.nextInt();

        System.out.print("Ingrese el nombre del segundo hermano: ");
        String nombre2 = input.next();
        System.out.print("Ingrese la edad del segundo hermano: ");
        int edad2 = input.nextInt();

        System.out.print("Ingrese el nombre del tercer hermano: ");
        String nombre3 = input.next();
        System.out.print("Ingrese la edad del tercer hermano: ");
        int edad3 = input.nextInt();

        // Obtenemos el nombre del hermano mayor
        String hermanoMayor = HermanoMayorCalculo.obtenerHermanoMayor(nombre1, edad1, nombre2, edad2, nombre3, edad3);

        // Imprimimos el nombre del hermano mayor
        System.out.println("El hermano mayor es: " + hermanoMayor);
	}

}
