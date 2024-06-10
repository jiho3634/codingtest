import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCaseCount = Integer.parseInt(reader.readLine());
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < testCaseCount; i++) {
            String[] inputs = reader.readLine().split("\\s+");
            int sum = Integer.parseInt(inputs[0]) + Integer.parseInt(inputs[1]);
            output.append(sum).append("\n");
        }
        writer.write(output.toString());
        writer.flush();
    }
}
