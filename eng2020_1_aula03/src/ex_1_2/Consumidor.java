package ex_1_2;

import static java.util.Calendar.DAY_OF_WEEK;
import static java.util.Calendar.FRIDAY;
import static java.util.Calendar.MONDAY;
import static java.util.Calendar.SATURDAY;
import static java.util.Calendar.THURSDAY;
import static java.util.Calendar.TUESDAY;
import static java.util.Calendar.WEDNESDAY;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Consumidor {

	private Pizzaiolo pizzaiolo;

	private Date data;

	public Consumidor(Date data) {
		this.data = data;

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		int diaSemana = calendar.get(DAY_OF_WEEK);

		switch (diaSemana) {

		case MONDAY:
		case WEDNESDAY:
		case FRIDAY:
			pizzaiolo = new PizzaioloCalabresa();
			break;

		case TUESDAY:
		case THURSDAY:
		case SATURDAY:
			pizzaiolo = new PizzaioloPresunto();
			break;
		}
	}

	public void pedirPizza() {

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy (EEEE)");

		if (pizzaiolo == null) {
			System.out.println("A pizzaria está fechada hoje! - " + df.format(data));
		} else {

			Pizza pizza = pizzaiolo.criarPizza();
			System.out.println("Pizza de hoje - " + df.format(data) + ":\n\t" + pizza.obterIngredientes());

			Calzone calzone = pizzaiolo.criarCalzone();
			System.out.println("Calzone de hoje - " + df.format(data) + ":\n\t" + calzone.obterIngredientes());
		}
	}

}