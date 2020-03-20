package ex_2_2;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		String senha = JOptionPane.showInputDialog(null, "Digite a senha:");

		if (senha.isEmpty()) {
			System.out.println("Digite uma senha...");
			System.exit(1);
		}

		ProvedorInformacao provedor = ("designpatterns".equals(senha)) ? new ProvedorConfidencial()
				: new ProvedorPublico();

		provedor.exibirInformacao();
	}
}