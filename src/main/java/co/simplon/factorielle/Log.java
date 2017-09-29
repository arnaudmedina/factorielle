package co.simplon.factorielle;


import java.util.Date;


public class Log {

	private long lHeure;
	private String type;
	private String categorie;
	private String leMessage;


	public long getlHeure() {
		return lHeure;
	}
	
	public void setlHeure(long lHeure) {
		this.lHeure = lHeure;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getLeMessage() {
		return leMessage;
	}
	
	public void setLeMessage(String leMessage) {
		this.leMessage = leMessage;
	}
	
	public Log(long lHeure, String type, String categorie, String leMessage) {
		super();
		this.lHeure = lHeure;
		this.type = type;
		this.categorie = categorie;
		this.leMessage = leMessage;
	}
	
	public Log(String type, String categorie, String leMessage) {
//	TODO appeler l'autre constructeur	Log(System.currentTimeMillis(),type,categorie, leMessage);
		this.lHeure = System.currentTimeMillis();
		this.type = type;
		this.categorie = categorie;
		this.leMessage = leMessage;
	}

	@Override
	public String toString() {
		return "Log [time:" + lHeure + "\t type:" + type + "\t categorie:" + categorie + "\t Message:" + leMessage
				+ "]\n";
	}
	
	
}
