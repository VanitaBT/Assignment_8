package String.com;

import java.util.Scanner;

public class CVowelConst {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		int countv=0;
		int countc=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ) {
				countv++;
			}
			else {
				countc++;
			}
		}
		System.out.println("the vowels are : "+countv);
		System.out.println("the constunates are: "+countc);
	}

}
