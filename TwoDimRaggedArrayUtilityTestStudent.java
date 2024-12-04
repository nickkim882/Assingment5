/*
 * Class: CMSC203 
 * Instructor:Khandan Monshi
 * Description: This is a Junit test that test the methods in the TwoDimRaggedArrayUtility class
 * Due: 12/3/2024
 * Platform/compiler:Eclipse
 * I pledge that I have completed the programming assignment independently.
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Nicholas Kim
*/

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoDimRaggedArrayUtilityTestStudent {

	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8}};
	private double[][] dataSet2 = {{7,2,9,4},{5},{8,1,3},{11,6,7,2}};
	private double[][] dataSet3;
	private File dataSet = new File("dataSet2.txt");
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testReadFile() {
		dataSet3 = TwoDimRaggedArrayUtility.readFile(dataSet);
		assertEquals(dataSet2, dataSet3);
	}

	@Test
	void testWriteToFile() {
		
	}

	@Test
	void testGetTotal() {
		assertEquals(36.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), 0.001);
		assertEquals(65.0, TwoDimRaggedArrayUtility.getTotal(dataSet1), 0.001);
	}

	@Test
	void testGetAverage() {
		assertEquals(36.0 / 8, TwoDimRaggedArrayUtility.getAverage(dataSet1), 0.001);
        assertEquals(65.0 / 12, TwoDimRaggedArrayUtility.getAverage(dataSet2), 0.001);
	}

	@Test
	void testGetRowTotal() {
		assertEquals(6.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 0), 0.001);
        assertEquals(9.0, TwoDimRaggedArrayUtility.getRowTotal(dataSet1, 1), 0.001);
	}

	@Test
	void testGetColumnTotal() {
		assertEquals(11.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 0), 0.001);
        assertEquals(9.0, TwoDimRaggedArrayUtility.getColumnTotal(dataSet1, 1), 0.001);
	}

	@Test
	void testGetHighestInRow() {
		assertEquals(3.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 0), 0.001);
        assertEquals(5.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 1), 0.001);
	}

	@Test
	void testGetHighestInRowIndex() {
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 0));
        assertEquals(1, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 1));
	}

	@Test
	void testGetLowestInRow() {
		assertEquals(4.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 1), 0.001);
        assertEquals(6.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 2), 0.001);
	}

	@Test
	void testGetLowestInRowIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 1));
	}

	@Test
	void testGetHighestInColumn() {
		assertEquals(7.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 1), 0.001);
        assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 2), 0.001);
	}

	@Test
	void testGetHighestInColumnIndex() {
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 0));
        assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 1));
	}

	@Test
	void testGetLowestInColumn() {
		assertEquals(2.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 1), 0.001);
        assertEquals(3.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 2), 0.001);
	}

	@Test
	void testGetLowestInColumnIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 0));
        assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 1));
	}

	@Test
	void testGetHighestInArray() {
		assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), 0.001);
	}

	@Test
	void testGetLowestInArray() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), 0.001);
	}

}
