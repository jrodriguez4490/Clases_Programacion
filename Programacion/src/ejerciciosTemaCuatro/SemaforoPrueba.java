package ejerciciosTemaCuatro;

public class SemaforoPrueba {
	public static void main(String[] args) {
		Semaforo s = new Semaforo();
		System.out.println(s);

		s.setColor("amarillo");
		System.out.println(s);

		s.setColor("verde");
		System.out.println(s);

		s.setParpadeando(true);
		System.out.println(s);

		s.setColor("ámbar");
		System.out.println(s);

		s.setParpadeando(true);
		System.out.println(s);

//		s.cambiarEstado();
//		System.out.println(s);
//
//		s.cambiarEstado();
//		System.out.println(s);
//
//		s.cambiarEstado();
//		System.out.println(s);
//
//		s.cambiarEstado();
//		System.out.println(s);
//
//		s.cambiarEstado();
//		System.out.println(s);

		for (int i = 0; i < 5; i++) {

			s.cambiarEstado();
			System.out.println(s);

		}

		Semaforo s2 = new Semaforo();
		s2.setColor(s.getColor());
		s2.setParpadeando(s.getParpadeando());
//	
//	s2=s;
//	System.out.println(s2);

	}
}
