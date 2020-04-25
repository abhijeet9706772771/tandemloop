import java.util.Scanner;

public class question2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int a = scanner.nextInt();

	System.out.print("Odd Numbers series are: ");
	for (int i = 0; i < a; i++) {

	System.out.println((2*i) + 1);
	System.out.println(" ");

	}
    }
}
