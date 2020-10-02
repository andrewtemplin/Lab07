/*
 * Created on: Oct 1, 2020
 * 
 * ULID: ajtempl
 * Class: IT 168
 */
package edu.ilstu;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Andrew Templin
 *
 */
public class ExamCalculations
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		int score = 0;
		int count = 0;
		double sum = 0;
		int numOfA = 0;
		int minScore = 101;
		int maxScore = -1;
		double avgScore = 0;

		System.out.println("Enter exam scores in the range of 0-100 (-1 to exit): ");

		while (score != -1)
		{
		
			score = scan.nextInt();

			if (score >= 0 && score <= 100)
			{
				sum += score;
				count++;
			}
			if (score < 0 && score < -1 || score > 100)
			{
				System.out.println("Invalid input");
			}

			if (score > maxScore && score <= 100)
			{
				maxScore = score;
			}
			if (score < minScore && score >= 0 )
			{
				minScore = score;
			}

			if (score >= 90 && score <= 100)
			{
				numOfA++;
			}

		}

		avgScore = sum / count;
		System.out.println("Number of students who took the exam: " + count);
		System.out.println("Minimum score: " + minScore);
		System.out.println("Maximum score: " + maxScore);
		System.out.println("Average score: " + avgScore);
		System.out.println("Number of 'A's: " + numOfA);
	}

}
