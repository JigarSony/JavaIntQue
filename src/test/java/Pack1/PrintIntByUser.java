package Pack1;

import java.util.Scanner;

public class PrintIntByUser {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a Number: ");

        int num = reader.nextInt();
        System.out.println("Entered Number is "+ num);

    }
}
