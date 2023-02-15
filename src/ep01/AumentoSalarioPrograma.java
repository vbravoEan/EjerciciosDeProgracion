package ep01;

import java.util.Scanner;

public class AumentoSalarioPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el salario actual del empleado: ");
        double salario = sc.nextDouble();
        double aumento = AumentoSalarioCalculo.calcularAumento(salario);
        double nuevoSalario = salario + aumento;
        System.out.println("El aumento de salario es de: $" + aumento);
        System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);
        
	}

}
