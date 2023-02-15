package ep01;

public class NumerosRomanosCalculo {
	
	
	public static String obtenerRomanoDecenas(int num) {
        String romanoDecenas = "";
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i == 4) {
                    romanoDecenas += "XL";
                } else if (i == 5) {
                    romanoDecenas += "L";
                } else {
                    romanoDecenas += "X";
                }
            }
        }
        return romanoDecenas;
    }
	
	public static String obtenerRomanoUnidades(int num) {
        String romanoUnidades = "";
        if (num > 0) {
            if (num == 4) {
                romanoUnidades += "IV";
            } else if (num == 5) {
                romanoUnidades += "V";
            } else if (num == 9) {
                romanoUnidades += "IX";
            } else {
                if (num >= 6) {
                    romanoUnidades += "V";
                    num -= 5;
                }
                for (int i = 1; i <= num; i++) {
                    romanoUnidades += "I";
                }
            }
        }
        return romanoUnidades;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
