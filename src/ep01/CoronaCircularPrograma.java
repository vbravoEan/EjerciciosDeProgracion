package ep01;

import java.util.Scanner;

public class CoronaCircularPrograma {
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el radio del c�rculo grande (R):");
        double radioR = scanner.nextDouble();

        System.out.println("Ingrese el radio del c�rculo peque�o (r):");
        double radior = scanner.nextDouble();

        double areaCoronaCircular = AreaCirculoCalculo.calcularAreaCoronaCircular(radioR, radior);

        System.out.println("El �rea de la corona circular es: " + areaCoronaCircular);
    }
	

}
