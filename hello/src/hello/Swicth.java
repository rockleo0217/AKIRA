package hello;

import java.util.Scanner;

public class Swicth {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int type = in.nextInt();
		switch (type)
		{
		case 1:
		case 2:
		        System.out.println("おはようございます。");
		        break;
		case 3:
			    System.out.println("こんばんは。");
		case 4:
			    System.out.println("さよなら");
			    break;
	    default:
	    	    System.out.println("どうしましたか？");
	    	    break;
		}
	}

}
