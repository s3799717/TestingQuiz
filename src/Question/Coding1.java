package Question;

import java.util.Scanner;

public class Coding1 {

/*  Please complete the following requirements.

    In main method,

    Let user enters two numbers: a and b.

    Call method coding1 and pass the value a and b.

    In method coding1,

    the result of adding, subtracting, and multiplying two numbers should be output on the console.

    Example:
    input:  1
            5

    output: 6
            -4
            5
    */


    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        
        coding1(a,b);

    }

    public static void coding1(int a, int b)
    {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }

}
