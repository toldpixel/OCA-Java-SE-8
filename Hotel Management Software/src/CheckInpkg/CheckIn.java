package CheckInpkg;

import Datumpkg.Datum;

public class CheckIn {
	private int zimmerNr;
	private int zimmerName;
	private Datum checkInDatum;
	private Datum checkOutDatum;
	
	public int getZimmerNr() {
		return zimmerNr;
	}

	public void setZimmerNr(int zimmerNr) {
		this.zimmerNr = zimmerNr;
	}

	public int getZimmerName() {
		return zimmerName;
	}

	public void setZimmerName(int zimmerName) {
		this.zimmerName = zimmerName;
	}

	public String getCheckInDatum() {
		return checkInDatum.getInsertedDate();
	}
	
	public void setCheckInDatum(String jahr, String monat,String tag) {
		checkInDatum = new Datum(jahr,monat,tag);
	}
	
	public String getCheckOutDatum() {
		return checkOutDatum.getInsertedDate();
	}
	
	public void setCheckOutDatum(String jahr, String monat,String tag) {
		checkOutDatum = new Datum(jahr,monat,tag);
	}
	
	public void checkInAnlegen() {
		/**
		 * Anlegen der Check-Ins
		 */
	}
	
	public void checkInAusgabe() {
		/**
		 * Ausgabe der Check-Ins
		 */
	}
}
