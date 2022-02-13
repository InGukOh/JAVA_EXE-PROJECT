package pack_Test;

import java.util.Scanner;

public class TEST_EXE {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아무 글자나 쳐주세요");
		
		String test = scan.next();
		
		if(test != null) {
			System.out.println("Hello");
			String AS = scan.next();
			if(AS == "hi") {
				System.out.println("안녕");
			} else {
				System.out.println("ERROR");
			}
		} 
		
		scan.close();
		System.out.println("입력끝");
		
	}

}
