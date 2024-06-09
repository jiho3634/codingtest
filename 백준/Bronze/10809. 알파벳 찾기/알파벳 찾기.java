public class Main{
    public static void main(String[] args){
        String line = new java.util.Scanner(System.in).nextLine();
        for (int i = 'a'; i <= 'z'; i++)
            System.out.print(line.indexOf(i) + " ");
    }
}
