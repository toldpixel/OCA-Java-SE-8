package Zimmerpkg;

public class Zimmer {

	private int zimmerNr;
	private String zimmerName;
	private int anzahlBetten;
	private boolean zimmerBelegt;
	private double zimmerPreisNacht;
	

	public Zimmer(int zimmerNr, String zimmerName, int anzahlBetten, boolean zimmerBelegt, double zimmerPreisNacht) {
		this.zimmerNr = zimmerNr;
		this.zimmerName = zimmerName;
		this.anzahlBetten = anzahlBetten;
		this.zimmerBelegt = zimmerBelegt;
		this.zimmerPreisNacht = zimmerPreisNacht;
	}

	public int getAnzahlBetten() {
		return anzahlBetten;
	}
	public void setAnzahlBetten(int anzahlBetten) {
		this.anzahlBetten = anzahlBetten;
	}
	
	public double getZimmerPreisNacht() {
		return zimmerPreisNacht;
	}
	public void setZimmerPreisNacht(double zimmerPreisNacht) {
		this.zimmerPreisNacht = zimmerPreisNacht;
	}
	public boolean getZimmerBelegt() {
		return zimmerBelegt;
	}
	public void setZimmerBelegt(boolean zimmerBelegt) {
		this.zimmerBelegt = zimmerBelegt;
	}
	public int getZimmerNr() {
		return zimmerNr;
	}
	public void setZimmerNr(int zimmerNr) {
		this.zimmerNr = zimmerNr;
	}

	public String getZimmerName() {
		return zimmerName;
	}

	public void setZimmerName(String zimmerName) {
		this.zimmerName = zimmerName;
	}
	
	
	
}
