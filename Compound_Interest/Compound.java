import java.util.*;

class Compound{
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
        
        float comp =(float) (Math.pow((pa*(1+rate/time)), (rate*time)));
        
        System.out.println("The Compound Interest is: " + (comp-pa));
        
        System.out.println();
        
        System.out.println("The total amount to be paid is: " + (comp));
    }
}