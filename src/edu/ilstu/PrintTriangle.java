/*
 * Created on: Oct 1, 2020
 * 
 * ULID: ajtempl
 * Class: IT 168
 */
package edu.ilstu;

import java.util.Scanner;

/**
 * <insert class description here>
 *
 * @author Andrew Templin
 *
 */
public class PrintTriangle
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int rows;

		System.out.println("Please enter integer between 3 and 40: ");
		rows = scan.nextInt();
		if (rows > 40 || rows < 3) {
			System.out.println("Invalid input, cannot create triangle");
		}else
		{
			for (int x = 0; x < rows; x++)
			{
				for (int y = 0; y <= x; y++)
				{
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
	}

}
