package pkgButton;

import java.util.ArrayList;
import Wochentagpkg.*;

public class Button{
	private ArrayList<Wtag> wtagList = new ArrayList<>();
	
	public void addWochentag(Wtag tag) {
		wtagList.add(tag);
	}
	
	public void getWochentage() {
		for(Wtag i: wtagList) {
			System.out.println(i.getName());
		}
	}
}
