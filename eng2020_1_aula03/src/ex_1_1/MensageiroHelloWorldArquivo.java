package ex_1_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MensageiroHelloWorldArquivo implements Mensageiro {

	@Override
	public void escrever() {
		try {
			PrintWriter writer = new PrintWriter("mensagem.txt");
			writer.write("Hello World!");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}