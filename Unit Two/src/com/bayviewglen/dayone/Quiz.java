package com.bayviewglen.dayone;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) throws FileNotFoundException {
		
        Scanner input = new Scanner(System.in);
        input = new Scanner(new File("Data/Number Source"));
        int starting = 0;
        int [] separated = new int[3];
        int result = 0;
       
        starting = input.nextInt();
        separated = new int[3];
        for(int i = 0;i<separated.length;i++) {
        	separated[i]=input.nextInt();
        }
        
       result = findSmall(starting,separated);
       
      
}

	private static int findSmall(int starting, int[] separated) {
		int[]result = new int[starting];
		String[]answer = new String[starting];
		
		result[0]=0;
		answer[0]="no steps taken";
	
		for(int i = 1;i<result.length;i++) {
		if(starting==1) {
			return result[0];
		}else if(i%separated[0]==0) {
				result[i]=findSmall(i/separated[0],separated)+1;
				answer[i]= "divide by "+separated[0];
			}else if(i%separated[1]==0) {
				result[i]=findSmall(i/separated[1],separated)+1;
				answer[i]= "divide by "+separated[1];
		}else if(i%separated[2]==0) {
			result[i]=findSmall(i/separated[1],separated)+1;
			answer[i]= "divide by "+separated[1];
		}else {
			result[i] = findSmall(result[i-1],separated)+1;
			}
		}
		return result[starting];
	}
}
