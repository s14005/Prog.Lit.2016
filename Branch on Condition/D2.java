import java.util.Scanner;

class D2{
     public static void main(String[] args){
                  Scanner in = new Scanner(System.in);
                  int w = in.nextInt();
                  int h = in.nextInt();
                  int x = in.nextInt();
                  int y = in.nextInt();
                  int r = in.nextInt();

                  if(x+r <= w && 0 <= x-r && 0 <= y-r && y+r <= h){
                       System.out.println("Yes");
                  }else{
                       System.out.println("No");
                  }
     }
}
