import java.util.ArrayList;

class StundenplanObj{
	private ArrayList<String> strList = new ArrayList<>();

	public ArrayList<String> getStrList() {
		return strList;
	}

	public void setStrList(String str) {
		strList.add(str);
	}

	
}
public class LinkedList {
	
	public static void main(String[] args) {
	
		StundenplanObj stdPl = new StundenplanObj();
		
		stdPl.setStrList("Datenstrukturen");
		stdPl.setStrList("Netzwerke");
		stdPl.setStrList("Mathematik 2");
		stdPl.setStrList("Geschaeftsprozesse");
		stdPl.setStrList("Programmierung");
		stdPl.setStrList("Zeit und Selbstmanagement");
		
		System.out.println(stdPl.getStrList());
	}

}
