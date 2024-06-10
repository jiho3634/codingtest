import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            LocalTime startTime = LocalTime.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
            LocalTime endTime = LocalTime.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
            Duration x = Duration.between(startTime, endTime);
            System.out.println(x.toHours() + " " + x.toMinutesPart() + " " + x.toSecondsPart());
        }
        sc.close();
    }
}
