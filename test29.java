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
		//colors출력
		System.out.println(colors.size());
		//2번쨰 값 출력
		System.out.println(colors.get(1));
		//3번째 값 삭제
		colors.remove(3);
		System.out.println(colors.size());
	}

}
