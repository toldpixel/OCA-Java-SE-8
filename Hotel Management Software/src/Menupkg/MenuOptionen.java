package Menupkg;
import java.util.Scanner;

import Funktionspkg.InitialisierungsKlasse;
import Reservierungpkg.Reservierung;

public class MenuOptionen {
	Scanner in = new Scanner(System.in);
	InitialisierungsKlasse hauptInitialisierungen = new InitialisierungsKlasse();
///////////////////////////////////////////////////////////////////////////
/**
 * Gäste Methoden
 */
	public boolean gaesteInformation(String gaesteNr,String nachname,String vorname, String plz, String strasse, String hausNr,
			String geburtsdatum,String staatsangehoerigkeit,boolean zimmerReserviert) {

		return	hauptInitialisierungen.gaesteInformationenHinzufuegen(
				gaesteNr,
				nachname,
				vorname,
				plz,
				strasse,
				hausNr,
				geburtsdatum,
				staatsangehoerigkeit,
				zimmerReserviert
				);
	}
	
	public String[] gaesteInformationAnzeigen() {
		return hauptInitialisierungen.gaesteInformationAnzeigen();
	}
	
	public String[] getGaesteAttribute(String gaesteNr) {
		return hauptInitialisierungen.gaesteInformationAttribute(gaesteNr);
	}
	
	public boolean gastAusListeLoeschen(String gaesteNr) {
		return hauptInitialisierungen.gastAusListeLoeschen(gaesteNr);
	}
	
	public String[] gaesteReservierungenAnzeigen() {
		return hauptInitialisierungen.gaesteReservierungenInitialisieren();
	}
///////////////////////////////////////////////////////////////////////////
/**
 * Zimmer Methoden
 */
	public String[] zimmerInformationAnzeigen() {
		return hauptInitialisierungen.zimmerInformationAnzeigen();
	}
	
	public String[] getZimmerAttribute(String zimmerName) {
		return hauptInitialisierungen.zimmerInformationAttribute(zimmerName);
	}
///////////////////////////////////////////////////////////////////////////
/**
* Gäste Methoden
*/
	public boolean printHotelManagementLoginMenu(String loginID,char[] password) {
		boolean autorisiert = false;
		if(hauptInitialisierungen.getPersonenContainer1().checkRezeptionistNrundPasswd(Integer.parseInt(loginID),Integer.parseInt(new String(password))))	//Überprüfung der Login Eingabe Daten 
		{
			System.out.println("[DEBUG]Anmeldung "+hauptInitialisierungen.getPersonenContainer1().ausgabeRezeptionistAttribut().getNachname()+", am System");
			autorisiert = true;
		}
		else
		{	
			System.out.println("[DEBUG]Passwort oder Benutzername falsch!");
			autorisiert = false;
		}

		return autorisiert;
	}
///////////////////////////////////////////////////////////////////////////
/**
* Reservierung Methoden
*/
	public String[] zimmerReservierungenAnzeigen() {
		return hauptInitialisierungen.zimmerReservierungenInitialisieren();
		
	}
	
	public boolean neueReservierungAnlegen(Reservierung neueRes) {
		return hauptInitialisierungen.zimmerReservierungAnlegen(neueRes);
	}

	public boolean reservierungAusListeLoeschen(String ausgewaehltGast) {
	
		return hauptInitialisierungen.reservierungAusListeLoeschen(ausgewaehltGast);
	}
///////////////////////////////////////////////////////////////////////////
/**
* Rechnung Methoden
*/
	public String[] rechnungInformationAnzeigen() {
		return hauptInitialisierungen.rechnungInformationenAnzeigen();
	}

	public String[] getRechnungAttribute(String ausgewaehlt) {
		
		return hauptInitialisierungen.getRechnungAttribute(ausgewaehlt);
	}

}
