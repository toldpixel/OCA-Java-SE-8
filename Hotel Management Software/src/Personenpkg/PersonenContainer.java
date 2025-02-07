/**
 * Container soll alle Personenbezogenen Operationen wie hinzuf�gen, l�schen und bearbeiten von Daten erf�llen
 */
package Personenpkg;

import java.util.ResourceBundle;

import Rezeptionistpkg.Rezeptionist;

import java.util.ArrayList;
import java.util.Locale;
import java.util.MissingResourceException;

public class PersonenContainer {
	private static int rezeptionistElement;	
	private ArrayList<Rezeptionist> personenRezeption = new ArrayList<>();
//----------------------------------------------------------------------------------------	
	public void hinzufuegenRezeptionisten() {			
		/** Einlesen der Rezeption Nutzer �ber eine Resource liste **/	
		try {	
					ResourceBundle bundle = ResourceBundle.getBundle("RezeptionPersonen", Locale.getDefault());				
					for(int i = 1; bundle.containsKey(i+".rezeptionistNr");i++) {						
						String rezeptionistNr = bundle.getString(i+".rezeptionistNr");
						String name = bundle.getString(i+".name");
						String nachname = bundle.getString(i+".nachname");
						String plz = bundle.getString(i+".plz");
						String strasse = bundle.getString(i+".strasse");
						String hausNr = bundle.getString(i+".hausNr");
						String staatsangehoerigkeit = bundle.getString(i+".staatsangehoerigkeit");
						Rezeptionist rezeptionistObj = new Rezeptionist(Integer.parseInt(rezeptionistNr), name, nachname,
								plz, strasse, Integer.parseInt(hausNr), staatsangehoerigkeit);
						personenRezeption.add(rezeptionistObj);
						
					}
			}
		catch (MissingResourceException e) {
			System.out.println(e);
		}
	}
//----------------------------------------------------------------------------------------	
	/**
	 * Die Methode �berpr�ft Rezeptionsnr und Passwort f�r das Login. Stimmen rezeptionistNr und passwd �berein 
	 * liefert die Methode ein true zur�ck andernfalls ein false 
	 * @param rezeptionistNr
	 * @param passwd
	 * @return
	 */
//----------------------------------------------------------------------------------------		
	public boolean checkRezeptionistNrundPasswd(int rezeptionistNr,int passwd) {			// Ueberpruefe ob Rezeptionist vorhanden true or false
		boolean ergebnis = false;															// Ueberpruefe das Passwort true und false
		for(int i = 0;i < personenRezeption.size();i++)	{
			if(personenRezeption.get(i).getRezeptionistNr() == rezeptionistNr) {
				if(personenRezeption.get(i).getPasswd() == passwd) {
						this.rezeptionistElement = i;										//Uebergabe des Objekt index f�r das sp�tere Abfragen von Objekt Attributen
						ergebnis = true;
					}
			}
		}
		return ergebnis;		
	}
//----------------------------------------------------------------------------------------		
	public Rezeptionist ausgabeRezeptionistAttribut() {
		return this.personenRezeption.get(rezeptionistElement);								//Uebergabe des Entsprechenden Objektes aus dem Login. Die R�ckgabe f�r Ausgabe von Attributen des Objektes 
	}
	
	public void ausgebenAlleRezeptionisten() {
		for(Rezeptionist r : personenRezeption) {
			System.out.println(r.getName());
		}
	}
}
 

