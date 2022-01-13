package MTA;

public class test1{
	public static void main(String[] atgs) {
		double pi = Math.PI; //3.141593
		System.out.format("Pi is %.3f%n", pi); //소수점 이하 3자리: 3.142
		System.out.format("Pi is %.0f%n", pi); //소수점 이하 0자리 출력: 3
		System.out.format("Pi is %09f%n", pi); //9자리, 빈곳은 0: 03.141593
	}
}