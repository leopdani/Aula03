package ex_2_3;


public abstract class EscrevedorLog {
	private FerramentaLog log;

	protected abstract FerramentaLog criarFerramentaLog();

	public void escreverLog(String mensagem) {
		if (log == null)
			log = criarFerramentaLog();
		log.registrarLog(mensagem);
	}
}
