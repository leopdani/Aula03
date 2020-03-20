package ex_2_1;

import java.util.ArrayList;

public abstract class ArmazemNomes {
	private ArrayList<Nome> nomes;

	public ArmazemNomes(ArrayList<Nome> nomes) {
		this.nomes = nomes;
	}
	
	public ArrayList<Nome> armazenar(String s){
		CriadorDeNomes cn = getCriador();
		Nome nome = cn.criar(s);
		nomes.add(nome);
		return nomes;
	}

	protected abstract CriadorDeNomes getCriador();
	
	
	

}
