package ex_2_1;

public class CriadorDeNomesDesvirgulados implements CriadorDeNomes {

	@Override
	public Nome criar(String s) {
		// James Gosling
		int pos = s.indexOf(' ');
		String nome = s.substring(0, pos);
		String sobrenome = s.substring(pos + 1, s.length());
		return new Nome(nome, sobrenome);
	}

}