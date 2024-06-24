import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        loop1 :
        for (int i = 0; i < n; i++) {
            String[] numbers_a = br.readLine().strip().split(" ");
            int a = Integer.parseInt(numbers_a[0]);
            int[] arr_a = new int[4];
            for (int j = 1; j < a + 1; j++) {
                arr_a[Integer.parseInt(numbers_a[j]) - 1]++;
            }
            String[] numbers_b = br.readLine().strip().split(" ");
            int b = Integer.parseInt(numbers_b[0]);
            int[] arr_b = new int[4];
            for (int j = 1; j < b + 1; j++) {
                arr_b[Integer.parseInt(numbers_b[j]) - 1]++;
            }
            for (int j = 3; j >= 0; j--) {
                if (arr_a[j] > arr_b[j]) {
                    bw.write("A");
                    bw.newLine();
                    continue loop1;
                } else if (arr_a[j] < arr_b[j]) {
                    bw.write("B");
                    bw.newLine();
                    continue loop1;
                }
            }
            bw.write("D");
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
