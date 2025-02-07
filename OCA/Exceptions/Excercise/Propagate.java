class Propagate {
    public static void main(String[] args) {
      try {
            reverse("");
      } 
      catch (Exception e ) 
      {
        System.out.println("Fehler aufgetreten");

      } finally {
        System.out.println("Finished!");
      }
      
    }

    static String reverse(String s) throws Exception {
        
        if(s.length() == 0) {
            throw new Exception("Fehler");
        }

        String reverseStr = " ";
        for(int i = s.length()-1; i >=0; --i) {
            reverseStr += s.charAt(i);
        }

        return reverseStr;   
    }
}