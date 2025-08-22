package fontes;

public class Calculadora {

	public double somar(double num1, double num2) {
		return num1 + num2;
	}

	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}

	public double dividir(double num1, double num2) {
		double resultado = 0;

		if (num1 != 0) {
			resultado = num2 / num1;
		} else {
			System.out.println("A divisão por zero não é permitida");
		}

		return resultado;

	}

	public double multiplicar(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		}

		return num1 * num2;
	}

}
