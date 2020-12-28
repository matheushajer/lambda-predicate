package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductPredicate;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 50.0));
		list.add(new Product("Tablet", 350.0));
		list.add(new Product("HD Case", 80.0));

		list.removeIf(new ProductPredicate());
		//list.removeIf(p -> p.getPrice() >= 100.0); - modo inline  

		for (Product p : list) {
			System.out.println(p);
		}

	}
}
