package String.com;

import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		
		boolean s= isAnagram(s1, s2);
		if(s==true) {
			System.out.println("The Strings Are Anagram");
		}
		else {
			System.out.println("not Anagram");
		}
	}
	
//	-----------------------------------------------------------------------
		public static boolean isAnagram(String s1,String s2) {
			int[] c1=countFrequency(s1);
			int[] c2=countFrequency(s2);
			
			for(int i=0;i<26;i++) {
			     
			if(c1[i]!=c2[i]) 
				return false;
	 
			}
			return true; 
			
	}
//		-----------------------------------------------------------------------

	private static int[] countFrequency(String s1) {
		int[] count=new int[26];
         for(int i=0;i<s1.length();i++) {
        	 
        	 char ch=s1.charAt(i);
        	 if(ch>='A' && ch<='Z') 
        		 count[ch-65]++;
        	 else if(ch>='a' && ch<='z')
        		 count[ch-97]++;
         }
		return count;
	}

}
