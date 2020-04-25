import java.util.Scanner;

public class question3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int a = scanner.nextInt();

	if (a % 2 != 0) {

        System.out.println("Odd Numbers series are: ");
        for (int i = 0; i < a; i++) {

        System.out.println((2*i) + 1);
        System.out.println(" ");
}
}
	else
	{
	System.out.println("Odd Numbers series are: ");
        for (int i = 0; i < a-1; i++) {

        System.out.println((2*i) + 1);
        System.out.println(" ");
}
}


    }
}


