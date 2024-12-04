package String.com;

import java.util.Scanner;

public class LongestWord {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
	
		
		String[] s1 =s.split(" ");
		
		String longestWord=" ";
		
		for(String word:s1) {
			
			if(word.length()>longestWord.length()) {
				longestWord=word;
			}
		}
		
	}

}
