import javax.net.ssl.SSLContext;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] numbers = br.readLine().strip().split(" ");
        int n = Integer.parseInt(numbers[0]);
        String line = br.readLine();

        int total = line.length() + 1;
        char frontSeat;
        char currentSeat = line.charAt(0);
        boolean coupleSeat = false;
        for (char c : line.toCharArray()) {
           frontSeat = currentSeat;
           currentSeat = c;
           if (coupleSeat && frontSeat == 'L' && currentSeat == 'L') {
               total--;
               coupleSeat = false;
           } else if (!coupleSeat && currentSeat == 'L') {
               coupleSeat = true;
           }
        }
        if (total > n) {
            total = n;
        }
        System.out.println(total);
        bw.close();
        br.close();
    }
}
