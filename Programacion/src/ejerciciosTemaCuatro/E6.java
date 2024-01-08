package ejerciciosTemaCuatro;

import java.util.Scanner;

public class E6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame dos números para sumarlos");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int suma = E5.realizarSuma(num1, num2);
		System.out.println(suma);
		sc.close();
	}



}
