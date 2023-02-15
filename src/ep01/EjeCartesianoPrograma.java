package ep01;

import java.util.Scanner;

public class EjeCartesianoPrograma {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);

        // Leer coordenadas del primer punto
        System.out.print("Ingrese la coordenada x del primer punto: ");
        double x1 = sc.nextDouble();
        System.out.print("Ingrese la coordenada y del primer punto: ");
        double y1 = sc.nextDouble();

        // Leer coordenadas del segundo punto
        System.out.print("Ingrese la coordenada x del segundo punto: ");
        double x2 = sc.nextDouble();
        System.out.print("Ingrese la coordenada y del segundo punto: ");
        double y2 = sc.nextDouble();

        // Calcular la distancia entre los dos puntos
        double distancia = EjeCartesianoCalculos.calcularDistancia(x1, y1, x2, y2);
        System.out.println("La distancia entre los puntos es: " + distancia);

        // Calcular la pendiente de la recta que une los dos puntos
        double pendiente = EjeCartesianoCalculos.calcularPendiente(x1, y1, x2, y2);
        System.out.println("La pendiente de la recta que une los puntos es: " + pendiente);

        // Calcular las coordenadas del punto medio
        double puntoMedioX = EjeCartesianoCalculos.calcularPuntoMedioX(x1, x2);
        double puntoMedioY = EjeCartesianoCalculos.calcularPuntoMedioY(y1, y2);
        System.out.println("El punto medio entre los puntos es: (" + puntoMedioX + ", " + puntoMedioY + ")");

        sc.close();

	}

}
