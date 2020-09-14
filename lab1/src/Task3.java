import java.util.Scanner;
public class Task3
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int sum;
        int mul;

        System.out.print("Enter the number a: "); // prompt
        a = input.nextInt();

        System.out.print("Enter the number b: "); // prompt
        b = input.nextInt();

        System.out.print("Enter the number c: "); // prompt
        c = input.nextInt();


        sum = a + b + c;
        System.out.printf("Sum is %d%n", sum);  //display Addition

        System.out.println((a + b + c) / 3);  //display average

        mul = a * b;
        System.out.printf("Multiplication is %d%n", mul); // display Multiplication

        if(a > b && a > c){
            System.out.println("number a is the largest");
        }
        if(b > a && b > c){
            System.out.println("number b  is the largest");
        }
        if(c > b && c > a){
            System.out.println("number c is the largest");
        }
        if(a < b && a < c){
            System.out.println("number a is the smallest");
        }
        if(b < a && b < c){
            System.out.println("number b is the smallest");
        }
        if(c < b && c < a){
            System.out.println("number c is the smallest");
        }
    }
}
