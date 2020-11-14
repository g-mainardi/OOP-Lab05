package it.unibo.oop.lab05.ex4;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.ProductImpl;

public class ComparableProduct extends ProductImpl implements Comparable<Product> {

	public ComparableProduct(String name, int quantity) {
		super(name, quantity);
	}

	public int compareTo(Product arg0) {
		return this.getName().equals(arg0.getName()) ? 
				Double.compare(this.getQuantity(), arg0.getQuantity()) : 
				this.getName().compareTo(arg0.getName());
	}
	

}
