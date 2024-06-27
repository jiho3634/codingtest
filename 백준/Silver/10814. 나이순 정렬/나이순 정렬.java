import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Member {
    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Member> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] line = br.readLine().split(" ");
            list.add(new Member(Integer.parseInt(line[0]), line[1]));
        }

        list.sort(Comparator.comparingInt(value -> value.age));

        for (Member m : list) {
            bw.write(m.age + " " + m.name);
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
