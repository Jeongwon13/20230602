package pkg2;

import java.util.Scanner;

public class Main {


	public int solution(String s) {
		String answer = "";
		
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		 
		return Integer.parseInt(answer);
	}
	
	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		
		System.out.println(T.solution(str));
	}

}
