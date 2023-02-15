package ep01;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class diaCalculo {
	
  public static String obtenerDiaSiguiente(String dia) {
        switch (dia) {
            case "lunes":
                return "martes";
            case "martes":
                return "miércoles";
            case "miércoles":
                return "jueves";
            case "jueves":
                return "viernes";
            case "viernes":
                return "sábado";
            case "sábado":
                return "domingo";
            case "domingo":
                return "lunes";
            default:
                return null;
        }
    }
	
	public static void main(String[] args) {
		
	}

}
