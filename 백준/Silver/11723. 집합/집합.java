import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static final Set<Integer> ALL_NUMBERS = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toSet());
    
    public enum Command {
        ADD, REMOVE, CHECK, TOGGLE, ALL, EMPTY
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Set<Integer> set = new HashSet<>();
        Map<String, Command> commandMap = Map.of(
            "add", Command.ADD,
            "remove", Command.REMOVE,
            "check", Command.CHECK,
            "toggle", Command.TOGGLE,
            "all", Command.ALL,
            "empty", Command.EMPTY
        );
        
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String[] line = br.readLine().split(" ");
            Command command = commandMap.get(line[0]);
            int number = line.length > 1 ? Integer.parseInt(line[1]) : 0;
            
            switch (command) {
                case ADD:
                    set.add(number);
                    break;
                case REMOVE:
                    set.remove(number);
                    break;
                case CHECK:
                    bw.write(set.contains(number) ? "1\n" : "0\n");
                    break;
                case TOGGLE:
                    if (set.contains(number)) {
                        set.remove(number);
                    } else {
                        set.add(number);
                    }
                    break;
                case ALL:
                    set.addAll(ALL_NUMBERS);
                    break;
                case EMPTY:
                    set.clear();
                    break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
