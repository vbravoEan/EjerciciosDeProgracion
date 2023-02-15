package ep01;

import java.util.Scanner;

public class GastosPedroPrograma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el sueldo mensual de Pedro: ");
        double sueldo = scanner.nextDouble();
        
        double arriendo = GastosPedro.calcularGastos(sueldo, 0.4);
        double comida = GastosPedro.calcularGastos(sueldo, 0.15);
        double dineroRestante = sueldo - arriendo - comida;
        
        System.out.println("Pedro gastó " + arriendo + " en arriendo.");
        System.out.println("Pedro gastó " + comida + " en comida.");
        System.out.println("Pedro tiene " + dineroRestante + " de dinero restante.");

	}

}
