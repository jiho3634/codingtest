import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] lines = new String[5];
        for (int i = 0; i < 5; i++) {
            lines[i] = br.readLine();
        }
        int[] arr = new int[5];
        int j = 0;
        while (true) {
            for (int i = 0; i <5; i++) {
                if (j >= lines[i].length()) {
                    arr[i] = 1;
                    continue;
                }
                bw.write(lines[i].charAt(j));
            }
            if (arr[0] == 1 && arr[1] == 1 && arr[2] == 1 && arr[3] == 1 && arr[4] == 1)
                break;
            j++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}

