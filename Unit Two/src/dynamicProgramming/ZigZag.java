package dynamicProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//By Daniel Miret
public class ZigZag {
	static int base = 0;
	static public int[] solution = new int[base + 1];
	static public int numElements = 2;
	static int[] nums;
	static int difference = nums[1];

	public static void main(String[] args) throws FileNotFoundException {
		nums=Read();
		solution[1] = 1;
		for (int i = 2; i <= base; i++) {
			if(numElements % 2 == 0 && nums[i] > difference || numElements % 2 == 1 && nums[i] < difference) {
				solution[i] = solution[i - 1] + 1;
				difference = nums[i];
				numElements++;
			}else {
				solution[i] = solution[i - 1];
				difference = nums[i];
			}
		}
	}


	private static int[] Read() throws FileNotFoundException {
		Scanner scanner;
		int[] nums = null;
			scanner = new Scanner(new File("data/zigZagNums.dat"));
			nums = new int[base + 1];
			for (int i = 1; i <= base; i++) {
				nums[i] = Integer.parseInt(scanner.nextLine().trim());
			}
		return nums;
	}

}
