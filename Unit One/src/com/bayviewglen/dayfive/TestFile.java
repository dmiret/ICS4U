package com.bayviewglen.dayfive;

public class TestFile {

	public static void main(String[] args) {

		LinkedList test = new LinkedList();

		test.add(300);
		test.add(3);
		test.add(15);
		test.addFirst(7);
		test.addFirst(50);
		test.add(6, 5);
		test.removeLastOccurrence(7);

		System.out.println(test.get(4));
		System.out.println(test.getFirst());
		System.out.println(test.getLast());
		
		int[] newtest=test.toArray();
		
		for(int i=0;i<newtest.length;i++) {
			System.out.print((newtest[i])+", ");
		}
	}

}
