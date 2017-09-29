package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle {
	public Factorielle() {
		super();
	}
	
	Logger logger = new Logger("mail",false,true,false,false);
	Log log;

	public long calculer(long n) {
		log = new Log("info","Appel calculer","n = "+n);
		logger.logue(log);
		if (n == 0)
			return 1;
		if (n < 0)
			throw new IllegalArgumentException();
		return n * calculer(n - 1);
	}
	
//	public void main (String[] arg){
//		Factorielle mafac = new Factorielle();
//				mafac.calculer(10);
//	}
}