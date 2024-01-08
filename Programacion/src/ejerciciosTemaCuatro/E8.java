package ejerciciosTemaCuatro;

import java.util.Scanner;

public class E8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame dos números");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("ELIGE: ADD, SUB, MUL O DIV");
		sc.nextLine();
		String respuesta = sc.nextLine();
		int resultado = Calculadora.calculadora(respuesta, num1, num2);
		System.out.println(resultado);
		sc.close();

	}
}
