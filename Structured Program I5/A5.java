import java.util.Scanner;
class A5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        while(true){
            int h = in.nextInt();
            int w = in.nextInt();

            if(h == 0 && w == 0){
            break;
            }
           for(int i=0; i<h; i++){
               for(int j=0; j<w; j++){
            System.out.print("#");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
  }
}
