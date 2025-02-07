/**
 * Klasse für Personen Oberklasse für Rezeptionisten und Gast
 */

package Personenpkg;

import Datumpkg.Datum;

public class Person {
	private String name;
	private String nachname;
	private String plz;
	private String strasse;
	private int hausNr;
	private Datum geburtsdatum;
	private String staatsangehoerigkeit;
	
	
	public Person(String name, String nachname, String plz, String strasse, int hausNr, String staatsangehoerigkeit) {
		this.name = name;
		this.nachname = nachname;
		this.plz = plz;
		this.strasse = strasse;
		this.hausNr = hausNr;
		this.staatsangehoerigkeit = staatsangehoerigkeit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public String getPlz() {
		return plz;
	}

	public void setPlz(String plz) {
		this.plz = plz;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHausNr() {
		return hausNr;
	}

	public void setHausNr(int hausNr) {
		this.hausNr = hausNr;
	}

	public String getStaatsangehoerigkeit() {
		return staatsangehoerigkeit;
	}

	public void setStaatsangehoerigkeit(String staatsangehoerigkeit) {
		this.staatsangehoerigkeit = staatsangehoerigkeit;
	}
	
	public String getGeburtsDatum() {
		return geburtsdatum.getInsertedDate();
	}
	
	public void setGeburtsDatum (String jahr, String monat,String tag) {
		geburtsdatum = new Datum(jahr,monat,tag);
	}
	
	
}
