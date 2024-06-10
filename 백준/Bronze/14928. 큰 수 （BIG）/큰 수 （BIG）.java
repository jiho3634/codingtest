import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 32768);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out), 32768);
            
            String input = br.readLine();
            int modValue = 20000303;
            int result = 0;
            
            for (int i = 0; i < input.length(); i++) {
                result = (result * 10 + (input.charAt(i) - '0')) % modValue;
            }
            
            bw.write(String.valueOf(result));
            bw.newLine();
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
