package domain;

import workflow.*;

public class Store {
	private ProductCatalog productCatalog = new ProductCatalog();
	private Registro registro = new Registro( productCatalog );

	public Registro getPOST() { return registro; }
}
