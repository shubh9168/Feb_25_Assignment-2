import java.util.Scanner;
public class Q22{
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("MENU: ");
		System.out.println("1. ADDITION ");
		System.out.println("2. SUBTRACTION ");
		System.out.println("3. MULTIPLICATION ");
		System.out.println("4. DIVISION ");
		System.out.println("5. FIND REMAINDER ");
		System.out.print("Enter your Option: ");		
		int c = sc.nextInt();
		while(c!=6){
			switch(c){
				case 1: System.out.println("Addition of " + a + " + " + b + " = " + (a+b));
						break;
				case 2: System.out.println("Difference between " + a + " - " + b + " = " + (a-b));
						break;
				case 3: System.out.println("Multiplication of " + a + " x " + b + " = " + (a*b));
						break;
				case 4: System.out.println("Quotient in division of " + a + " / " + b + " = " + ((float)a/(float)b));
						break;
				case 5: System.out.println("Remainder in division of " + a + " and " + b + " = " + ((float)a%(float)b));
						break;
				default:System.out.println("INVALID OPTION");
						break;
			}
			System.out.print("Enter your Option: ");
			c = sc.nextInt();
		}
		System.out.println("EXITING PROGRAMMING!");
	}
}