package com.bayviewglen.dayone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class WordSorter {

	public static void main(String[] args) throws FileNotFoundException {
		
		String[] allWords = new String[1000];
		int wordCount = 0;

		Scanner input = new Scanner(new File("Data/words.dat"));
		while (input.hasNext()) {
		    String word = input.next();
		    allWords[wordCount] = word;
		    wordCount++;
		}
		
		input.close();
		
		
	allWords=truncateArray(allWords, wordCount);
		
	Arrays.sort(allWords);
	
		for(int s=0;s < allWords.length;s++) {
			System.out.println(allWords[s]);
		}
	System.out.println();
	
		allWords=RemoveMiddle(allWords);
		
		for(int s=0;s < allWords.length;s++) {
			System.out.println(allWords[s]);
		}
	}

	private static String[] RemoveMiddle(String[] allWords) {
		String[] temp=new String[allWords.length-1];
		
		
		for(int x=0;x<allWords.length;x++) {
			if(x<allWords.length/2) {
				temp[x-1]=allWords[x];
			}else if(x>allWords.length/2){
				temp[x]=allWords[x];
			}
		}
		return temp;
	}

	private static String[] truncateArray(String[] allWords, int wordCount) {
		String[] temp = new String[wordCount];
		
		for(int x=0;x<temp.length;x++) {
			temp[x]=allWords[x];
		}
		
		return temp;
	}

}
