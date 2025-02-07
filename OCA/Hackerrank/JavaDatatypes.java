import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127) {
                    System.out.println("* byte");
                } if(x >=Short.MIN_VALUE && x <= Short.MAX_VALUE) { // -32,768 to 32,767
                    System.out.println("* short");  
                } if(x>=Integer.MIN_VALUE && x<=Integer.MAX_VALUE) { // -2147483648 to 21474836
                    System.out.println("* int");
                } if(x>=Long.MIN_VALUE && x<=Integer.MAX_VALUE) { //  -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
                    System.out.println("* long");
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



