public class Lab4 {

	public static void main(String[] args) {
		int[] a = {37, 12, 17, 59};
		int[] b = {6, 0, -4, 1004, 12};
		int[] c = {59, 37, 17, 12};
		int[] d = null;
		
		System.out.println( printArray( sort(a) ) );
		System.out.println( printArray( sort(b) ) );
		System.out.println( printArray( sort(c) ) );
		System.out.println( printArray( sort(d) ) );
	}

	public static int[] sort(int[] input) {
		
		if (input == null) {
			return null;
		} else if (input.length < 2) {
			return input;
		}

		int[] result = input;
		for (int j = 0; j < result.length; j++) {
			for (int i = 0; i < result.length-1; i++) {
				int a = result[i];
				int b = result[i+1];
				if (a < b) {
					result[i] = b;
					result[i+1] = a;
				}
			}
		}
		return result;
	}
	
	public static String printArray(int[] input) {
		String output = "";
		for (int i = 0; i < input.length; i++) {
			output += input[i] + " ";
		}
		return output;
	}		
}