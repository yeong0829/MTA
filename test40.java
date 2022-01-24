package MTA;

public class test40 {

	public static void main(String[] args) {
		String grade = "C";
		switch (grade) {
		 case "A": {
			 System.out.println("표준 초과");
		 }
		 case "B":{
			 System.out.println("표준 충족");
		 }
		 default:{
			 System.out.println("개선 필요");
		 }	
		}
	}

}
