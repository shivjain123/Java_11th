import java.util.*;

public class employees {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the basic.");
        int base = in.nextInt();

        System.out.println(base+(base*5/100)+(base*55/100));

        in.close();
    }
}
