import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferdReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferdReader.readLine());

        int[] int_arr = Arrays.stream(bufferdReader.readLine().split(" "))
                              .mapToInt(Integer::parseInt)
                              .toArray();

        boolean isUpward = false;
        int startValue= 0;
        int endValue = 0;
        int maxDifference = 0;

        int previousValue;
        int currentValue = int_arr[0];

        for (int i = 1; i < int_arr.length; i++) {
            previousValue = currentValue;
            currentValue = int_arr[i];
            if (previousValue < currentValue) {
                if (!isUpward) {
                    isUpward = true;
                    startValue = previousValue;
                }
                endValue = currentValue;
            } else {
                if (isUpward) {
                    maxDifference = updateMaxDifference(maxDifference, endValue, startValue);
                }
                isUpward = false;
                startValue = 0;
                endValue = 0;
            }
        }
        if (isUpward) {
            maxDifference = updateMaxDifference(maxDifference, endValue, startValue);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        bufferedWriter.write(String.valueOf(maxDifference));
        bufferedWriter.flush();
        bufferdReader.close();
        bufferedWriter.close();
    }

    static int updateMaxDifference(int maxDifference, int endValue, int startValue) {
        int difference = endValue - startValue;
        if (maxDifference < difference) {
            maxDifference = difference;
        }
        return maxDifference;
    }
}
