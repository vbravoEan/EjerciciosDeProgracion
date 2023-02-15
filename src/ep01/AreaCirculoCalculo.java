package ep01;

public class AreaCirculoCalculo {
	
	 public static double calcularAreaCirculo(double radio) {
	        double area = Math.PI * radio * radio;
	        return area;
	    }
	 
	 public static double calcularAreaCoronaCircular(double radioR, double radior) {
	        double areaCirculoGrande = calcularAreaCirculo(radioR);
	        double areaCirculoPequeno = calcularAreaCirculo(radior);
	        double areaCoronaCircular = areaCirculoGrande - areaCirculoPequeno;
	        return areaCoronaCircular;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
