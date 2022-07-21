import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// Para fazer a leitura de uma entrada padrão, ou seja, do terminal quando estamos digitando 
		// Só que o Scanner ele também funciona para ler arquivos, fazendo uma injeção de dependência
		// utilizando o polimorfismo
		// System.in representa a entrada padrão do java
		// Só que podemos instanciar o Scanner baseado em uma stream de um arquivo ("file")
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			//A função hasNextLine retorna veerdadeiro se vc ainda não chegou no fim do arquivo
			while (sc.hasNextLine()) {
				
			}
		}
		catch (IOException e) {
			// TODO: handle exception
			
		}
	}

}
