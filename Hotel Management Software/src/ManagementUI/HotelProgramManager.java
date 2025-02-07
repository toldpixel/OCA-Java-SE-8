/**
 * Eigentliche Programm Verwaltung, hotelController wird aus dieser Klasse erzeugt.
 * Alle Programmfunktionalitäten werden hier aufgerufen
 */

package ManagementUI;

import Menupkg.MenuOptionen;
import Reservierungpkg.*;

public class HotelProgramManager {
	MenuOptionen menu1 = new MenuOptionen();													//Eigentlich überflüssig, regelt zusätzlich den Programmfluss
	boolean autorisiert = false;																//Zur Überprüfung der Autorisierung im Login
///////////////////////////////////////////////////////////////////////////
/**
 * Überprüfung der Reservierungsnr. und des Passwortes 
 */
	public boolean loginManager(String txtBenutzerID,char[] passwordField) {			
		return autorisiert = menu1.printHotelManagementLoginMenu(txtBenutzerID,passwordField); 
	}
///////////////////////////////////////////////////////////////////////////
/**
 * Alle Gäste Methoden
 */
	public boolean gaesteHinzufuegen(String  gaesteNr, String nachname, String vorname, String plz, String strasse, String hausNr,
			String geburtsdatum, String staatsangehoerigkeit, boolean zimmerReserviert) {
		
		return menu1.gaesteInformation(gaesteNr,nachname,vorname,plz,strasse,hausNr,
				geburtsdatum,staatsangehoerigkeit,zimmerReserviert);
	}
	
	public String[] gaesteAnzeigenListe() {														
		
		return menu1.gaesteInformationAnzeigen();
	}
	
	public String[] gastAttributeAbfragen(String gaesteNr) {									
		return menu1.getGaesteAttribute(gaesteNr);
	}
	
	public boolean gastLoeschen(String gaesteNr) {		
		return menu1.gastAusListeLoeschen(gaesteNr);
	}
	
	public String[] gaesteVerfuegbarAnzeigen() {
		return menu1.gaesteReservierungenAnzeigen();	
	}
///////////////////////////////////////////////////////////////////////////
/**
 * Alle Zimmer Methoden 
 * 
 */
	public String[] zimmerAnzeigenListe() {		
		return menu1.zimmerInformationAnzeigen();
	}
	
	public String[] zimmerAttributeAbfragen(String zimmerName) {								//Attribute Abfragen und in Textfeldern zurückgeben
		return menu1.getZimmerAttribute(zimmerName);
	}
	
	public String[] zimmerVerfuegbarAnzeigen() {
		return menu1.zimmerReservierungenAnzeigen();	
	}
///////////////////////////////////////////////////////////////////////////
/**
 * Alle Reservierung Methoden 
 *
 * 
 */
	public boolean neueReservierung(Reservierung neueRes) {
		return menu1.neueReservierungAnlegen(neueRes);
	}
	public boolean reservierungLoeschen(String ausgewaehltGast) {
		return menu1.reservierungAusListeLoeschen(ausgewaehltGast);	
	}
///////////////////////////////////////////////////////////////////////////
/**
 * Alle Rechnung Methoden
 * 
 */
	public String[] rechnungAnzeigenListe() {
		return menu1.rechnungInformationAnzeigen();
	}
	public String[] rechnungAttributeAbfragen(String ausgewaehlt) {	
		return menu1.getRechnungAttribute(ausgewaehlt);
	}
	
}

