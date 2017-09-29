package co.simplon.factorielle;

public class Logger {

	// console mail fichier bdd
	String destinationLog = "console";

	// Filtres d'affichage
	boolean typeMacro = false;
	boolean typeInfo = false;
	boolean typeWarning = false;
	boolean typeErreur = false;

	public Logger(String destinationLog, boolean typeMacro, boolean typeInfo, boolean typeWarning, boolean typeErreur) {
		super();
		this.destinationLog = destinationLog;
		this.typeMacro = typeMacro;
		this.typeInfo = typeInfo;
		this.typeWarning = typeWarning;
		this.typeErreur = typeErreur;
	}

	public void logueConsole(Log unLog) {
		System.out.println(unLog);
	}

	public void logueParMail(Log unLog) {
		System.out.println("Envoi du log suivant par mail " + unLog);
	}

	public boolean filtreLog(Log unLog) {
		switch (unLog.getType()) 
		{
			case "warning":
				if (typeWarning)
					return true;
				break;
			case "info":
				if (typeInfo)
					return true;
				break;
			case "erreur":
				if (typeErreur)
					return true;
				break;
			case "macro":
				if (typeMacro)
					return true;
				break;
		}
		return false;
	}

	public void logue(Log unLog) {
		
		if (!filtreLog(unLog))
			return;
		
		switch (destinationLog) {
			case "console":
				logueConsole(unLog);
			case "mail":
				logueParMail(unLog);
		}
	}

}
