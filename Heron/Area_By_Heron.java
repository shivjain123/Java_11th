import java.util.*;
class Area_By_Heron {
    public static void main(String args[]){
        float a,b,c;
        Scanner s1=new Scanner(System.in);
        System.out.print("Enter the three sides");
        a=s1.nextFloat();
        b=s1.nextFloat();
        c=s1.nextFloat();
        
        double s=(a+b+c)/2.0;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of a triangle= "+ area + " square units.");

        s1.close();
   }
}