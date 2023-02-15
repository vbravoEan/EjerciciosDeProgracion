package ep01;

import java.util.Scanner;

public class diaPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el día de la semana (en minúsculas): ");
        String dia = sc.nextLine();

        String diaSiguiente = diaCalculo.obtenerDiaSiguiente(dia);
        if (diaSiguiente != null) {
            System.out.println("El día siguiente a " + dia + " es " + diaSiguiente);
        } else {
            System.out.println("Día inválido");
        }
	}

}
