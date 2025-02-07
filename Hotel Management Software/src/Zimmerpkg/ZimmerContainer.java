/**
 * Zimmer Container verwaltet die Zimmer in einer Arraylist()
 * konzepte wiederholen sich hier. Siehe GaesteContainer. 
 */

package Zimmerpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import Gastpkg.Gast;

public class ZimmerContainer {
	private ArrayList<Zimmer> zimmerListe = new ArrayList<>();
	
	public ArrayList<Zimmer> getZimmerListe() {
		return zimmerListe;
	}
	/**
	 * Zimmer werden über ein Resource Bundle eingelesen
	 */
	public void hinzufuegenZimmer(){
		try {	
				ResourceBundle bundle = ResourceBundle.getBundle("ZimmerHotel", Locale.getDefault());				
					for(int i = 1; bundle.containsKey(i+".zimmerNr");i++) {						
						String zimmerName = bundle.getString(i+".zimmerName");
						String zimmerNr = bundle.getString(i+".zimmerNr");
						String anzahlBetten = bundle.getString(i+".anzahlBetten");
						String zimmerBelegt = bundle.getString(i+".zimmerBelegt");
						String zimmerPreisNacht = bundle.getString(i+".zimmerPreisNacht");
						Zimmer zimmerObj = new Zimmer(Integer.parseInt(zimmerNr),zimmerName,Integer.parseInt(anzahlBetten),Boolean.parseBoolean(zimmerBelegt)
						,Double.parseDouble(zimmerPreisNacht));
						zimmerListe.add(zimmerObj);					
						}
					
					for(Zimmer r : zimmerListe) {										//Ausgabe hinzugefügter Zimmer
						System.out.println(
								"[DEBUG] Initialisierung"+"ZimmerNr: "+
										r.getZimmerNr()+" ZimmerName: "+
										r.getAnzahlBetten() +" AnzahlBetten: "+
										r.getZimmerBelegt() +" ZimmerBelegt: "+
										r.getZimmerPreisNacht() +" Preis pro Nacht:"+
										"Hinzugefügt!");
					}
			}
		catch (MissingResourceException e) {
			System.out.println(e);
		}
	}
	
	public void ausgebenAlleZimmer() {
		for(Zimmer z: zimmerListe) {
			System.out.println(z.getZimmerName());
		}
	}

	public String[] zimmerInformationAnzeigen() {
		String[] zimmerNrString = new String[zimmerListe.size()];
		int i = 0;

		for(Zimmer r : zimmerListe) {											
			zimmerNrString[i++] = r.getZimmerName();
		}
		System.out.println("[DEBUG] Erzeugter Zimmer String: "+zimmerNrString);
		return zimmerNrString;
	}

	public String[] zimmerAttributeAnzeigen(String zimmerName) {
		final int AnzahlAttribute = 8;	
		String[] zimmerAtrArray = new String[AnzahlAttribute];
		for(Zimmer r : zimmerListe) 
			if(r.getZimmerName().equals(zimmerName))
			{												   
				zimmerAtrArray[0] = String.valueOf(r.getZimmerNr());
				zimmerAtrArray[1] = String.valueOf(r.getZimmerName());
				zimmerAtrArray[2] = String.valueOf(r.getAnzahlBetten());
				zimmerAtrArray[3] = String.valueOf(r.getZimmerBelegt());
				zimmerAtrArray[4] = String.valueOf(r.getZimmerPreisNacht());
					
			}
		return zimmerAtrArray;
	}
	/**
	 * Es werden mit dieser Methode alle Verfügbaren Zimmer angezeigt 
	 * welche ihr Zimmer Belegt Attribut auf false gesetzt haben 
	 * @return
	 */
	public String[] zimmerReservierungenVerfuegbare() {	
		String[] zimmerNameString = new String[zimmerListe.size()];
		int i = 0;
		for(Zimmer r : zimmerListe) {
			if(r.getZimmerBelegt() == false) {
				zimmerNameString[i++] = r.getZimmerName();
			}		
		}
		System.out.println("[DEBUG] Nicht belegte Zimmer: "+zimmerNameString);
		return zimmerNameString;
	}
	
	
}
