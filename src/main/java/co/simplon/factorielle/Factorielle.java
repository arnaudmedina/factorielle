package co.simplon.factorielle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// TODO : voir le composant LogBack étape 7
//import ch.qos.logback.classic.Level;
/**
 * Factorielle
 */
public class Factorielle {
	public Factorielle() {
		super();
	}
	
//	MonGestionnaireDeLog logger = new Logger("mail",false,true,false,false);
//	Log log;

	Logger logger = LoggerFactory.getLogger(Factorielle.class);
	
	public long calculer(long n){
		
//		logger.setLevel(Level.INFO);

		logger.warn("Low fuel level.");

		if(logger.isDebugEnabled()){
			logger.info("Calcul Factorielle n = " + n);
		}
		
		long resultat;
		resultat = calculerFac(n);
		
		if(logger.isDebugEnabled()){
			logger.debug("Calcul Factorielle " + n + " = " + resultat);
		}
		
		return resultat;
		
	}
	
	private long calculerFac(long n) {
//		log = new Log("info","Appel calculer","n = "+n);
//		logger.logue(log);
		
		if (n == 0)
			return 1;
		if (n < 0)
			throw new IllegalArgumentException();
		return n * calculerFac(n - 1);
	}
	
//	public void main (String[] arg){
//		Factorielle mafac = new Factorielle();
//				mafac.calculer(10);
//	}
}