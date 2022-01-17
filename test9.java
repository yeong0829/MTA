package MTA;

public class test9 {

	public static void main(String[] args) {
		int age = 63;
		int income =  20000;
		if (age > 65 &&  income  >= 10000 ||
				age >=  21 &&  income > 25000) {
			System.out.println("Approved");
        }else {
        	System.out.println("Declined");
        }
	}

}
