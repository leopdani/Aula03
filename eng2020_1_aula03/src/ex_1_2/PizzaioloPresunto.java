package ex_1_2;

public class PizzaioloPresunto implements Pizzaiolo {

	public Pizza criarPizza() {
		return new PizzaPresunto();
	}

	@Override
	public Calzone criarCalzone() {
		return new CalzonePresunto();
	}
}
