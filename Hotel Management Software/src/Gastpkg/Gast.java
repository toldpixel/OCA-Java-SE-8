package Gastpkg;

import Personenpkg.Person;

public class Gast extends Person{
	private int gastNr;
	private boolean zimmerReserviert;
	public Gast(String vorname, String nachname, String plz, String strasse, int hausNr,
			String staatsangehoerigkeit,boolean zimmerReserviert) {
		super(vorname, nachname, plz, strasse, hausNr, staatsangehoerigkeit);
		 this.zimmerReserviert = zimmerReserviert;
	}
	public int getGastNr() {
		return gastNr;
	}
	public void setGastNr(int gastNr) {
		this.gastNr = gastNr;
	}
	public boolean isZimmerReserviert() {
		return zimmerReserviert;
	}
	public void setZimmerReserviert(boolean zimmerReserviert) {
		this.zimmerReserviert = zimmerReserviert;
	}
}
