package e1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<Integer>();

		Integer numero = 0;
		
		do {
			try {
				System.out.println("dame un número");
				numero = sc.nextInt();
				numeros.add(numero);
			
				
			}catch(InputMismatchException e) {
				System.out.println("Sólo se admiten números");
				sc.nextLine();
				}

			
		}while(numero != -1);
		
		System.out.println(numeros);
		sc.close();
//		try {
//			do {
//				System.out.println("Dame un número");
//				numero = sc.nextInt();
//				if (numero != -1) {
//					numeros.add(numero);
//				}
//			} while (numero != -1);
//			System.out.println(numeros);
//		} finally {
//
//			sc.close();
//
//		}
		
//		otra manera de hacerlo
//		try {
//			do {
//				System.out.println("Dame un número");
//				try {
//					numero = scanner.nextInt();
//					if (numero != -1) {
//						numeros.add(numero);
//					}
//				} catch (InputMismatchException e) {
//					System.out.println("Sólo se admiten números");
//					scanner.nextLine();
//				}
//				
//			} while (numero != -1);
//			System.out.println("Lista: " + numeros);
//		} finally {
//			System.out.println("El escáner se ha cerrado");
//			scanner.close();
//		}
	}
}