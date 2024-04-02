package pruebass;

public class Ej {

	public static void main(String[] args) {
		String a = null;
		System.out.println(1);

		try {
			System.out.println(2);

			Integer c = 3 / 0;

			a.toUpperCase();
		} catch (ArithmeticException e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}
		System.out.println(5);

	}

}
