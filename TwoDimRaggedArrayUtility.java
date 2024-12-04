/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: This program revolves around a two dim ragged array and contains methods that provide certain information about the ragged array and also can read and write from files. 
 * Due: 12/3/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Nicholas Kim
*/
import java.io.*;
import java.util.*;

public class TwoDimRaggedArrayUtility {

		
	public static double[][] readFile(File file) throws FileNotFoundException{
		
		Scanner sc = new Scanner(file);
		int rowCount = 0;
		
		while(sc.hasNextLine()) {
			
			rowCount++;
			
		}
		sc.close();
		
		double[][] raggedArray = new double[rowCount][];
		
		int row = 0;
		sc = new Scanner(file);
		while(sc.hasNextLine()) {
			
			String line = sc.nextLine();
			String[] numbers = line.split(" ");
			for(int col = 0; col < numbers.length; col++) {
				
				raggedArray[row][col] = Double.parseDouble(numbers[col]);
				
			}
			row++;
			
		}
		
		return raggedArray;
	}
	
	public static void writeToFile(double[][] raggedArray, File file) throws FileNotFoundException {
		
		PrintWriter writer = new PrintWriter(file);
		
		for(int row = 0; row < raggedArray.length; row++) {
			
			for(int col = 0; col < raggedArray[row].length; col++) {
				
				writer.print(raggedArray[row][col]);
				
				if(col < raggedArray[row].length - 1) {
					
					writer.print(" ");
					
				}
				
			}
			
		}
		
	}
	
	public static double getTotal(double [][] raggedArray) {
		
		double total = 0;
		
		for(int row = 0; row < raggedArray.length; row++) {
			
			for(int col = 0; col < raggedArray[row].length; col++) {
				
				total += raggedArray[row][col];
				
			}
			
		}
		return total;
		
	}
	
	public static double getAverage(double[][] raggedArray) {
		
		double total = getTotal(raggedArray);
		int numElements = 0;
		
		for(int row = 0; row < raggedArray.length; row++) {
			
			numElements += raggedArray[row].length;;
			
		}
		
		return total/numElements;
		
	}
	
	public static double getRowTotal(double [][] raggedArray, int rowIndex) {
		
		double total = 0;
		
		for(int col = 0; col < raggedArray[rowIndex].length; col++) {
			
			total += raggedArray[rowIndex][col];
			
		}
		
		return total;
			
	}
	
	public static double getColumnTotal(double[][] raggedArray, int columnIndex) {
		
		double total = 0;
		
		for(int row = 0; row < raggedArray.length; row++) {
			
			if(columnIndex < raggedArray[row].length) {
				
				total += raggedArray[row][columnIndex];
				
			}
			
		}
		return total;
		
	}
	
	public static double getHighestInRow(double[][] raggedArray, int rowIndex) {
		
		double highest = raggedArray[rowIndex][0];
		
		for(int col = 1; col < raggedArray[rowIndex].length; col++) {
			
			if(raggedArray[rowIndex][col] > highest) {
				
				highest = raggedArray[rowIndex][col];
				
			}
			
		}
		return highest;
	}
	
	public static int getHighestInRowIndex(double[][] raggedArray, int rowIndex) {
		
		int index = 0;
		double highest = raggedArray[rowIndex][0];
		
		for(int col = 1; col < raggedArray[rowIndex].length; col++) {
			
			if(raggedArray[rowIndex][col] > highest) {
				
				highest = raggedArray[rowIndex][col];
				index = col;
				
			}
			
		}
		
		return index;
		
	}
	
	public static double getLowestInRow(double[][] raggedArray, int rowIndex) {
		
		double lowest = raggedArray[rowIndex][0];
		
		for(int col = 1; col < raggedArray[rowIndex].length; col++) {
			
			if(raggedArray[rowIndex][col] < lowest) {
				
				lowest = raggedArray[rowIndex][col];
				
			}
			
		}
		
		return lowest;
	}
	
	public static int getLowestInRowIndex(double[][] raggedArray, int rowIndex) {
		
		double lowest = raggedArray[rowIndex][0];
		int index = 0;
		
		for(int col = 1; col < raggedArray[rowIndex].length; col++) {
			
			if(raggedArray[rowIndex][col] < lowest) {
				
				lowest = raggedArray[rowIndex][col];
				index = col;
				
			}
			
		}
		
		return index;
	}
	
	public static double getHighestInColumn(double[][] raggedArray, int columnIndex) {
		
		double highest = raggedArray[0][columnIndex];
		
		for(int row = 1; row < raggedArray.length; row++) {
			
			if(columnIndex < raggedArray[row].length && raggedArray[row][columnIndex] > highest) {
				
				highest = raggedArray[row][columnIndex];
				
			}
			
		}
		
		return highest;
		
	}
	
	public static int getHighestInColumnIndex(double[][] raggedArray, int columnIndex) {
		
		double highest = raggedArray[0][columnIndex];
		int index = 0;
		
		for(int row = 1; row < raggedArray.length; row++) {
			
			if(columnIndex < raggedArray[row].length && raggedArray[row][columnIndex] > highest) {
				
				highest = raggedArray[row][columnIndex];
				index = row;
				
			}
			
		}
		
		return index;
		
	}
	
	
	public static double getLowestInColumn(double[][] raggedArray, int columnIndex) {
		
		double lowest = raggedArray[0][columnIndex];

		for(int row = 1; row < raggedArray.length; row++) {
			
			if(columnIndex < raggedArray[row].length && raggedArray[row][columnIndex] < lowest) {
				
				lowest = raggedArray[row][columnIndex];
				
			}
			
		}
		
		return lowest;
	}
	
	public static int getLowestInColumnIndex(double[][] raggedArray, int columnIndex) {
		
		double lowest = raggedArray[0][columnIndex];
		int index = 0;

		for(int row = 1; row < raggedArray.length; row++) {
			
			if(columnIndex < raggedArray[row].length && raggedArray[row][columnIndex] < lowest) {
				
				lowest = raggedArray[row][columnIndex];
				index = row;
				
			}
			
		}
		
		return index;
	}
	
	public static double getHighestInArray(double[][] raggedArray) {
		
		double highest = raggedArray[0][0];
		
		for(int row = 0; row < raggedArray.length; row++) {
			
			for(int col = 0; col < raggedArray[row].length; col++) {
				
				if(raggedArray[row][col] > highest) {
					
					highest = raggedArray[row][col];
					
				}
				
			}
			
		}
		return highest;
		
	}
	
	public static double getLowestInArray(double[][] raggedArray) {
		
		double lowest = raggedArray[0][0];
		
		for(int row = 0; row < raggedArray.length; row++) {
			
			for(int col = 0; col < raggedArray[row].length; col++) {
				
				if(raggedArray[row][col] < lowest) {
					
					lowest = raggedArray[row][col];
					
				}
				
			}
			
		}
		return lowest;
		
	}
}
