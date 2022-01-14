package MTA;

public class test2 {

	public static void main(String[] args) {
		for(int i=0; i<args.length-1; i++) {
			handleArgument(args[i]);
		}
	}

	private static void handleArgument(String s) {
		System.out.println("s:"+s);
	}

}
