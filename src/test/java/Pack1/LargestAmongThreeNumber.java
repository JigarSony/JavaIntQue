package Pack1;

public class LargestAmongThreeNumber {

    public static void main(String[] args) {

        int x = 1100;
        int y = 900;
        int z = 1100;

        if (x >= y && x >= z) {
            System.out.println("X is Largest Number");
        } else if (y >= z) {
            System.out.println("Y is Largest Number");
        } else {
            System.out.println("Z is Largest Number");
        }

        if (x >= y) {
            if (x >= z) {
                System.out.println("X is Largest Number");
            } else {
                System.out.println("Z is Largest Number");
            }
        } else {
            if (y >= z) {
                System.out.println("Y is Largest Number");
            } else {
                System.out.println("Z is Largest Number");
            }
        }

    }
}
