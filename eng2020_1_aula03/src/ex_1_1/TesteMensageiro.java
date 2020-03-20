package ex_1_1;

public class TesteMensageiro {

	public static void main(String[] args) {
		FabricaMensageiros fabrica = ProdutorFabricaMensageiro.getFabrica();
		Mensageiro msg = fabrica.getInstance("HELLO");
		msg.escrever();
	}

}
