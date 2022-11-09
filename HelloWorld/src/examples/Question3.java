package examples;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Question3 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int length = str.length();
        int half = length / 2;
        for (int i = half; i >= 0; i--) {
            String prefix = str.substring(0, i);
            System.out.println("Rolex:"+prefix);
            String suffix = str.substring(length - i, length);
            System.out.println(suffix);
            if (prefix.equals("") || suffix.equals("")) {
                System.out.println("-1");
                
            }
            if (prefix.equals(suffix)) {
                System.out.println(prefix);
                
            }
        }
    }
}
