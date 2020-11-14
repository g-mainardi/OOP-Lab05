package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private final String name;
	private int quantity;

	public ProductImpl(final String name, final int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantity;
	}

	public String toString() {
		return "ProductImpl [name=" + this.name + ", quantity=" + this.quantity + "]";
	}

	public int hashCode() {
		return this.name.hashCode();
	}

	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			final var product = (Product) obj;
			return this.name.equals(product.getName());
		}
		return false;
	}

	

}
