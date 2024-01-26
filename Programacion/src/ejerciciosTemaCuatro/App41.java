package ejerciciosTemaCuatro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App41 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el nombre de tu equipo");
		Equipo equipo1 = new Equipo (sc.nextLine());
		System.out.println("Dame el nombre del otro equipo");
		Equipo equipo2 = new Equipo (sc.nextLine());
		for (int i = 0; i < 3; i++) {
			if(i== 0) {
				System.out.println("Dame el nombre del capitán");
				Jugador capitan1 = new Jugador(sc.nextLine(),1);
				
				equipo1.setCapitan(capitan1);
			}else {
				System.out.println("Dame el nombre de 2 jugadores");
				List<Jugador> jugadores = new ArrayList();
				
				equipo1.setJugadores(jugadores);
			}
			
			
		}
		

		
		
		

	}
}
