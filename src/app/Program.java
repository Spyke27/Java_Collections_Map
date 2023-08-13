package app;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		Map<String, String> cookies = new TreeMap<>();
		// <Chave, Valor>
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gamil.com");
		
		System.out.println("All Cookies: \n");
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		System.out.println("--------------------");
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("TV", 990.00);
		Product p2 = new Product("Video-Game", 1200.00);
		Product p3 = new Product("Notebook", 2800.00);
		Boolean test = false;
		
		stock.put(p1, 1.0);
		stock.put(p2, 1.0);
		stock.put(p3, 1.0);
		
		System.out.println("All Products: \n");
		
		for(Product key: stock.keySet()) {
			System.out.println(key);
			if(key.getName() == "Notebook") {
				test = true;
			}
		}
		
		System.out.print("\nList of Products contains 'Notebook'? ");
		if(test) {
			System.out.println("Sim");
		}else {
			System.out.println("No");
			}

	}

}
