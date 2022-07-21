import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// Para fazer a leitura de uma entrada padr�o, ou seja, do terminal quando estamos digitando 
		// S� que o Scanner ele tamb�m funciona para ler arquivos, fazendo uma inje��o de depend�ncia
		// utilizando o polimorfismo
		// System.in representa a entrada padr�o do java
		// S� que podemos instanciar o Scanner baseado em uma stream de um arquivo ("file ou o caminho")
		File file = new File("c:\\temp\\in.txt"); 
		Scanner sc = null;
		
		// Se der certo
		try {
			sc = new Scanner(file); // se der uma excess�o de o Scanner n�o existe, vai para o catch
			//A fun��o hasNextLine retorna veerdadeiro se vc ainda n�o chegou no fim do arquivo
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
			//Se o Scannern�o estiver aberto dar� uma excess�o de ponteiro nulo(NullPointerException)
			// Para evitar o NPE colaca-se um if
			if (sc != null) {
				sc.close();
			}
			
		}
	}

}
