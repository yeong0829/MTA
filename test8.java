package MTA;

import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		System.out.println(getBirthdate());
	}
	public static String getBirthdate() {
		Scanner s = new Scanner(System.in);
		System.out.println("������ MMDDYYYY �������� �Է��Ͻʽÿ�");
		String birthdate = s.next();
		s.close();
		return birthdate;
	}
}
