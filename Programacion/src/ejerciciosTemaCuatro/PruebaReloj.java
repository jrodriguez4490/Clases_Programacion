package ejerciciosTemaCuatro;

import java.util.Scanner;

public class PruebaReloj {

	public static void main(String[] args) {
		// 1
		Reloj r = new Reloj();
		System.out.println(r);
		// 2
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame hora, minutos y segundos:");
		Integer horas = sc.nextInt();
		Integer minutos = sc.nextInt();
		Integer segundos = sc.nextInt();
		r.ponerEnHora(horas, minutos, segundos);
		System.out.println(r);
		// 3
		r.setFormato24horas(false);
		System.out.println(r);
		// 4
		r.ponerEnHora(24, 17);
		System.out.println(r);
		// 5
		r.ponerEnHora(21, 82);
		System.out.println(r);
		// 6
		r.ponerEnHora(17, 16, 15);
		System.out.println(r);
		// 7
		Reloj r2 = new Reloj(17, 16, 15);
		System.out.println(r2);
		// 8
		System.out.println(r.equals(r2));
		sc.close();

	}

}
