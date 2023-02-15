package ep01;

public class AreayPerimetroCalculo {
	
	
	 // Función que calcula el área de un rectángulo
    public static double calcularAreaRectangulo(double base, double altura) {
        double area = base * altura;
        return area;
    }

    // Función que calcula la hipotenusa de un triángulo rectángulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }

    // Función que calcula el área de un triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    // Función que calcula el perímetro de un terreno rectangular
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        double perimetro = ladoA + ladoB + ladoC + hipotenusa;
        return perimetro;
    }

    // Función que calcula el área de un terreno rectangular
    public static double calcularAreaTerreno(double ladoA, double ladoB) {
        double areaRectangulo = calcularAreaRectangulo(ladoA, ladoB);
        double areaTriangulo = calcularAreaTriangulo(ladoA, ladoB);
        double areaTerreno = areaRectangulo + areaTriangulo;
        return areaTerreno;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
