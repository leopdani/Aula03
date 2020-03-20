package ex_1_1;

public class FabricaMensageiroTela implements FabricaMensageiros {

	@Override
	public Mensageiro getInstance(String tipo) {
		switch(tipo) {
		case "HELLO":
			return new MensageiroHelloWorldTela();
		}
		return null;
	}

}
