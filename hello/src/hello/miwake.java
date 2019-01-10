package hello;

import java.util.Scanner;

public class miwake {

	public static void main(String[] args) {
//		 初始化
		 Scanner in = new Scanner(System.in);
		 int number = in.nextInt();
		 int count = 0;
		 do
		 {
		     number = number / 10;
		     count = count + 1;
		     System.out.println("number="+number+";count="+count);
		 }
		 while (number > 0);
         System.out.println(count);
	}

}
