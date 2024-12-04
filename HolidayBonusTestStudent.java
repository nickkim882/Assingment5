/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: This is a Junit test that test the methods from the HolidayBonus class
 * Due: 12/3/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Nicholas Kim
*/
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HolidayBonusTestStudent {

	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8}};
	private double[][] dataSet2 = {{7,2,9,4},{5},{8,1,3},{11,6,7,2}};
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculateHolidayBonus() {
		double [] bonuses = HolidayBonus.calculateHolidayBonus(dataSet1);
		
		assertEquals(3000, bonuses[0]);
		assertEquals(15000, bonuses[2]);
		
	}

	@Test
	void testCalculateTotalHolidayBonus() {
		double total = HolidayBonus.calculateTotalHolidayBonus(dataSet1);
		
		assertEquals(22000, total);
	}

}
