package MTA;

import java.util.ArrayList;

public class test29_1 {

	public static void main(String[] args) {
		ArrayList<String> invoices = new ArrayList<String>();
		invoices.add("dog_voice");
		invoices.add("cat_voice");
		invoices.add("sheep_voice");
		Process(invoices);
	}
	public static void Process(ArrayList<String> invoices) {
		for(int i=0; i<invoices.size(); i++) {
			String invoice = invoices.get(i);
			System.out.println(invoice);
		}
	}

}
