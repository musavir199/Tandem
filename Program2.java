import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the input value");
		int a= s.nextInt();
		int b=a*2;
		for (int i = 1; i <b; i++) {
			if(i%2==1) {
				if(i==b-1) {
					System.out.print(i);
					break;
				}
				System.out.print(i+", ");
			}	
		}
	}
}
