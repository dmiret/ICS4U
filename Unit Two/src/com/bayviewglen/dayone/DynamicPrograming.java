package com.bayviewglen.dayone;


public class DynamicPrograming {

	public static void main(String[] args) {
	
		int solveNumber = 46;
		 int[] soloutions = new int[solveNumber+1];
		
		System.out.println(fib(solveNumber,soloutions));

		int[] altsoloutions = new int[solveNumber+1];
		
		System.out.println(fibAlt(solveNumber,altsoloutions));
		
		System.out.println(basefib(solveNumber));
		
	}

	private static int basefib(int solveNumber) {
		if(solveNumber==1||solveNumber==0)
			return 1;
		else
		return basefib(solveNumber-1)+basefib(solveNumber-2);
	}

	//Solves all possible solutions then answers question
	private static int fibAlt(int solveNumber, int[] altsoloutions) {
		
		altsoloutions[1]=1;
		altsoloutions[2]=1;
		
		for(int i =3;i<=solveNumber;i++) {
			altsoloutions[i]=altsoloutions[i-1]+altsoloutions[i-2];
		}
		return altsoloutions[solveNumber];
	}

	//Solve all problems as they come up and then stores them
	private static int fib(int solveNumber, int[] soloutions) {
		
		int n = solveNumber;
		if(n==1||n==2)
			return 1;
		else if(soloutions[n]!=0)
			return soloutions[n];
		else {
			soloutions[n]=fib(n-2,soloutions)+fib(n-1,soloutions);
			return soloutions[n];
		}
	}

}
