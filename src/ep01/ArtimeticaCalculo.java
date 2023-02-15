package ep01;

public class ArtimeticaCalculo {
	
	
	public static int calcular(int num1, int num2, String operador) {
        int resultado = 0;

        switch (operador) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                resultado = num1 / num2;
                break;
            case "%":
                resultado = num1 % num2;
                break;
            case "**":
                resultado = (int) Math.pow(num1, num2);
                break;
            default:
                System.out.println("Operador no válido");
        }

        return resultado;
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
