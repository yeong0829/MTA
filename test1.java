package MTA;

public class test1{
	public static void main(String[] atgs) {
		double pi = Math.PI; //3.141593
		System.out.format("Pi is %.3f%n", pi); //�Ҽ��� ���� 3�ڸ�: 3.142
		System.out.format("Pi is %.0f%n", pi); //�Ҽ��� ���� 0�ڸ� ���: 3
		System.out.format("Pi is %09f%n", pi); //9�ڸ�, ����� 0: 03.141593
	}
}