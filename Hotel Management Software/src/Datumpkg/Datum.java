/**
 * Wickelt alle Datum spezifischen Funktionen des Programmes ab
 */

package Datumpkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
///////////////////////////////////////////////////////////////////////////	
public class Datum {
	private int jahr;
	private int monat;
	private int tag;
	private String datumFormat = "dd.MM.yyyy";	//Das gültige Format für ein Datum kann hier gewechselt werden
	private String value;
	private Calendar date1;
	private Calendar date2;
///////////////////////////////////////////////////////////////////////////		
/**
 * Constructor kann ein Datum aufnehmen und Zerlegt es in jahr/monat/tag
 * Try Catch Block
 */
	SimpleDateFormat sdf = new SimpleDateFormat(datumFormat);
	public Datum (String jahr,String monat,String tag) {	
		this.jahr = Integer.parseInt(jahr);
		this.monat = Integer.parseInt(monat);
		this.tag = Integer.parseInt(tag);
	}
	public Datum() { 							//Überladung erzeugung von Objekt ohne Datum ist gültig 
	}
///////////////////////////////////////////////////////////////////////////	
/**
 * konvertieren von Datum Strings in Calendar objekte
 * @param date1
 * @param date2
 */
	public void convertDateStringCalendar(String date1,String date2) {	//Funktion ohne vorherigen Formattest nicht benutzen!
		String[] date1_arr = date1.split("\\.");						//Konvertiere Strings in Calender Objekte
		String[] date2_arr = date2.split("\\.");
		
		this.date1 = new GregorianCalendar(Integer.parseInt(date1_arr[2]),Integer.parseInt(date1_arr[1])-1,Integer.parseInt(date1_arr[0]));
		this.date2 = new GregorianCalendar(Integer.parseInt(date2_arr[2]),Integer.parseInt(date2_arr[1])-1,Integer.parseInt(date2_arr[0]));
	}
/**
 * erzeugen des Calendar Objektes aus den Constuctor Parametern im entsprechenden Format
 * @return
 */
	public String getInsertedDate() {    
		Calendar calendar = new GregorianCalendar(this.jahr,this.monat-1,this.tag); //Auf Monat achten monat-1 sollte korrekt sein
		return datumFormat = sdf.format(calendar.getTime());
	}
/**
 * Überprüfen, ob Kalender im richtigen Format vorliegt 
 * @param chk_date
 * @return
 */
	public boolean isValid(String chk_date) {	//Überprüfen, ob Kalender im richtigen Format vorliegt
		Date datum = null;
		this.value = chk_date;
		try {

			datum = sdf.parse(value);				//format prüfung
			if (!value.equals(sdf.format(datum))) {
				System.out.println("[DEBUG] Kalenderdatum Format falsch!");
				return false;
			}
		} catch (ParseException ex) {
			//ex.printStackTrace();  
			System.out.println("[DEBUG] Kalenderdatum Format falsch!");
			return false;
		}       
		if(!isValidDate(chk_date))	//Vor Ausgabe prüfen, ob Datum in der Vergangenheit liegt
			return false;

		return true;
	}
/**
 * Überprüfen, ob ein übergebenes Datum aktuell ist 
 * @param chk_date
 * @return
 */
	public boolean isValidDate(String chk_date) {	//Prüfen, ob das angegebene Datum in der Vergangenheit liegt
		String[] new_date = chk_date.split("\\.");	//Das zu überprüfende Datum muss in ein Calender Objekt konvertiert werden
		Calendar calendar = new GregorianCalendar(Integer.parseInt(new_date[2]),Integer.parseInt(new_date[1])-1,Integer.parseInt(new_date[0]));
		String date_heute = sdf.format(Calendar.getInstance().getTime()); //Vorbereitung zur überprüfung, ob Datum in der Vergangenheit liegt getInstance muss im richtigen vergleichsformat vorliegen 
		String[] new_date_heute = date_heute.split("\\.");
		Calendar calendar2_heute = new GregorianCalendar(Integer.parseInt(new_date_heute[2]),Integer.parseInt(new_date_heute[1])-1,Integer.parseInt(new_date_heute[0]));
		if(calendar.before(calendar2_heute)) {
			System.out.println("[DEBUG] Kalenderdatum ist in der Vergangenheit!");
			return false;
		}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("[DEBUG] Kalenderdatum OK und liegt vor dem heutigen Datum");
		return true;
	}
	
	public Calendar getDate1() {
		return date1;
	}
	public Calendar getDate2() {
		return date2;
	}
	/**
 * Zwei Übergebene String Daten auf gültigen Zeitraum überprüfen before/after
	 * @param date1_string
	 * @param date2_string
	 * @return
	 */
	public boolean beforeAndAfterDate(String date1_string,String date2_string) {	//Überprüfe 2 Datum auf Vergangenheit
		convertDateStringCalendar(date1_string, date2_string);
		if(this.date1.before(this.date2))
		return true;
		
		return false;
	}
/**
 * Differenz berechnung von 2 Datums angaben Datum1-Datum2 
 * @param datum1
 * @param datum2
 * @return
 */
	public int datumDifferenz(String datum1,String datum2) { //Berechnet die differenz zwischen CheckIn und CheckOut und gibt Anzahl der Tage wieder 
		int diffdays = 0;
		convertDateStringCalendar(datum1, datum2);			//Konvertierung in Calendar Objekte  
		
		while(this.date1.before(this.date2)) {				//Wenn date1 <= date 2 dann addiere einen Kalendertag
			date1.add(Calendar.DAY_OF_MONTH,1);
			diffdays++;
		}
		
		return diffdays;									//Anzahl der Kalendertage
		
	}



	public boolean isValidGeb(String chk_date) {	//Überprüfen, ob Kalender im richtigen Format vorliegt
		Date datum = null;
		this.value = chk_date;
		try {
	
			datum = sdf.parse(value);				//format prüfung
			if (!value.equals(sdf.format(datum))) {
				System.out.println("[DEBUG] Kalenderdatum Format falsch!");
				return false;
			}
		} catch (ParseException ex) { 
			System.out.println("[DEBUG] Kalenderdatum Format falsch!");
			return false;
		}       
		
	
		return true;
	}

}
//Link:
//https://www.mkyong.com/java/java-date-and-calendar-examples/