package ep01;

public class LongitudEscaleraCalculo {
	
	public static double calcularLongitudEscalera(double altura, double angulo) {
	    double radianes = Math.toRadians(angulo);
	    double longitud = altura / Math.sin(radianes);
	    return longitud;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
