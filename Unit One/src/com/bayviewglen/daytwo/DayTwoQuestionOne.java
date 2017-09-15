package com.bayviewglen.daytwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwoQuestionOne {

	public static void main(String[] args) throws FileNotFoundException {
		//Multiple choice test
		Scanner studentAnswers = new Scanner(new File("Data/studentAnswer.dat"));
		String Student1=studentAnswers.nextLine();
		String Student2=studentAnswers.nextLine();
		String Student3=studentAnswers.nextLine();
		String Student4=studentAnswers.nextLine();
		String Student5=studentAnswers.nextLine();
		String Student6=studentAnswers.nextLine();
		String Student7=studentAnswers.nextLine();
		String Student8=studentAnswers.nextLine();
				
		String[][] AllStudentAnswers = StudentArrays(Student1,Student2,Student3,Student4,Student5,Student6,Student7,Student8);
		int[] StudentMarks=compareArrays(AllStudentAnswers);
		
	print(StudentMarks);
		
		
	}

	private static void print(int[] studentMarks) {
		System.out.println("Here are the marks:");
		for(int i=0;i<studentMarks.length;i++) {
			System.out.println("Student "+i+":"+studentMarks[i]);
		}
	}

	private static int[] compareArrays(String[][] allStudentAnswers) {
		String[] Answers = {"D","B","D","C","C","D","A","E","A","D"};
		int[] StudentCorrect =new int[8];
		int numCorrect = 0;
		for(int i = 0;i<allStudentAnswers.length;i++) {
			for(int j = 0;j<allStudentAnswers[i].length;j++) {
				if(allStudentAnswers[i][j].compareTo(Answers[j])==0) {
					StudentCorrect[i]=numCorrect++;
				}
				StudentCorrect[i]++;
			}
			numCorrect=0;
		}
		return StudentCorrect;
	}

	private static String[][] StudentArrays(String student1, String student2, String student3, String student4, String student5, String student6, String student7, String student8) {
		String[][] Collection = new String[8][10];
		
			Collection[0] = student1.split(",");
			Collection[1] = student2.split(",");
			Collection[2] = student3.split(",");
			Collection[3] = student4.split(",");
			Collection[4] = student5.split(",");
			Collection[5] = student6.split(",");
			Collection[6] = student7.split(",");
			Collection[7] = student8.split(",");
		
		return Collection;
		
	}

}
