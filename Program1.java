import java.util.Scanner;

public class Program1 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter value of a");
	double a=s.nextDouble();
	System.out.println("Enter value of b");
	double b= s.nextDouble();
	System.out.println("Enter the type of operation");
	System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
	System.out.println("4. Division");
	int c=s.nextInt();
	switch (c) {
	case 1:
		System.out.println(a+b);
		break;
	case 2:
		System.out.println(a-b);
		break;
	case 3: 
		System.out.println(a*b);
		break;
	case 4: 
		System.out.println(a/b);
		break;

	default:
		System.out.println("Enter valid number");
		break;
	}
}
}
