package ep01;

public class EjeCartesianoCalculos {
	
	//Calculo de distancia entre dos puntos
	public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
    }

	//Calculo de pendiente 
    public static double calcularPendiente(double x1, double y1, double x2, double y2) {
        return (y2 - y1) / (x2 - x1);
    }

  //Calculo de punto medio en x
    public static double calcularPuntoMedioX(double x1, double x2) {
        return (x1 + x2) / 2;
    }

  //Calculo de punto medio en y
    public static double calcularPuntoMedioY(double y1, double y2) {
        return (y1 + y2) / 2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
