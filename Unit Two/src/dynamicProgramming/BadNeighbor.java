package dynamicProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//By Daniel Miret
public class BadNeighbor {
	static int base = 0;
	static int[] houses;
	static int[] donation;
	
	public static void main(String[] args) throws FileNotFoundException {
		houses = viewFile();
		solve(houses);
	}

	private static int[] viewFile() throws FileNotFoundException {
		Scanner input = new Scanner(new File("Data/NeighbourInfo.dat"));
			base = input.nextInt();
			houses = new int[base+1];
				for(int i = 0;i<houses.length;i++) {
					houses[i]=input.nextInt();
				}
				
			return houses;	
	}

	private static void solve(int[] housesB) {
		if (housesB.length==1)
			System.out.println(houses[1]);
		else if (housesB.length == 2)
			System.out.println(Math.max(houses[1], houses[2]));
		else if (housesB.length == 3)
			System.out.println(Math.max(Math.max(houses[1], houses[2]), houses[3]));
		else if (donation.length > 1) {
		int[] solution1 = new int[housesB.length - 1];
		int[] solution2 = new int[housesB.length - 1];
		solution1[0] = housesB[0];
		solution2[0] = housesB[housesB.length - 1];
		for (int i = 1; i < housesB.length - 1; i++) {
			int j = housesB.length - 1 - i;
			solution1[i] = Math.max(solution1[i - 1], housesB[i]);
			solution2[i] = Math.max(solution2[i - 1], housesB[j]);

			if (i > 1) {
				solution1[i] = Math.max(solution1[i], solution1[i - 2] + housesB[i]);
				solution2[i] = Math.max(solution2[i], solution2[i - 2] + housesB[j]);
			}
			if (i > 2) {
				solution1[i] = Math.max(solution1[i], solution1[i - 3] + housesB[i]);
				solution2[i] = Math.max(solution2[i], solution2[i - 3] + housesB[j]);
			}
		}

		System.out.println(Math.max(solution1[solution1.length - 1], solution2[solution2.length - 1]));
	} else {
		System.out.println(housesB[0]);
	}
	}
}
