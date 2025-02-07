/**
 * Klasse für Reservierungen 
 */
package Reservierungpkg;

public class Reservierung {
	private String zimmerName;
	private String checkInDatum;
	private String checkOutDatum;
	private String gastNr;
	
	public Reservierung(String zimmerName, String checkInDatum, String  checkOutDatum, String gastNr) {
		this.zimmerName = zimmerName;
		this.checkInDatum = checkInDatum;
		this.checkOutDatum = checkOutDatum;
		this.gastNr = gastNr;
	}
	
	public String getZimmerName() {
		return zimmerName;
	}

	public void setZimmerName(String zimmerName) {
		this.zimmerName = zimmerName;
	}

	public String getCheckInDatum() {
		return checkInDatum;
	}

	public void setCheckInDatum(String checkInDatum) {
		this.checkInDatum = checkInDatum;
	}

	public String getCheckOutDatum() {
		return checkOutDatum;
	}

	public void setCheckOutDatum(String checkOutDatum) {
		this.checkOutDatum = checkOutDatum;
	}

	public String getGastNr() {
		return gastNr;
	}

	public void setGastNr(String gastNr) {
		this.gastNr = gastNr;
	}
}
