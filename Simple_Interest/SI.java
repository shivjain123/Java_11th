import java.util.*;

class SI{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Please enter the principal amount");
        int pa = s1.nextInt();
        
        System.out.println();
        
        System.out.println("Please enter the rate");
        float rate = s1.nextFloat();
        
        System.out.println();
        
        System.out.println("Please enter the time");
        int time = s1.nextInt();
        
        System.out.println();
        
        float sim = (pa*rate*time)/100;
        
        System.out.println("The Simple Interest is: " + (sim));
        
        System.out.println();
        
        System.out.println("The total amount to be paid is: " + (sim + pa));
        
    }
}