package ep01;

public class HermanoMayorCalculo {

	public static String obtenerHermanoMayor(String nombre1, int edad1, String nombre2, int edad2, String nombre3, int edad3) {
        if (edad1 > edad2 && edad1 > edad3) {
            return nombre1;
        } else if (edad2 > edad1 && edad2 > edad3) {
            return nombre2;
        } else {
            return nombre3;
        }
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
