import java.util.Scanner;
class B4 {
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
              double a = in.nextDouble();
              double c = (double)2*3.141592653589*a;
              double b = (double)a*a*3.141592653589;
              System.out.println(String.format("%.6f",b) + " " +String.format("%.6f",c));
        }
}
