package Gastpkg;

import java.util.ArrayList;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

import Rezeptionistpkg.Rezeptionist;
import Zimmerpkg.Zimmer;

public class GaesteContainer {
	Gast gastObj;
	private ArrayList<Gast> gaesteListe = new ArrayList<>();
	public ArrayList<Gast> getGaesteListe() {
		return gaesteListe;
	}
	/**
	 * Gäste werden aus einem Resource Bundle hinzugefügt
	 */
	public void hinzufuegenGaesteAusFile () {															
		try {	
			ResourceBundle bundle = ResourceBundle.getBundle("GaesteHotel", Locale.getDefault());				
			for(int i = 1; bundle.containsKey(i+".gaesteNr");i++) {	
				String gaesteNr = bundle.getString(i+".gaesteNr");
				String nachname = bundle.getString(i+".nachname");
				String vorname = bundle.getString(i+".vorname");
				String plz = bundle.getString(i+".plz");
				String strasse = bundle.getString(i+".strasse");
				String hausNr = bundle.getString(i+".hausNr");
				String geburtsdatum = bundle.getString(i+".geburtsdatum"); 					
				String staatsangehoerigkeit = bundle.getString(i+".staatsangehoerigkeit");
				String zimmerReserviert = bundle.getString(i+".zimmerReserviert");
				gastObj = new Gast(vorname,nachname,plz,strasse,Integer.parseInt(hausNr),staatsangehoerigkeit,Boolean.parseBoolean(zimmerReserviert));
				gastObj.setGastNr(Integer.parseInt(gaesteNr));
				String[] geburtsDatum = geburtsdatum.split("\\.");										//Datum Eingabe formatieren
				gastObj.setGeburtsDatum(geburtsDatum[2], geburtsDatum[1], geburtsDatum[0]);
				gaesteListe.add(gastObj);		

				for(Gast r : gaesteListe) {																//Debug Message
					System.out.println(
							"[DEBUG] Initialisierung"+"GastNr: "+
									r.getGastNr()+" GastName: "+
									r.getName()+" GastNachname: "+
									r.getNachname()+" GastPLZ: "+
									r.getPlz()+" GastStaatsangehoerigkeit "+
									r.getStaatsangehoerigkeit()+" GastStrasse: "+
									r.getStrasse()+" Geburtsdatum "+
									r.getGeburtsDatum()+" ZimmerReserviert: "
									+ r.isZimmerReserviert() +" Hinzugefügt!");
				}
			}
		}
		catch (MissingResourceException e) {
			System.out.println(e);
		}
	}
	/**
	 * Methode liest die Gäste aus der Eingabe im MainHotelFormular ein
	 * @param gaesteNr
	 * @param nachname
	 * @param vorname
	 * @param plz
	 * @param strasse
	 * @param hausNr
	 * @param geburtsdatum
	 * @param staatsangehoerigkeit
	 * @param zimmerReserviert
	 * @return
	 */
	public boolean hinzufuegenGaesteAusView(String gaesteNr,String nachname,String vorname,String plz,String strasse,String hausNr,String geburtsdatum,String staatsangehoerigkeit,boolean zimmerReserviert) {

		for(Gast r : gaesteListe) {										
			if(r.getGastNr() == Integer.parseInt(gaesteNr))
			{
				return false;											
			}
		}
		gastObj = new Gast(
				vorname,
				nachname,
				plz,
				strasse,
				Integer.parseInt(hausNr),
				staatsangehoerigkeit, Boolean.valueOf(zimmerReserviert));
		gastObj.setGastNr(Integer.parseInt(gaesteNr));
			String[] geburtsDatum = geburtsdatum.split("\\.");											//Datum Eingabe formatieren	
			gastObj.setGeburtsDatum(geburtsDatum[2], geburtsDatum[1], geburtsDatum[0]);
		gaesteListe.add(gastObj);	

		System.out.println(													
				"[DEBUG]"+"GastNr: "+
				gastObj.getGastNr()+" GastName: "+
				gastObj.getName()+" GastNachname: "+
				gastObj.getNachname()+" GastPLZ: "+
				gastObj.getPlz()+" GastStaatsangehoerigkeit "+
				gastObj.getStaatsangehoerigkeit()+" GastStrasse: "+
				gastObj.getStrasse()+
				gastObj.getGeburtsDatum()+
				gastObj.isZimmerReserviert()+
				" wurde aus View Hinzugefügt!");

		return true;
	}

	/**
	 * Alle GaesteNr aus allen vorhandenen Gäste Objekten
	 *  für die JList im GästePanel. 
	 *  Die GästeNrn werden in einem Array zurückgegeben 
	 */
	public String[] gaesteInformationAnzeigen() {							
		String[] gaesteNrString = new String[gaesteListe.size()];
		int i = 0;

		for(Gast r : gaesteListe) {											
			gaesteNrString[i++] = String.valueOf(r.getGastNr());
		}
		System.out.println("[DEBUG] Erzeugter Gaeste String: "+gaesteNrString);
		return gaesteNrString;
	}
	
	/**
	 * Ein Array aus Attributen wird für die Ausgabe in den Gaeste Textfeldern im MainFormular erzeugt 
	 * @param gaesteNr
	 * @return
	 */
	public String[] gaesteAttributeAnzeigen(String gaesteNr) {	
		final int AnzahlAttribute = 8;	
		String[] gaesteAtrArray = new String[AnzahlAttribute];
		for(Gast r : gaesteListe) 
			if(r.getGastNr() == Integer.parseInt(gaesteNr))
			{												   
				gaesteAtrArray[0] = String.valueOf(r.getGastNr());
				gaesteAtrArray[1] = String.valueOf(r.getName());
				gaesteAtrArray[2] = String.valueOf(r.getNachname());
				gaesteAtrArray[3] = String.valueOf(r.getPlz());
				gaesteAtrArray[4] = String.valueOf(r.getStrasse());
				gaesteAtrArray[5] = String.valueOf(r.getHausNr());
				gaesteAtrArray[6] = String.valueOf(r.getStaatsangehoerigkeit());
				gaesteAtrArray[7] = String.valueOf(r.getGeburtsDatum());
			}
		return gaesteAtrArray;
	}
	/**
	 * Gast wird hier aus der ArrayList gelöscht 
	 * @param gaesteNr
	 * @return
	 */
	public boolean gastAusListeLöschen(String gaesteNr) {
		for(Gast r : gaesteListe){
			if(Integer.parseInt(gaesteNr) == r.getGastNr()) {
				gaesteListe.remove(r);
				System.out.println("[DEBUG] GastNr: "+gaesteNr+" wurde aus Liste entfernt");
				return true;
			}		
		}
		System.out.println("[DEBUG] GastNr: "+gaesteNr+" konnte nicht entfernt werden");
		return false;
	}
	/**
	 * Gibt alle Gäste aus der ArrayList wieder für die noch keine Reservierung erzeugt wurde. isZimmerReserviert() true/false
	 * @return
	 */
	public String[] gaesteReservierungenVerfuegbare() {	
		String[] gaesteNrString = new String[gaesteListe.size()];
		int i = 0;
		for(Gast r : gaesteListe) {
			if(r.isZimmerReserviert() == false) {
				gaesteNrString[i++] = Integer.toString(r.getGastNr());
			}		
		}
		System.out.println("[DEBUG] Gast der noch nicht Reserviert hat: "+gaesteNrString);
		
		return gaesteNrString;
	}
}





