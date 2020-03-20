package ex_1_1;

public class FabricaMensageiroArquivo implements FabricaMensageiros {

	@Override
	public Mensageiro getInstance(String tipo) {
		switch(tipo) {
		case "HELLO":
			return new MensageiroHelloWorldArquivo();
		}
		return null;
	}

}