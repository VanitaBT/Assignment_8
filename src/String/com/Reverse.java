package String.com;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		StringBuilder s1=new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			s1.append(ch);
			
			
		}
		System.out.println(s1);
	}

}
