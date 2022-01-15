package MTA;

public class test4 {
	public static void main(String[] args) {
		int anum = 55;
		for(int cnt = 0; cnt<10; cnt++) {
			add(anum);
			System.out.println("anum1:"+anum); //55
		}
		System.out.println("anum2:"+anum); //55
	}
	public static void add(int anum) {
		anum++;
		System.out.println("anum3:"+anum); //56
	}
}
