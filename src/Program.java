import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// structure for read text file
		// Estrutura recomendada para ler um arquivo de texto
		String path = "c:\\temp\\in.txt";
		
		// try with resources
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
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
	}

}
