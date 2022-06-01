package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		
		// comparar dois objetos por igualdade de conteudo (equals)
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c1));
		
		//comparar as referencia dos objetos (==)
		System.out.println(c1 == c2);
		//true pois o compilador trata de forma especial a forma literal 
		System.out.println(s1 == s2);
	}

}
