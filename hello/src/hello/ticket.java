package hello;

import java.util.Scanner;

public class ticket {

	public static void main(String[] args) {
//         初始化
		   Scanner in = new Scanner(System.in);
		   int balance = 0;
//         金額を読み込み中
    while(true)
    {
    	   System.out.print("金を入れて下さい:");
		   int amount = in.nextInt();
		   balance = balance + amount;
		   if (balance >=160)
		   {
//         チケットを出します
		   System.out.println("**************");
		   System.out.println("*山手線*");
		   System.out.println("*フリーチケット*");
		   System.out.println("*値段:160円*");
		   System.out.println("**************");
//         おつり
		   System.out.println("おつり:" + (balance -160));
		   balance = 0;
		   }
		}
	}
}
