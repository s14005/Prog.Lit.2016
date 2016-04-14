import java.util.Scanner;
class C7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
            int r = in.nextInt();
            int c = in.nextInt();
            for(int i=0; i<r; i++){
                int g = 0;
                for(int j = 0; j<c+1; j++){
                    if(c-1 == j){
                        System.out.print(g);
                    }else{
                    int h = in.nextInt();
                    System.out.print(h + " ");
                    g += h;
                    }
                }
            }
    }
}
