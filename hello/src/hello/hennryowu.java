package hello;

import java.util.Scanner;

public class hennryowu {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
           int foot;
           double inch;
           foot = (int)(30/3.0);
           Scanner in = new Scanner(System.in);
           foot = in.nextInt();
           inch = in.nextDouble();
           System.out.println(10/3);
           System.out.println("foot="+foot+",inch="+inch);
           System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
	}

}
