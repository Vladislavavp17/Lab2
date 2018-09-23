package vladislavap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        powFunc();
        System.out.println("Task 2");
        factFunc();
        System.out.println("Task3");
        numSum();
        System.out.println("Task4");
        countFall();
        System.out.println("Task5");
        findCat();
    }

    private static int powFunc() {

        Scanner scan = new Scanner(System.in);
        System.out.print("int your number: ");
        int num = scan.nextInt();
        System.out.print("int your grade: ");
        int pow = scan.nextInt();

        int sum = num;

        for (int i = 1; i < pow; i++) {
            sum *= num;
        }
        System.out.println(num + " in " + pow + " grade is " + sum);

        return sum;
    }

    private static int factFunc() {
        Scanner scan = new Scanner(System.in);
        System.out.print("int your number: ");
        int num = scan.nextInt();

        int result = 1;

        if (num <= 10) {
            for (int i = 1;i <= num; i++){
                result *= i;
            }
            System.out.println(result);
        }else{
            System.out.println("The number is to big");
        }
        return result;
    }

    private static int numSum(){
        Scanner scan = new Scanner(System.in);
        System.out.print("int firts number: ");
        int one = scan.nextInt();
        System.out.print("int second number: ");
        int two = scan.nextInt();

        int sum = one + two;
        int diff = one - two;
        int comp = one * two;

        System.out.println("Sum: " +sum +"\nDifference: "+ diff + "\nComposition:" + comp);

        return sum;
    }

    private static void countFall() {
        Scanner scan = new Scanner(System.in);
        System.out.print("int height: ");
        int h = scan.nextInt();

        double speed =  Math.sqrt((2 * h) / 9.8);
        System.out.println("Falling time from the " + h + " meters equal " + speed + " seconds");
    }
    private static double findCat() {
        Scanner scan = new Scanner(System.in);
        System.out.print("cathetus a: ");
        int a = scan.nextInt();
        System.out.print("hypotenuse c: ");
        int c = scan.nextInt();

        double b = Math.sqrt(c*c - a*a);
        System.out.println("cathetus b = " + b);
        return b;
    }
}