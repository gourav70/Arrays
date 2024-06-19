import java.util.*;

public class reversestring
{
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b = " ";
		int ptr = a.length()-1;
		while(ptr>=0) {
			b=b+a.charAt(ptr);
			ptr--;
		}
		System.out.print(b);
		
		
		
		
		
		
	}
}