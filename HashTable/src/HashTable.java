import java.util.Hashtable;

public class HashTable {
	
	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		String str = "";
		ht.put(1,"Max");
		ht.put(2,"Pia");
		ht.put(3,"Anton");
		ht.put(4,"Bruno");
		
		for(Integer elem: ht.keySet()) {
			str = ht.get(elem);
			System.out.println(""+elem+":"+str);
		}

	}

}
