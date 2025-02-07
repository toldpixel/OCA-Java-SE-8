/**
 * Der ReservierungContainer hat zur erzeugung einer Reservierung 
 * Zugriff auf ZimmerContainer und den GaesteContainer
 */

package Reservierungpkg;

import java.util.ArrayList;
import Datumpkg.Datum;
import Gastpkg.GaesteContainer;
import Gastpkg.Gast;
import Zimmerpkg.Zimmer;
import Zimmerpkg.ZimmerContainer;

public class ReservierungContainer {
	private ArrayList<Reservierung> reservierungenList = new ArrayList<>();
	GaesteContainer gaesteContainer1;
	ZimmerContainer zimmerContainer1;
	Datum resDatumObj = new Datum();
	
	/**
	 * Konstruktor nimmt die Container auf 
	 * @param gaesteContainer1
	 * @param zimmerContainer1
	 */
	public ReservierungContainer (GaesteContainer gaesteContainer1,ZimmerContainer zimmerContainer1) { 	//Übergabe des Gaeste Containers zum setzen von zimmerReservierung
		this.gaesteContainer1 = gaesteContainer1; 
		this.zimmerContainer1 = zimmerContainer1;
	}
	/**
	 * Neue Reservierung wird mit Reservierung hinzufügen angelegt
	 * @param neueRes
	 * @return
	 */
	public boolean reservierungHinzufuegen(Reservierung neueRes) {
		for(Reservierung r : reservierungenList) {
			if(r.getGastNr() == neueRes.getGastNr())				//Überprüfen, ob Gast schon reserviert hat 
			{
				System.out.println("[Debug] Reservierung für Gast schon vorhanden! konnte nicht angelegt werden");
				return false;											
			} 
		}
			
				setGastZimmerReserviert(neueRes);					//Setzen des zimmer Reserviert Attributes für Gast 
				setZimmerBelegt(neueRes);							//Setzen des zimmer Belegt attributes
				reservierungenList.add(neueRes);					//hinzufügen der Reservierung
				System.out.println("[Debug] Eine neue Reservierung wurde angelegt!");			
		return true;
	}
	
	/**
	 * Hat ein Gast Reserviert wird mit dieser Methode das Zimmer für den Gast Reserviert und auf true gesetzt
	 * @param gastNr
	 * @return
	 */
	public boolean setGastZimmerReserviert(Reservierung gastNr)			//Setzen des zimmerReserviert Attributes 
	{
		for(Gast r : gaesteContainer1.getGaesteListe()) {
			if(r.getGastNr() == Integer.parseInt(gastNr.getGastNr())) {
				r.setZimmerReserviert(true);
				System.out.println("[Debug] zimmer Reserviert wurde für GastNr "+r.getGastNr()+" auf true gesetzt!");
				return true;
			}
		}
		System.out.println("[Debug] zimmer Reserviert konnte für "+gastNr.getGastNr()+" auf nicht gesetzt werden !");
		return false;
	}
	
	/**
	 * Bei Reservierung wird über diese Methode das Zimmer Belegt Attribut true gesetzt
	 * @param zimmerName
	 * @return
	 */
	public boolean setZimmerBelegt(Reservierung zimmerName) {
		for(Zimmer r : zimmerContainer1.getZimmerListe()) {
			if(r.getZimmerName().equals(zimmerName.getZimmerName())) {
				r.setZimmerBelegt(true);
				System.out.println("[Debug] zimmer Belegt wurde für "+r.getZimmerName()+" auf true gesetzt!");
				return true;
			}
		}
		System.out.println("[Debug] zimmer Belegt konnte für "+ zimmerName.getZimmerName() +" nicht auf true gesetzt werden !");
		return false;
	}
	/**
	 * Es wird ein String Array erzeugt um alle Gäste reservierungen anzeigen zu können
	 * @return
	 */
	public String[] reservierungInformationenAnzeigen() {
		String[] reservierNrString = new String[reservierungenList.size()];
		int i = 0;

		for(Reservierung r : reservierungenList) {											
			reservierNrString[i++] = String.valueOf(r.getGastNr());
		}
		System.out.println("[DEBUG] Erzeugter Reservier nr String String: "+ reservierNrString);
		return reservierNrString;
	}
	/**
	 * Attribute zu einer Reservierung anzeigen
	 * @param ausgewaehlt
	 * @return
	 */
	public String[] reservierungAttributeAnzeigen(String ausgewaehlt) {
		final int AnzahlAttribute = 5;	
		String[] reservierungAtrArray = new String[AnzahlAttribute];
		for(Reservierung r : reservierungenList) 
			if(Integer.parseInt(r.getGastNr()) == Integer.parseInt(ausgewaehlt))
			{												   
				reservierungAtrArray[0] = String.valueOf(r.getGastNr());
				reservierungAtrArray[1] = String.valueOf(r.getCheckInDatum());
				reservierungAtrArray[2] = String.valueOf(r.getCheckOutDatum());
				reservierungAtrArray[3] = String.valueOf(r.getZimmerName());
				reservierungAtrArray[4] = String.valueOf(kostenRechnungCalc(r));	//Kosten Methode um Kosten Kalkulation durchzuführen wird hier aufgerufen
			}
		return reservierungAtrArray;
	}
	
	/**
	 * Es wird für eine Reservierung eine Kosten Berechnung (tage x Preis je Nacht) durchgeführt
	 * @param r
	 * @return
	 */
	public double kostenRechnungCalc(Reservierung r) {
		int anzahlTage = resDatumObj.datumDifferenz(r.getCheckInDatum(),r.getCheckOutDatum());		//Übergeben von CheckIn/CheckOut Datum zur Berechnung der Tage Differenz
		double zimmerPreis = 0.0;
		
		for(Zimmer zimmer : zimmerContainer1.getZimmerListe()) {									//Um preis für das Zimmer zu ermitteln wird der ZimmerContainer durchsucht
			if(zimmer.getZimmerName().equals(r.getZimmerName())) {									//Methode ungünstig getZimmerPreis muss Implementiert werden
				zimmerPreis = zimmer.getZimmerPreisNacht();
			}
		}
		
			
		return (double)anzahlTage * zimmerPreis;													//Preis Berechnung 
	}
	/**
	 * Eine Reservierung kann über diese Methode aus der Liste der reservierten Obj gelöscht werden
	 * @param ausgewaehltGast
	 * @return
	 */
	public boolean reservierungLöschen(String ausgewaehltGast) {
		for(Reservierung r : reservierungenList){
			if(Integer.parseInt(ausgewaehltGast) == Integer.parseInt(r.getGastNr())) {
				for(Zimmer zimmer : zimmerContainer1.getZimmerListe()) {							//Durchsuchen von zimmerContainer nach Zimmer und wieder auf frei setzten
					if(zimmer.getZimmerName().equals(r.getZimmerName())) {
						zimmer.setZimmerBelegt(false);
						System.out.println("[Debug] Das Zimmer "+r.getZimmerName()+"ist wieder verfügbar!");
					}
				}
				reservierungenList.remove(r);
				System.out.println("[DEBUG] Reservierung geloescht: "+ausgewaehltGast+" wurde aus Liste entfernt");
				return true;
			}		
		}
		
		System.out.println("[DEBUG] GastNr: "+ausgewaehltGast+" konnte nicht entfernt werden");
		return false;
	}
		
}
