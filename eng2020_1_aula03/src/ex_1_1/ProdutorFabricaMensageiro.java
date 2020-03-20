package ex_1_1;

public final class ProdutorFabricaMensageiro {
	private ProdutorFabricaMensageiro() {
	}
	
	public static FabricaMensageiros getFabrica() {
		int numero = (int)(100000*Math.random());
		numero = numero%2;
		if (numero == 0) {
			return getFabrica("TELA");
		} else {
			return getFabrica("ARQUIVO");
		}
	}
	
	private static FabricaMensageiros getFabrica(String tipoFab) {
		switch(tipoFab) {
		case "TELA":
			return new FabricaMensageiroTela();
		case "ARQUIVO":
			return new FabricaMensageiroArquivo();
		}
		return null;
	}
}