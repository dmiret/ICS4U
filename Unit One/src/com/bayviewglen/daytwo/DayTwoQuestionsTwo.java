package com.bayviewglen.daytwo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwoQuestionsTwo {

	public static void main(String[] args) throws FileNotFoundException {
		// Closest Point Problem
		Scanner reader = new Scanner(new File("Data/Points.dat"));
		double [][] points = new double[8][2];
		
		for(int i = 0;i<points.length;i++) {
			for(int j = 0;j<points[i].length;j++) {
				points[i][j]=reader.nextDouble();
			}
		}

		comparepoints(points);
	}

	private static void comparepoints(double[][] points) {
		double x = 0;
		double y = 0;
		int j = 0;
		double [][] temp = new double[points.length][2];
		for(int i = 0;i<points.length;i++) {
				x=points[i][j]+points[i+1][j];
				y=points[i][j+1]+points[i+1][j+1];
			temp[i][j]=x;
			temp[i][j+1]=y;
				}
		x=0;
		y=0;
			
		}
		
	}


