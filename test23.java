package MTA;

public class test23 {
	public static boolean duplicate(int[] array) {
		boolean isDuplicate = false;
		for(int x = 0; x < array.length - 1; x++) {
			for (int y = x + 1; y < array.length; y++) {
				if (array[x] == array[y])
					isDuplicate = true;
			}
			if(isDuplicate) break;
		}
		return isDuplicate;
	}
	
	public static void main(String[] args) {
		int[] array = {1, 3, 3, 5, 7, 6};
		System.out.println(duplicate(array));
	}

}
