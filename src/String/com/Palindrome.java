package String.com;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.next();
	
	int f=0;
	int l=s.length()-1;
	
	while(f<l) {
		if(s.charAt(f)!=s.charAt(l)) {
			System.out.println("not a palindrme");
			break;
		}
		f++;
		l--;
		
	}
	if(f==l) {
		System.out.println(" is a palindrome");
	}
			
	}
	
	

}
