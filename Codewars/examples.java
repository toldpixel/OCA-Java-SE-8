import java.lang.String;


//Create a masking string with "#" from normal string 3298473249371234 #############1234
public class Maskify {
    public static String maskify(String str) {
        //throw new UnsupportedOperationException("Unimplemented");
      String result = "";
      if(str.length() < 4) {
         return str;
      }
      for(int i = 0; i < str.length()-4; i++) {
         result += "#";
      }
      result = result + str.substring(str.length()-4, str.length());
      return result;
    }
}
