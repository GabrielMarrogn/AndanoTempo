import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean test = false;
        sc.close();

        if(a == b || b == c || a == c){
            test = true;
        }else if(a + b == c || b + c == a || a + c == b){
            test = true;
        }

        if(test == true){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
