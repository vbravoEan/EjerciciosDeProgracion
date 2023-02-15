package ep01;

import java.util.Scanner;

public class AreaYPeriometroPrograma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del lado A del terreno:");
        double ladoA = scanner.nextDouble();

        System.out.println("Ingrese la longitud del lado B del terreno:");
        double ladoB = scanner.nextDouble();

        System.out.println("Ingrese la longitud del lado C del terreno:");
        double ladoC = scanner.nextDouble();

        double hipotenusa = AreayPerimetroCalculo.calcularHipotenusa(ladoA, ladoB);
        double areaTerreno = AreayPerimetroCalculo.calcularAreaTerreno(ladoA, ladoB);
        double perimetroTerreno =AreayPerimetroCalculo. calcularPerimetroTerreno(ladoA, ladoB, ladoC);

        System.out.println("El área del terreno es: " + areaTerreno);
        System.out.println("El perímetro del terreno es: " + perimetroTerreno);

	}

}
