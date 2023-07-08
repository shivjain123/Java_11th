import java.util.*;

class Graduation_Check{
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Please enter your GPA.");
        float gpa = s1.nextFloat();
        
        System.out.println();
        
        System.out.println("Please enter your credit score.");
        float cred = s1.nextFloat();
        
        System.out.println();
        
        if (gpa >= 2.0 && cred >= 120.0){
            System.out.println("Congratulations! You have graduated.");
        } else if(gpa >= 2.0 && cred < 120.0){
            System.out.println("Sadly,you do not have enough credits to graduate. Try harder next time!");
        } else if (gpa < 2.0 && cred >= 120.0){
            System.out.println("Sadly,your GPA is not high enough to graduate. Try harder next time!");
        } else{
            System.out.println("Sadly,you do not meet any of the requirements to graduate. Pay attention on your studies!");
        }
    }
}