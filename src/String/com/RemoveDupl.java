package String.com;

import java.util.Scanner;

public class RemoveDupl {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		StringBuilder s1=new StringBuilder();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			
			if(s1.indexOf(String.valueOf(ch))==-1) {
				s1.append(ch);
			}
			
		}
		System.out.println(s1);
	}

}
