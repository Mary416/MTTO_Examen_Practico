package prueba;

import static org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Before;

import org.junit.Test;

import workflow.POST;
import domain.Store;


public class TestTestPost {

	Store tienda ;
	POST post ;
	float total,cambio;
	
	@Before
	public void setUp() throws Exception
	{
		tienda = new Store();
		post = tienda.getPOST();
		
		post.EnterItem(1,1);

		post.EnterItem(2,2);

		post.EnterItem(1,1);

		post.endSale();
		total=post.getSale().total();
		
//		System.out.println("Total de la venta..."+total);
//
//		System.out.println("Pago con 650 pesos...");
		post.makePayment(650);
		
		cambio=post.getSale().getBalance();
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
