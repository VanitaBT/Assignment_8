package String.com;

import java.util.Scanner;

public class SubString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		String ss=sc.nextLine();
		
		char[] mc=s.toCharArray();
		char[] sc1=ss.toCharArray();
		int j=0;
		for(int i=0;i<mc.length;i++) {
		int f=i;
		
		
		while(f<mc.length && j<sc1.length && mc[f]==sc1[j]) {
			f++;
			j++;
		}
		
		
		
		
	}
	if(j==sc1.length) {
		System.out.println("sub String is present");
	}
	else {
	System.out.println("sub String is not present");
	}
	}

}
