package String.com;

import java.util.Scanner;

public class CompareToString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		int result=compareToString(s1, s2);
		if(result<0) {
			System.out.println(s1+" Comes before "+s2);
		}
		else if(result>0) {
			System.out.println(s1+" Comes after "+s2);
		} else {
		System.out.println("Both Strings are equal");
		}
	}
		
		public static int compareToString(String s1,String s2) {
		int minlength=Math.min(s1.length(), s2.length());
		
		for(int i=0;i<minlength;i++) {
			if(s1.charAt(i)<s2.charAt(i)) {
				return -1;
			
			}else if(s1.charAt(i)>s2.charAt(i)) {
				return 1;
			}
		}
		
		if(s1.length()<s2.length()) {
			return -1;
		}
		else if(s1.length()>s2.length()) {
			return 1;
		}
		return 0;
		
		}
		
		
		
		
	

}
