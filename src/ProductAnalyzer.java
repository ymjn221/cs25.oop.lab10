import java.util.*;
import java.util.stream.Collectors;

class Product {
	private String name;
	private double price;
	private String category;

	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
}

public class ProductAnalyzer {
	public static Map<String, List<Product>> analyze(List<Product> products) {

		
		return null; 
	}

	public static void main(String[] args) {
		List<Product> items = Arrays.asList(
				new Product("Gutal", 1500, "Huvtsas"),
				new Product("Togloom", 800, "Togloom"),
				new Product("Tsamts", 1200, "Huvtsas"));
		
	}
}
