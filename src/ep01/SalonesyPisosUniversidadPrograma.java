package ep01;

import java.util.Scanner;

public class SalonesyPisosUniversidadPrograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Leer el n�mero total de estudiantes
        System.out.print("Ingrese el n�mero total de estudiantes: ");
        int numEstudiantes = sc.nextInt();

        // Leer la capacidad de cada sal�n
        System.out.print("Ingrese la capacidad de cada sal�n: ");
        int capacidadSalon = sc.nextInt();

        // Leer el n�mero de salones por piso
        System.out.print("Ingrese el n�mero de salones por piso: ");
        int numSalonesPorPiso = sc.nextInt();

        // Calcular el n�mero total de salones
        int numSalones = SalonesYpisosUniversidadCalculo.calcularNumSalones(numEstudiantes, capacidadSalon);

        // Calcular el n�mero total de pisos
        int numPisos = SalonesYpisosUniversidadCalculo.calcularNumPisos(numSalones, numSalonesPorPiso);

        // Imprimir los resultados
        System.out.println("El nuevo edificio tendr� " + numSalones + " salones en total.");
        System.out.println("El nuevo edificio tendr� " + numPisos + " pisos en total.");

        sc.close();

	}

}
