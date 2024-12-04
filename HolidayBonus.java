/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: This class has methods that calculate the holiday bonuses for the stores.
 * Due: 12/3/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Nicholas Kim
*/

public class HolidayBonus {

	public static final double HIGHEST_SALES = 5000.0;
	public static final double LOWEST_SALES = 1000.0;
	public static final double OTHER_SALES = 2000.0;
	
	public static double[] calculateHolidayBonus(double[][] raggedArray) {
		
		double[] holidayBonuses = new double[raggedArray.length];
		
		for(int row = 0; row < raggedArray.length; row++) {
			
			for(int col = 0; col < raggedArray[row].length; col++) {
				
				if(raggedArray[row][col] < 0) {
					
					holidayBonuses[row] += 0;
					
				}
				else if(TwoDimRaggedArrayUtility.getHighestInColumnIndex(raggedArray, col) == row) {
					
					holidayBonuses[row] += HIGHEST_SALES;
					
				}
				else if(TwoDimRaggedArrayUtility.getLowestInColumnIndex(raggedArray, col) == row) {
					
					holidayBonuses[row] += LOWEST_SALES;
					
				}
				else {
					
					holidayBonuses[row] += OTHER_SALES;
					
				}
				
			}
			
		}
		
		return holidayBonuses;
	}
	
	public static double calculateTotalHolidayBonus(double[][] raggedArray) {
		
		double[] bonuses = calculateHolidayBonus(raggedArray);
		double total = 0;
		
		for(int i = 0; i < bonuses.length; i++) {
			
			total += bonuses[i];
			
		}
		
		return total;
		
	}
	
}
