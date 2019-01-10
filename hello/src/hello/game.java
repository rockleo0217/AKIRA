package hello;

import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number =(int)(Math.random()*100+1);//  [0,1)-->[0,100)-->[1,100]
        int a;
        int count =0;
        do {    
        a = in.nextInt();
        count = count+1;
        if(a> number)
        {
        	System.out.println("大きです。");
        }
        else if (a< number)
        {
        	System.out.println("小さいです。");
        }
        }while (a!=number);
        System.out.println("おめでとうございます！合計"+count+"回で当てました！");
	}

}
