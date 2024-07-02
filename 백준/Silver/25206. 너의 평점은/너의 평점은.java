import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Double> gradeMap = new HashMap<>();
        gradeMap.put("A+", 4.5);
        gradeMap.put("A0", 4.0);
        gradeMap.put("B+", 3.5);
        gradeMap.put("B0", 3.0);
        gradeMap.put("C+", 2.5);
        gradeMap.put("C0", 2.0);
        gradeMap.put("D+", 1.5);
        gradeMap.put("D0", 1.0);
        gradeMap.put("F", 0.0);

        double totalCredits = 0.0;
        double totalGradePoints = 0.0;
        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            if (!input[2].equals("P")) {
                Double dCredit = Double.parseDouble(input[1]);
                totalCredits += dCredit;
                totalGradePoints += dCredit * gradeMap.get(input[2]);
            }
        }

        bw.write(String.valueOf(totalGradePoints / totalCredits));
        bw.flush();
        bw.close();
        br.close();
    }
}