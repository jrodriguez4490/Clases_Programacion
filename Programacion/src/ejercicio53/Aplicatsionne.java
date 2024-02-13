package ejercicio53;

import java.math.BigDecimal;

public class Aplicatsionne {
	public static void main(String[] args) {

		Hucha huchita = new Hucha();
		BigDecimal cienLereles = new BigDecimal("100.00");
		System.out.println(huchita);

		huchita.meterDinero(cienLereles);
		System.out.println(huchita);

		BigDecimal cincuenteLereles = new BigDecimal("50.501");

		huchita.meterDinero(cincuenteLereles);
		System.out.println(huchita);

		BigDecimal veinteLereles = new BigDecimal("20.5");
		huchita.sacarDinero(veinteLereles);
		System.out.println(huchita);

//	huchita.sacarDinero(new BigDecimal(200.00));
//	System.out.println(huchita);
		BigDecimal sacado = huchita.sacarDinero(new BigDecimal(200));
		System.out.println(huchita);

		huchita.meterDinero(sacado);
		System.out.println(huchita);

		huchita.meterDinero(huchita.romperHucha());
		System.out.println(huchita);

	}
}
