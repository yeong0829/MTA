package MTA;

public class test42 {

	public static double safeRoot(double radicand, double index) {
		if (radicand >= 0) {
			return Math.pow(radicand, 1 / index);
		} else {
			if (index % 2 == 0) return (Double) null;
			else return -Math.pow(-radicand, 1 / index);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radicand = -10;
		double index = 5;
		System.out.println(safeRoot(radicand, index));
	}

}
