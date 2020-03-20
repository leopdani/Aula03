package ex_2_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import java.util.ResourceUtils;


public class FerramentaLogArquivo extends FerramentaLog {
	private File arquivoLog;

	public FerramentaLogArquivo() {
		String pacote = getClass().getPackage().getName().toString().replace('.', '/');
		File dir = ResourceUtils.getResourceAsFile(pacote + "/");
		arquivoLog = new File(dir, "log.txt");

		try {
			if (!arquivoLog.exists())
				arquivoLog.createNewFile();
		} catch (IOException e) {
			System.out.println("Não foi possível criar o arquivo de log:\n" + e);
			System.exit(1);
		}
	}

	public void registrarLog(String mensagem) {
		try {
			FileWriter writer = new FileWriter(arquivoLog, true);
			writer.write(dateFormat.format(new Date(System.currentTimeMillis())) + mensagem + "\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Não foi possível escrever no arquivo de log:\n" + e);
			System.exit(1);
		}
	}
}