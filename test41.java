package MTA;

public class test41 {

	public static void countdown(int start) {
		for(int i = start; i >= 0; --i) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		int start = 25;
		countdown(start);
	}
}
