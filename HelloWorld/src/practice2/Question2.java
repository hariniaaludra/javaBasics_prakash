package practice2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class Question2 {
    static boolean isDigit(char digit) {
        if (digit >= '0' && digit <= '9') return true;
        return false;
    }
    public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
            //@SuppressWarnings("unused")
			//StringBuilder sb = new StringBuilder();
            HashSet < Integer > hs = new HashSet < > ();
            for (int i = 0; i < input.length(); i++) {
                if (isDigit(input.charAt(i))) {
                	System.out.println("noob:"+i);
                    String dig = String.valueOf(input.charAt(i));
                    System.out.println("kjh:"+dig);
                    //HashSet < Integer > hs = new HashSet < > ();
                    hs.add(Integer.parseInt(dig));
                }
            }
            ArrayList < Integer > digitList = new ArrayList < > (hs);
            Collections.sort(digitList,Collections.reverseOrder());
            System.out.println("god:"+digitList);
            int len = digitList.size();
            System.out.println("size :"+len);
                     boolean evenDigitFound =false;
            for (int i = len - 1; i >= 0;) {
                int digit = digitList.get(i);
                System.out.println("k:"+digit);
                
               if (digit % 2 == 0) {
                	System.out.println("pup:"+i);
                    digitList.remove(i);
                    System.out.println("remo"+digitList);
                   
                digitList.add(digit); //adding even digit at end
                    evenDigitFound = true;
                    break;
                }
        }
            if (evenDigitFound == false) {
                System.out.print(-1);
            } else {
                for (int dig: digitList) System.out.print(dig);
            }
    }
}