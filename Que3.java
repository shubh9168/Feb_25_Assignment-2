public class Que4{
	public static void main(String[] args){
		int n = 15;
		
		if(n<0){
			n = -n;
		}
		
		while(n>3){
			n = (n & 3) + (n >> 2);
		}
		
		if(n==0 || n==3)
			System.out.println("Division by 3");
		else
			System.out.println("Not division by 3");
	
	}
}