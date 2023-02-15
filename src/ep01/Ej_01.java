package ep01;

public class Ej_01 {
	
	public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double resultado = calcularFuncion(x, y);
        System.out.println("f(" + x + ", " + y + ") = " + resultado);
    }
	
	public static double calcularFuncion(double x, double y) {
        double resultado = x*x + 2*x*y + y*y;
        return resultado;
    }

}
