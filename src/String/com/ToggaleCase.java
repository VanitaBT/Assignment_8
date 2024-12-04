package String.com;

import java.util.Scanner;

public class ToggaleCase {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		for(int i=0;i<s.length();i++) {
			char[] ch=s.toCharArray();
			if(ch[i]>='a' && ch[i]<='z') {
				ch[i]=(char)(ch[i]-32);
			
			}else if(ch[i]>='A' && ch[i]<='Z') {
				ch[i]=(char)(ch[i]+32);
			}
			s=new String(ch);
		}
		System.out.println(s);
	}

}
