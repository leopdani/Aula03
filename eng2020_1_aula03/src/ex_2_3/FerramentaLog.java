package ex_2_3;

import java.text.DateFormat;


import java.text.SimpleDateFormat;

public abstract class FerramentaLog {
	protected DateFormat dateFormat = new SimpleDateFormat("[dd.MM.yyyy, HH:mm] ");

	public abstract void registrarLog(String mensagem);
}
