package String.com;

import java.util.Scanner;

public class ReplaceWord {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		String p=sc.next();
		String r=sc.next();
		
		String s=s1.replace(p, r);
		
		System.out.println(s);
		
		
		
	}

}
