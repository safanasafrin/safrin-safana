package lab1;

public class SwitchCase {
	public static void main(String[] args) {
		int tech=2;
		switch(tech) {
		case 1:
		{
			System.out.println("java");
			break;
		}
		case 2:
			System.out.println("es6");
			default:{
				System.out.println("not listed..");
			}
			
		}
	}
	

}
