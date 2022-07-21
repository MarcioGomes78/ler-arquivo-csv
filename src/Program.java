import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		// Para fazer a leitura de uma entrada padr�o, ou seja, do terminal quando estamos digitando 
		// S� que o Scanner ele tamb�m funciona para ler arquivos, fazendo uma inje��o de depend�ncia
		// utilizando o polimorfismo
		// System.in representa a entrada padr�o do java
		// S� que podemos instanciar o Scanner baseado em uma stream de um arquivo ("file")
		File file = new File("c:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			//A fun��o hasNextLine retorna veerdadeiro se vc ainda n�o chegou no fim do arquivo
			while (sc.hasNextLine()) {
				
			}
		}
		catch (IOException e) {
			// TODO: handle exception
			
		}
	}

}
