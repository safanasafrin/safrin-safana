package lab1;
import java.util.Scanner;
public class Multiplication {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value for i:");
		
		int i=s.nextInt();
		System.out.println("Enter the value for j:");
		
		int j=s.nextInt();
		int mul=i*j;
		System.out.println("The multiplication of i and j is:"+mul);
		s.close();
		
		
	
	}

}
