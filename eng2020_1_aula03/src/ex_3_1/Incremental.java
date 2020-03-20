package ex_3_1;
//singleton eager
class Incremental {
	private static Incremental inc =  new Incremental();;
	private static int count = 0; 
	private int numero;
	
	private Incremental() { 
		numero = ++count;
	}
	
	public static Incremental getInstance() {
		return inc;
	}
	public String toString() {
		return "Incremental " + numero; 
	}
}