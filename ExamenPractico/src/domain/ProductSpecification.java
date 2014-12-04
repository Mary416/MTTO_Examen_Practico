package domain;

public class ProductSpecification {
	private int    idProduct         = 0;
	private float  price       = 0;
	private String description = "";

	public ProductSpecification( int idProduct, float price, String description )
		{
		this.idProduct         = idProduct;
		this.price       = price;
		this.description = description;
		}

	public int getUPC() { return idProduct;	}
	public float getPrice() { return price; }
	public String getDescription() { return description; }
}

