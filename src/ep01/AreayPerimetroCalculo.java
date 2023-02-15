package ep01;

public class AreayPerimetroCalculo {
	
	
	 // Funci�n que calcula el �rea de un rect�ngulo
    public static double calcularAreaRectangulo(double base, double altura) {
        double area = base * altura;
        return area;
    }

    // Funci�n que calcula la hipotenusa de un tri�ngulo rect�ngulo
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        return hipotenusa;
    }

    // Funci�n que calcula el �rea de un tri�ngulo
    public static double calcularAreaTriangulo(double base, double altura) {
        double area = (base * altura) / 2;
        return area;
    }

    // Funci�n que calcula el per�metro de un terreno rectangular
    public static double calcularPerimetroTerreno(double ladoA, double ladoB, double ladoC) {
        double hipotenusa = calcularHipotenusa(ladoA, ladoB);
        double perimetro = ladoA + ladoB + ladoC + hipotenusa;
        return perimetro;
    }

    // Funci�n que calcula el �rea de un terreno rectangular
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
