package com.bayviewglen.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchAndDucking {

	public static void main(String[] args){
		tryCatchMethod();
		//duckingMethod();
		try {
			ThrowingAnExceptionWithPerfectMechanics();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());		
		}

	}

	private static void ThrowingAnExceptionWithPerfectMechanics() throws Exception {
		throw new Exception();
		
	}

	private static void duckingMethod() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("Data/words.dat")); //words.dat
		
	}

	private static void tryCatchMethod() {
		//deal with an exception by trying it
		
		try {
			Scanner scanner = new Scanner(new File("Data/words.dat")); //words.dat
			//do the most specific first (ie. what you want to catch)
		}catch(FileNotFoundException ex) {
			//Catch method keeps it from crashing
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("Finally");
		}
		
	}

}
