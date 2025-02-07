/**
 * Rezeptionisten Klasse. Hier steht provisorisch das Login passwort gesetzt mit 1111. 
 * Dies muss man dann ändern. 
 */

package Rezeptionistpkg;

import Personenpkg.Person;

public class Rezeptionist extends Person {
	private int rezeptionistNr;										
	private int loginPasswd; 									

	public Rezeptionist(int rezeptionistNr, String name, String nachname, String plz, String strasse, int hausNr,
			String staatsangehoerigkeit) {
		super(name, nachname, plz, strasse, hausNr, staatsangehoerigkeit);
		this.rezeptionistNr = rezeptionistNr;
		this.loginPasswd = 1111;  								//Passwort zum ausprobieren hier verändern. Das Passwort kann mit jedem Rezeptionisten verwendet werden.
	}

	public int getRezeptionistNr() {
		return rezeptionistNr;
	}

	public void setRezeptionistNr(int rezeptionistNr) {
		this.rezeptionistNr = rezeptionistNr;
	}
	
	public void zimmerStatusUeberpruefen() {
		
	}
	
	public void checkInDurchfuehren() {
		
	}
	
	public void rechnungErstellen() {
		
	}
	
	public void reservierungDurchfuehren() {
		
	}
	
	public int getPasswd() {
		return this.loginPasswd;
	}
}
