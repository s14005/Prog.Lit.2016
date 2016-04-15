import java.util.Scanner;

class D5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;

        for(int i = 1; i <= n; i++ ){
            if(i % 3 == 0){
                System.out.print(" " + i);
            }else{
                a = i;

                while(a > 0){
                    if (a % 10 == 3){
                        System.out.print(" " + i);
                        break;
                    }else{
                        a /= 10;
                    }
                }
            }
        }
        System.out.println();
    }
}
