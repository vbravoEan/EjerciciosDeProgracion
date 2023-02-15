package ep01;

public class AumentoSalarioCalculo {

	public static double calcularAumento(double salario) {
        if (salario <= 800000) {
            return salario * 0.1;
        } else if (salario <= 1200000) {
            return salario * 0.08;
        } else {
            return salario * 0.05;
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
