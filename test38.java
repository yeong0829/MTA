package MTA;

public class test38 {

	public static void main(String[] args) {
		Pickle pickle = new Pickle();
		pickle.isCreated = true;
		pickle.preserve();
		System.out.println("pickle is " + pickle.isCreated);
	}

}
class Pickle{
	boolean isPreserved = false;
	boolean isCreated = false;

	void preserve() {
		isPreserved = true;
		System.out.println("Preserved");
	}
}