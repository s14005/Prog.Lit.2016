import java.util.Scanner;

class C3 {

    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            while (true) {
                        int a = in.nextInt();
                        int b = in.nextInt();
                        if (a == 0 && b == 0) {
                                        break;
                                    } else if (a <= b) {
                                                    System.out.println(a + " " + b);
                                                } else if (b <= a){
                                                                System.out.println(b + " " + a);
                                                            }

                    }
        }
}
