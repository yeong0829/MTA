package MTA;

public class tset44 {
	public static int fee(char model) {
		int price = 0;
		switch (model) {
			case 'A':
				price = 50;
				break;
				
			case 'T':
				price = 20;
				
			case 'C':
				price = 5;
				break;
				
			default :
				price = 100;
				break;
		}
		return price;
	}
	
	public static void main(String[] args) {
		System.out.println("model ���� 'A'�� �� : " + fee('A'));
		System.out.println("model ���� 'T'�� �� : " + fee('T'));
		System.out.println("model ���� 'C'�� �� : " + fee('C'));
		System.out.println("model ���� �� ���� ���� �� : " + fee('B'));
				
	}

}
