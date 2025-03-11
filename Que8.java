public class Que8{
	public static void main(String[] args){
		boolean x = true, y = false, z = true;
		check(x,y,z);
		x = true; y = false; z = false;
		check(x,y,z);
	}
	
	public static void check(boolean a, boolean b, boolean c){
		if((a && (b||c)) || (c && (a||b)) || (b && (a||c))){
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	} 
}	