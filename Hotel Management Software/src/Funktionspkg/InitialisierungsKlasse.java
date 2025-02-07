/**
 * Hier werden die Container für die Personen(Rezeptionisten),Gaeste,Zimmer und Reservierungen erzeugt.  
 */
package Funktionspkg;

import Gastpkg.GaesteContainer;
import Personenpkg.PersonenContainer;
import Reservierungpkg.Reservierung;
import Reservierungpkg.ReservierungContainer;
import Zimmerpkg.ZimmerContainer;

public class InitialisierungsKlasse {
	ZimmerContainer zimmerContainer1 = new ZimmerContainer();
	PersonenContainer personenContainer1 = new PersonenContainer();
	GaesteContainer gaesteContainer1 = new GaesteContainer();
	ReservierungContainer reservierungContainer1 = new ReservierungContainer(gaesteContainer1,zimmerContainer1); //Hat Zugriff auf den Gaeste Container 
	
	public InitialisierungsKlasse() {								//Personen Initialisierung aus den vorhandenen Files
		personenContainer1.hinzufuegenRezeptionisten();
		zimmerContainer1.hinzufuegenZimmer();
		gaesteContainer1.hinzufuegenGaesteAusFile();
	}
	public ZimmerContainer getZimmerContainer1() {
		return zimmerContainer1;
	}
	public void setZimmerContainer1(ZimmerContainer zimmerContainer1) {
		this.zimmerContainer1 = zimmerContainer1;
	}
	public PersonenContainer getPersonenContainer1() {
		return personenContainer1;
	}
	public void setPersonenContainer1(PersonenContainer personenContainer1) {
		this.personenContainer1 = personenContainer1;
	}
	public void reservierungen() {
		
	}
	public void rechnungCheckOut() {
		
	}
//////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean gaesteInformationenHinzufuegen(
			String gaesteNr,
			String nachname,
			String vorname,
			String plz, 
			String strasse, 
			String hausNr,
			String geburtsdatum,
			String staatsangehoerigkeit,
			boolean zimmerReserviert){
		return gaesteContainer1.hinzufuegenGaesteAusView(
				gaesteNr,
				nachname,
				vorname,
				plz,
				strasse,
				hausNr,
				geburtsdatum,
				staatsangehoerigkeit,
				zimmerReserviert);
	}
	public String[] gaesteInformationAnzeigen() {
		return gaesteContainer1.gaesteInformationAnzeigen();
	}
	public String[] gaesteInformationAttribute(String gaesteNr) {
		return gaesteContainer1.gaesteAttributeAnzeigen(gaesteNr);
	}
	public boolean gastAusListeLoeschen(String gaesteNr) {
		return gaesteContainer1.gastAusListeLöschen(gaesteNr);
	}
///////////////////////////////////////////////////////////////////////////
	public String[] zimmerInformationAnzeigen() {
		return zimmerContainer1.zimmerInformationAnzeigen();
	}

	public String[] zimmerInformationAttribute(String zimmerName) {
		return zimmerContainer1.zimmerAttributeAnzeigen(zimmerName);
	}
///////////////////////////////////////////////////////////////////////////
	public String[] zimmerReservierungenInitialisieren() {
		return zimmerContainer1.zimmerReservierungenVerfuegbare();
		
	}
	public boolean zimmerReservierungAnlegen(Reservierung neueRes) {
		return reservierungContainer1.reservierungHinzufuegen(neueRes);
	}
	public String[] gaesteReservierungenInitialisieren() {
		return gaesteContainer1.gaesteReservierungenVerfuegbare();
	}
	
	public boolean reservierungAusListeLoeschen(String ausgewaehltGast) {
		
		return reservierungContainer1.reservierungLöschen(ausgewaehltGast);
	}
///////////////////////////////////////////////////////////////////////////
	public String[] rechnungInformationenAnzeigen() {
		return reservierungContainer1.reservierungInformationenAnzeigen();
	}
	public String[] getRechnungAttribute(String ausgewaehlt) {
		
		return reservierungContainer1.reservierungAttributeAnzeigen(ausgewaehlt);
	}
///////////////////////////////////////////////////////////////////////////
}
