package String.com;

import java.util.Scanner;

public class RemoveSpecificChar {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		char ch=sc.next().charAt(0);
		StringBuilder s2=new StringBuilder();
		
		for(int i=0;i<s1.length();i++) {
			char ch1=s1.charAt(i);
			if(ch1!=ch) {
				s2.append(ch1);
				
			}
			
		}
		
		System.out.println(s2);
	}

}
