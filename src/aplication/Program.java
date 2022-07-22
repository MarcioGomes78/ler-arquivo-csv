package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		// Estrutura recomendada para ler um arquivo de texto
		String path = "c:\\temp\\in.txt";

		List<Product> list = new ArrayList<Product>();
		// try with resources
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			// readLine faz a leitura do arqwuivo até a quebra de linha
			// e reorna uma string com a leitura que ele fez

			// Lê a primeira linha (cabeçalho)
			String line = br.readLine();
			// Lê a segunda linha (primeiro produto)
			line = br.readLine();
			// Para ler até o final doarquivo usamos o while
			while (line != null) {

				// Split analiza o String baseado no que é passado no parenteses(split(""))
				// Ele recorta o String em partes com base no que passou entre aspas("")
				// Então ele transporta para um vetor o que foi recortado
				// Lembrando que vetor começa na posição [0, 1, 2, 3, 4, 5, ...]
				String[] vect = line.split(",");

				// Para pegar o que foi recostdo com o split
				String name = vect[0];
				// Como o price est na forma de String temos que converter para Double
				Double price = Double.parseDouble(vect[1]);
				// Também temos que converter para Inteiro
				Integer qte = Integer.parseInt(vect[2]);

				Product prod = new Product(name, price, qte);
				list.add(prod);

				line = br.readLine();
			}

			System.out.println("PRODUCTS: ");
			for (Product p : list) {
				System.out.println(p);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
