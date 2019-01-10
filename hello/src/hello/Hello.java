package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
           System.out.println("你好");
           Scanner in = new Scanner(System.in);
//           System.out.println("echo:" + in.nextLine());
           int amount = 100;
           int price = 0;
           System.out.print("请输入金额：");
           amount = in.nextInt();
           System.out.print("请投币：");
           price = in.nextInt();
           System.out.println(amount+"-"+price+"="+(amount-price));
	}

}
