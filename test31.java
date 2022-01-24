package MTA;

public class test31 {
	public static void convertStringToNumber(String numberAsString) {
		double number = Double.parseDouble(numberAsString);
		System.out.println(number);
	}
		
	public static void main(String[] args) {
		convertStringToNumber("0.7");
	}
}
