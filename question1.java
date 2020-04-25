import java.util.Scanner;

public class question1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = a + b;
                break;
    	   case '-':
                result = a - b;
                break;

            case '*':
                result = a * b;
                break;

            case '/':
                result = a / b;
                break;

            default:
                System.out.printf("Error! please enter a valid operator");
                return;
        }

        System.out.printf("the " + operator + "of two numbers is " +   result);
    }
}
