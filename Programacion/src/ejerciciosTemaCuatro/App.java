package ejerciciosTemaCuatro;

public class App {

	public static void main(String[] args) {
		ColaCadenas cola = new ColaCadenas();
		System.out.println(cola);
		
		cola.añadirCadena("primero");
		cola.añadirCadena("segundo");
		System.out.println(cola.sacarCadena());
		System.out.println(cola);
		cola.añadirCadena("tercero");
		System.out.println(cola);
		
		System.out.println(cola.sacarCadena());
		System.out.println(cola.sacarCadena());
		
		cola.añadirCadena("cuarto");
		System.out.println(cola);
		
		while(cola.getTamaño()>0){
			System.out.println(cola.sacarCadena());
			
		}
	}
}
