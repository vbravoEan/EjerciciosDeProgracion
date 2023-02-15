package ep01;

import java.util.Scanner;

public class SalonesyPisosUniversidadPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Leer el número total de estudiantes
        System.out.print("Ingrese el número total de estudiantes: ");
        int numEstudiantes = sc.nextInt();

        // Leer la capacidad de cada salón
        System.out.print("Ingrese la capacidad de cada salón: ");
        int capacidadSalon = sc.nextInt();

        // Leer el número de salones por piso
        System.out.print("Ingrese el número de salones por piso: ");
        int numSalonesPorPiso = sc.nextInt();

        // Calcular el número total de salones
        int numSalones = SalonesYpisosUniversidadCalculo.calcularNumSalones(numEstudiantes, capacidadSalon);

        // Calcular el número total de pisos
        int numPisos = SalonesYpisosUniversidadCalculo.calcularNumPisos(numSalones, numSalonesPorPiso);

        // Imprimir los resultados
        System.out.println("El nuevo edificio tendrá " + numSalones + " salones en total.");
        System.out.println("El nuevo edificio tendrá " + numPisos + " pisos en total.");

        sc.close();

	}

}
