import java.util.*;

public class Quadratic_R
{
    public static void main(String args[]){
        int a,b,c;
        Scanner s1=new Scanner(System.in);
    
        System.out.println();
        System.out.println("A Qudartic Equation (in its standard form) looks like ax^2+bx+c.");
        System.out.println();
        
        System.out.println("Enter a");
        a=s1.nextInt();
        
        System.out.println();
        
        System.out.println("Enter b");
        b=s1.nextInt();
        
        System.out.println();
        
        System.out.println("Enter c");
        c=s1.nextInt();
        
        System.out.println();
        
        double d=b*b-4*a*c;
        
        if (d>0) 
          System.out.println("The Two roots are: " + ((-b + Math.sqrt(d))/(2*a)) + " and " + ((-b - Math.sqrt(d))/(2*a))); //{ } Compound
        else if(d==0) {
            System.out.println("There exits only one root.");
            System.out.println();
            System.out.println("The Root is: "+ (-b/(2*a)));
            }
        else { 
            System.out.println("The Roots are imaginary.");
            System.out.println();
            System.out.println("The roots are: " + ((float) ((-b + Math.sqrt(-d))/(2*a))) + "i and " + ((float) ((-b - Math.sqrt(-d))/(2*a))) + "i.");
     }

    }
}
