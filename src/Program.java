import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// Para fazer a leitura de uma entrada padrão, ou seja, do terminal quando estamos digitando 
		// Só que o Scanner ele também funciona para ler arquivos, fazendo uma injeção de dependência
		// utilizando o polimorfismo
		// System.in representa a entrada padrão do java
		// Só que podemos instanciar o Scanner baseado em uma stream de um arquivo ("file ou o caminho")
		File file = new File("c:\\temp\\in.txt"); 
		Scanner sc = null;
		
		// Se der certo
		try {
			sc = new Scanner(file); // se der uma excessão de o Scanner não existe, vai para o catch
			//A função hasNextLine retorna veerdadeiro se vc ainda não chegou no fim do arquivo
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
		}
		
		// se der errado
		catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		// Finally serve para colocar fechamneto de recursos
		//dando certo ou errado ele finaliza
		finally {
			//Se o Scannernão estiver aberto dará uma excessão de ponteiro nulo(NullPointerException)
			// Para evitar o NPE colaca-se um if
			if (sc != null) {
				sc.close();
			}
			
		}
	}

}
