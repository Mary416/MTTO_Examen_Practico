package prueba;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Before;

import org.junit.Test;

import workflow.Registro;
import domain.Store;


public class TestTestPost {

	Store tienda ;
	Registro registro ;
	float total,cambio;
	
	@Before
	public void setUp() throws Exception
	{
		tienda = new Store();
		registro = tienda.getPOST();
		
		registro.EnterItem(1,1);

		registro.EnterItem(2,2);

		registro.EnterItem(1,1);

		registro.endSale();
		total=registro.getSale().total();
		
//		System.out.println("Total de la venta..."+total);
//
//		System.out.println("Pago con 650 pesos...");
		registro.makePayment(650);
		
		cambio=registro.getSale().getBalance();
//		System.out.println("La feria es: ..."+ cambio);
		
	}
	
	@Test
	public void TestTotal() 
	{		
		assertTrue( total == 600.00 );
	}
	
	public void TestCambio() 
	{		
		assertTrue( cambio == 50.00);		
		
	}

}
