import java.util.Scanner;
class C4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //String op = in.next();
        //int c = in.nextInt();
        while(true){
            int a = in.nextInt();
            String op = in.next();
            int c = in.nextInt();

            if(op.equals("+")){
                System.out.println(a + c);
            }else if(op.equals("-")){
                System.out.println(a - c);
            }else if(op.equals("*")){
                System.out.println(a * c);
            }else if(op.equals("/")){
                System.out.println(a / c);
            }else if(op.equals("?")){
                break;
            }
        }
    }
}
