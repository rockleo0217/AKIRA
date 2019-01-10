package hello;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		int y;
		int z;
		System.out.println("三つの数字を入力してください:");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		int max;
		if (x > y)
		{
			if(x > z)
			{
				max = x;
			}
			else
			{
				max = z;
			}
		    max = x;
		}
		else
		{
			if(y > z)
			{
			    max = y;
			}
			else
			{
				max = z;
			}
		}
		System.out.println(max);
     }

}
