package ex_2_3;

public class Main {
	
	

	public static void main(String[] args) {
		if ((args.length != 1) || ((!"arquivo".equals(args[0])) && (!"console".equals(args[0])))) {
			System.out.println("Use: java Main <arquivo|console>");
			System.exit(1);
		}

		EscrevedorLog log = ("arquivo".equals(args[0])) ? new EscrevedorLogArquivo() : new EscrevedorLogConsole();

		for (int i = 1; i <= 10; i++)
			log.escreverLog("Contando: " + i);
	}
}