package ButtonUI;
import pkgButton.*;
import Wochentagpkg.*;

public class StarterUI {
	public static void main(String[] args) {
		Wtag Montag = new Wtag("Montag");
		Wtag Dienstag = new Wtag("Dienstag");
		Wtag Mittwoch = new Wtag("Mittwoch");
		Wtag Donnerstag = new Wtag("Donnerstag");
		Wtag Freitag = new Wtag("Freitag");
		Wtag Samstag = new Wtag("Samstag");
		
		Button btn = new Button();
		btn.addWochentag(Montag);
		btn.addWochentag(Dienstag);
		btn.addWochentag(Mittwoch);
		btn.addWochentag(Donnerstag);
		btn.addWochentag(Freitag);
		btn.addWochentag(Samstag);
		
		btn.getWochentage();
	}
}
