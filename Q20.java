public class Q20{
	public static void main(String args[]){
		check(20);
		check(-120);
	}
	
	public static void check(int A){
		int result = (A>0)? A : -A;
		System.out.println("absolute value: " + result);
	}
}