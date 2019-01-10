package hello;

import java.util.Scanner;

public class toshi {

	public static void main(String[] args) {
		final int MINOR = 35;
		
		System.out.print("年齢を入れて下さい:");
		Scanner in = new Scanner(System.in);
		
		int age = in.nextInt();
		
		System.out.print("貴方の年齢は"+age);
		
		if(age < MINOR)
		{
			System.out.println("若いというのは嬉しいことです。");
		}
		
		System.out.println("年齢が貴方の精神世界をきめています、よく大事にしてください。");

	}

}
