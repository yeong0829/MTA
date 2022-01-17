package MTA;

import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		System.out.println(getBirthdate());
	}
	public static String getBirthdate() {
		Scanner s = new Scanner(System.in);
		System.out.println("생일을 MMDDYYYY 형식으로 입력하십시오");
		String birthdate = s.next();
		s.close();
		return birthdate;
	}
}
