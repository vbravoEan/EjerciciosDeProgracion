package ep01;

import java.util.Scanner;

public class diaPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el d�a de la semana (en min�sculas): ");
        String dia = sc.nextLine();

        String diaSiguiente = diaCalculo.obtenerDiaSiguiente(dia);
        if (diaSiguiente != null) {
            System.out.println("El d�a siguiente a " + dia + " es " + diaSiguiente);
        } else {
            System.out.println("D�a inv�lido");
        }
	}

}
