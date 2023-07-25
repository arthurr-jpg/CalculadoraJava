package Principal;
import java.util.Scanner;

public class CalculadoraJava {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro n�mero: ");
		double numero1 = scanner.nextDouble();
		System.out.println("Digite o segundo n�mero");
		double numero2 = scanner.nextDouble();
		System.out.println("Digite a opera��o desejada: (+, -, *, /");
		char operator = scanner.next().charAt(0);
		scanner.close();
		double result;

		switch (operator) {
		case '+':
			result = numero1 + numero2;
			break;
		case '-':
			result = numero1 - numero2;
			break;
		case '*':
			result = numero1 * numero2;
			break;
		case '/':
			result = numero1 / numero2;
			break;
		default:
			System.out.println("Opera��o inv�lida.");
			return;

		}

		System.out.println(numero1 + " " + operator + " " + numero2 + ": " + result);

	}

}
