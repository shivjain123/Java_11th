import java.util.Scanner;

class Prime{
    public static void main(String args[]){
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();

            if (a == 1){
                System.out.println("It is a unique number");
            } else if (a == 2){
                System.out.println("It is prime");
            } else{
                for (int i = 2; i < a; i++){
                    if (a % i == 0 ){
                        System.out.println("It is composite");
                        break;
                    } else {
                        System.out.println("It is prime");
                    }
                }
            }
        }
    }
}