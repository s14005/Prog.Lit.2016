import java.util.Scanner;

class C1 {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            int tate = in.nextInt();
            int yoko = in.nextInt();
            int menseki = tate*yoko;
            int syu = tate*2+yoko*2;
            System.out.println(menseki + " " + syu);
        }
}
