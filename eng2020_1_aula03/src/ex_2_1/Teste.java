package ex_2_1;

public class Teste {
//Naughton, Patrick
//McNealy, Scott
	public static void main(String[] args) {
		String[] lista = {"dani, leonardo", "James Gosling", "dani, decio"};
		//se nada for passado como parâmetro
		if(args.length == 0) {
			args = lista;
		}
		Nomes nomes = new Nomes(args);
	}

}
