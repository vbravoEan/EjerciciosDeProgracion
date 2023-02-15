package ep01;

import java.util.Scanner;

public class LongitudEscaleraPrograma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la altura de la escalera en metros: ");
        double altura = input.nextDouble();

        System.out.print("Ingrese el ángulo de inclinación en grados: ");
        double angulo = input.nextDouble();

        double longitud = LongitudEscaleraCalculo.calcularLongitudEscalera(altura, angulo);

        System.out.println("La longitud de la escalera es: " + longitud + " metros");
		// TODO Auto-generated method stub

	}

}
