import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            int h = s/3600;
            int m = s%3600/60;
            int S = s%3600%60;
            System.out.println(h + ":" + m + ":" + S);
        }
}
