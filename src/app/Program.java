package app;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>();
		// <Chave, Valor>
		
		cookies.put("username", "Maria");
		cookies.put("telefone", "99999999");
		cookies.put("email", "maria@gamil.com");
		
		cookies.remove("email");
		
		System.out.println("All Cookies: ");
		for(String key: cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		

	}

}
