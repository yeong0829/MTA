package MTA;

import java.util.ArrayList;

public class test29 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<String>();
		//red white blue green dodgerblue
		colors.add("red");
		colors.add("white");
		colors.add("blue");
		colors.add("sgreen");
		colors.add("dooderblue");
		//colors���
		System.out.println(colors.size());
		//2���� �� ���
		System.out.println(colors.get(1));
		//3��° �� ����
		colors.remove(3);
		System.out.println(colors.size());
	}

}
