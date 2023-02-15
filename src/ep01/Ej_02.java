package ep01;

import java.util.Scanner;

public class Ej_02 {

	 public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int numSillas, numGordos, numFlacos;
	        System.out.print("Ingrese el número de sillas en el bus: ");
	        numSillas = input.nextInt();
	        System.out.print("Ingrese el número de estudiantes gordos: ");
	        numGordos = input.nextInt();
	        System.out.print("Ingrese el número de estudiantes flacos: ");
	        numFlacos = input.nextInt();
	        int totalSillasOcupadas = numGordos * 2 + numFlacos;
	        int numBuses = totalSillasOcupadas / numSillas;
	        if (totalSillasOcupadas % numSillas != 0) {
	            numBuses++;
	        }
	        System.out.println("Se necesitan " + numBuses + " buses para llevar a todos los estudiantes.");
	    }

}
