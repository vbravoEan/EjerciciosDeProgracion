package ep01;

public class SalonesYpisosUniversidadCalculo {
	
	public static int calcularNumSalones(int numEstudiantes, int capacidadSalon) {
        return (int) Math.ceil((double) numEstudiantes / capacidadSalon);
    }

    public static int calcularNumPisos(int numSalones, int numSalonesPorPiso) {
        return (int) Math.ceil((double) numSalones / numSalonesPorPiso);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
