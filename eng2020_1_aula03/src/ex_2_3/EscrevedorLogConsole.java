package ex_2_3;


public class EscrevedorLogConsole extends EscrevedorLog {

	protected FerramentaLog criarFerramentaLog() {
		return new FerramentaLogConsole();
	}
}
