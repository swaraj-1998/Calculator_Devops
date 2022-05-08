package calculator;
//Added to check github polling 
import java.util.InputMismatchException;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        do {
            System.out.println("Calculator Using Devops : ");
            System.out.print("1 : Factorial\n2 : Square Root\n3 : Power\n4 : Natural Logarithm\n" +
                    "5 : Exit\nChoose Your Choice : ");
            int ch;
            try {
                ch = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (ch) {
                case 1:
                    System.out.print("Enter Number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Factorial is : " + calc.getFactoral(num1));
                    System.out.println("\n");

                    break;
                case 2:
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square root is : " + calc.getSquareRoot(num1));
                    System.out.println("\n");


                    break;
                case 3:
                    System.out.print("Enter the first number : ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    num2 = scanner.nextDouble();
                    System.out.println("Power is : " + calc.getPower(num1, num2));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.print("Enter a number : ");
                    num1 = scanner.nextDouble();
                    System.out.println("Natural log is :" + calc.getNaturalLog(num1));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Turning Off......");
                    return;
            }
        } while (true);
    }
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator() {
    }

    public double getSquareRoot(double num) {
        logger.info("[SQUARE ROOT OF] - " + num);
        double ans = Math.sqrt(num);
        logger.info("[ANS - SQUARE ROOT] - " + ans);
        return ans;
    }
    public double fact(double num) {
        double facto = 1;
        for(int i = 1; i <= num; ++i)
        { facto *= i;   }
        return  facto;
    }
    public double getFactoral(double num) {
        logger.info("[FACTORIAL OF] - " + num);
        double result = fact(num);
        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double getPower(double num1, double num2) {
        logger.info("[POWER - " + num1 + " RAISED TO] " + num2);
        double result = Math.pow(num1,num2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double getNaturalLog(double number1) {
        logger.info("[NATURAL LOG OF] - " + number1);
        double result = 0;
        try {

            if (number1 <0 ) {
                result = Double.NaN;
                throw new ArithmeticException("Exception Occurred");
            }
            else {
                result = Math.log(number1);
            }
        } catch (ArithmeticException error) {
            System.out.println("Exception Occurred");
        }
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

}
