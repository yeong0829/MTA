package MTA;

public class test36 {

	public static String showGreeting(String firstName) {
		String welcomeMsg = "�ȳ��ϼ���, ";
		welcomeMsg += firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
		return welcomeMsg;
	}
	
	public static void main(String[] args) {
		System.out.println(showGreeting("MIKE"));
	}
	

}
