import java.util.Scanner;

public class Main{
    public static void main(String[] s){
        Scanner sc = new java.util.Scanner(System.in);
        while (sc.hasNextLine()) {
            String[] line = sc.nextLine().trim().split(" ");
            if (line.length < 2)
                continue;
            int n = Integer.parseInt(line[0]);
            for (int j = 0; j < line[1].length(); j++) {
                for (int i = 0; i < n; i++)
                    System.out.print(line[1].charAt(j));
            }
            System.out.println();
        }

    }
}
