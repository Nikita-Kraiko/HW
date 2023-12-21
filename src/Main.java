
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // 0 задание
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");

        // 1 задание
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();
        double a = 4 * (b + c - 1) / 2;
        System.out.println("Result= " + a);

        // 2 или 3 задание, тут можно любое число использовать
        System.out.println("Enter number: ");
        int n;
        int sum =0;
        for(n = scanner.nextInt(); n != 0; n /= 10)
        {
            sum = sum + (n % 10);
        }
        System.out.println("Sum =  " + sum);


        // задание 4
        System.out.println("Enter number ");
        double m =  scanner.nextDouble();
        int x = (int)(m + 0.5);
        System.out.println("Result=" + x);

        // задание 5
        System.out.println("Enter q");
        int q = scanner.nextInt();
        System.out.println("Enter w");
        int w = scanner.nextInt();
        int del = q / w;
        int percent = q % w;
        System.out.println(q + " / " + w + " = " + del + " ,remainder " + percent);


        // задание 6
        System.out.println("Enter number1 ");
        int num1 = scanner.nextInt();
        System.out.println("Enter number2 ");
        int num2 = scanner.nextInt();
        num1 = num1 ^ num2 ^ (num2 = num1);
        System.out.println(num1 + " " + num2);

    }
}