package ui;

import domain.*;
import workflow.*;


class Principal {
	public static void main(String[] args)
	{
		Store tienda = new Store();
		
		Registro registro = tienda.getPOST();

		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		registro.EnterItem(1,1);

		System.out.println("Capturo 2 articulos (COD=2) de a 200 pesos");
		registro.EnterItem(2,2);

		System.out.println("Capturo 1 articulo (COD=1) de a 100 pesos");
		registro.EnterItem(1,1);

		System.out.println("Finalizo la venta...");
		registro.endSale();

		System.out.println("Total de la venta..."+registro.getSale().total());

		System.out.println("Pago con 650 pesos...");
		registro.makePayment(650);

		System.out.println("La feria es: ..."+ registro.getSale().getBalance());
	}
}
