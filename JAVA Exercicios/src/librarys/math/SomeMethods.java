package librarys.math;

public class SomeMethods {

    public static void main(String[] args) {

        //Returns the absolute (positive) value.
        int absolute = Math.abs(-10);
        System.out.println(absolute);

        //Returns the largest of two numbers.
        int max = Math.max(10, 23);
        System.out.println(max);

        //Returns the smallest of two numbers.
        int min = Math.min(absolute, 23);
        System.out.println(min);

        //Raises a base to an exponent.
        int pow = (int) Math.pow(11, 2);
        System.out.println(pow);

        //Returns the square root.
        double sqrt = Math.sqrt(pow);
        System.out.println(sqrt);

        //Returns the cube root.
        double cbrt = Math.cbrt(1000);
        System.out.println(cbrt);

        //Round
        double round1 = Math.round(3.7);
        double round2 = Math.round(3.4);
        System.out.println(round1);
        System.out.println(round2);
    }
}
