class Operators{
    public static void main(String args[]){
        int b = 4;
        int c = 8;

        System.out.println("The result of 4 divided by 8 is: " + ((double) b/c));

        System.out.println();

        System.out.println("This is a random number: " + ((float) (Math.random())));
        
        System.out.println();
        
        System.out.println("2 to the power 3 is: " + ((float) (Math.pow(2, 3))));
        
        System.out.println();
        
        System.out.println("Square root of 9 is: " + (Math.sqrt(9)));
        
        System.out.println();

        char ch = 'a';
        ch= (char) (ch+1);

        System.out.println("The letter after 'a' is: " + (ch));
    }
}