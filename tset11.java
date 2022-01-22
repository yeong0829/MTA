package MTA;

import java.util.Scanner;

public class tset11 {

	public static void main(String[] args) {
		Scanner s = new Scanner("1 탁월 2 우수 3 양호 4 불량");
		Object data1 = s.next(); 
		System.out.println("data1:"+data1);
		Object data2 = s.next();
		System.out.println("data2:"+data2);
		Object data3 = s.nextInt();
		System.out.println("data3:"+data3);
		Object data4 = s.nextLine();
		System.out.println("data4:"+data4);
	}

}
