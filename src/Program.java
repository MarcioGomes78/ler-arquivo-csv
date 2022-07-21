import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\in.txt";
		
		// FileReader é uma classe padrão para ler stream(fluxo) de dados
		FileReader fr = null;
		
		//Lógica
		// 1- Instancia p FIleReader para ter uma Referencia da stream de entrada que vai ser lida
		// 2- Dapois em cima do FileReader vc vai instanciar o BufferedReader
		
		// Gerencia a memória usada para a leitura, ela é uma classe mais otimizada e mais rápida  
		BufferedReader br = null;
		
		// A maneira mais prática para ler o arquivo tetxo, leia de linha a linha
		// E façao tratamento nessa linha se vc precisar.
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			//readLine faz a leitura do arqwuivo até a quebra de linha 
			//e reorna uma string com a leitura que ele fez
			String line = br.readLine();
			//Para ler até o final doarquivo usamos o while
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			// Para evitar o NullPointerException usamos o if
			try {
				if (fr != null) {
					fr.close();
				}
				if (br != null) {
					br.close();
				}
			}
			catch (IOException e) {
				// imprime todos os erros na tela
				e.printStackTrace();
			}
		}
	
	}

}
