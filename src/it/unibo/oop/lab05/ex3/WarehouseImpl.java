package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private final Set<Product> products = new HashSet<>();

	public void addProduct(Product p) {
		this.products.add(p);
	}


	public Set<String> allNames() {
		final var names = new HashSet<String>();
		for (final Product product : this.products) {
			names.add(product.getName());
		}
		return names;	
	}
	
	public Set<Product> allProducts() {
		return new HashSet<>(this.products);
	}

	public boolean containsProduct(Product p) {
		return this.products.contains(p);
	}

	public double getQuantity(String name) {
		for (final Product product : this.products) {
			if (product.getName().equals(name)) {
				return product.getQuantity();
			}
		}
		return -1.0;
	}

}
