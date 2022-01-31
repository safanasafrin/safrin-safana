package lab1;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter the lenghth of rectangle");
		        double lenght=sc.nextDouble();
		        System.out.println("enter the width of rectangle");
		        double width=sc.nextDouble();
		        double area=lenght*width;
		        System.out.println("area of rectangle is" +area);
		        sc.close();
		        
		
	}

}
