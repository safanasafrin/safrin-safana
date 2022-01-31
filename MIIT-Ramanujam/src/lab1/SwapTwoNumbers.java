package lab1;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float first=2.0f,second = 4.50f;
		
		System.out.println("BEFORE SWAP");
		System.out.println("first number"+first);
		System.out.println("second number"+second);
		
		float temporary=first;
		first=second;
		second=temporary;
		
		System.out.println("AFTER SWAP");
        System.out.println("first number"+first);
        System.out.println("second number"+second);
        
	}

}
