package com.bayviewglen.dayfour;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class InFixAndPostFix {

	static final String nums = "1234567890";
	static String operator = "()+-*/";
	public static void main(String[] args) throws FileNotFoundException {
		
		TestPostFix("Data/expressions2.dat");
		TestInFix("Data/expressions1.dat");

		
	}
	private static void TestInFix(String Filename) throws FileNotFoundException {
		File f = new File(Filename);
		Scanner in =  new Scanner(f);
		
		while(in.hasNext()) {
			String expression  = in.nextLine();
			evaluateInFix(expression.split(" "));
		}
		
		
	}
	private static void evaluateInFix(String[] stream) {
		Stack<Double> operands = new Stack<Double>();
		Stack<String> operators = new Stack<String>();
		double temp = 0;
		double temp2 = 0;
		for(int i = 0;i<stream.length;i++) {
			if(stream[i].equals("-")) {
				operators.push(stream[i]);
				}else if(stream[i].equals("+")) {
					operators.push(stream[i]);
				}else if(stream[i].equals("*")) {
					operators.push(stream[i]);
				}else if(stream[i].equals("/")){
					operators.push(stream[i]);
				}else if(stream[i].equals("(")) {
					operators.push(stream[i]);
				}else if(stream[i].equals(")")){
					if(operators.peek().equals("(")) {
					operators.pop();
				}
				}else {
					operands.push(parseDouble(stream[i]));
					if(operators.peek().equals("+")) {
						temp=operands.pop()+operands.pop();
						operators.pop();
						operands.push(temp);
					}else if(operators.peek().equals("-")) {
						temp2=operands.pop();
						temp=operands.pop()-temp2;
						operators.pop();
						operands.push(temp);
					}else if(operators.peek().equals("*")) {
						temp=operands.pop()*operands.pop();
						operators.pop();
						operands.push(temp);
					}else if(operators.peek().equals("/")) {
						temp2=operands.pop();
						temp=operands.pop()/temp2;
						operators.pop();
						operands.push(temp);
					}
				}
			
		}
		//TODO FIX THIS
		System.out.println(operands.pop()*operands.pop()+operands.pop());
		
		}
		
	

	private static void TestPostFix(String Filename) throws FileNotFoundException {
		File f = new File(Filename);
		Scanner in =  new Scanner(f);
		
		while(in.hasNext()) {
			String expression  = in.nextLine();
			evaluatePostFix(expression.split(" "));
		}
		
		
	}
	private static void evaluatePostFix(String[] stream) {
		Stack<Double> operands = new Stack<Double>();
		double temp = 0;
		double temp2 = 0;
		for(int j = 0;j<stream.length;j++) {
			if(stream[j].equals("-")) {
			temp2=operands.pop();
			temp =operands.pop()-temp2;
			operands.push(temp);
			}else if(stream[j].equals("+")) {
			temp=operands.pop()+operands.pop();
			operands.push(temp);
			}else if(stream[j].equals("*")) {
				temp = operands.pop()*operands.pop();
				operands.push(temp);
			}else if(stream[j].equals("/")){
				temp2=operands.pop();
				temp=operands.pop()/temp2;
				operands.push(temp);
			}else {
				operands.push(parseDouble(stream[j]));
			}
		}
		System.out.println(operands.peek());
	}
	
	
	private static Double parseDouble(String string) {
		double num = 0;
		num = Double.parseDouble(string);
		return num;
	}

}
