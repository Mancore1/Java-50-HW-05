package telran.homework.util.tests;

import static org.junit.jupiter.api.Assertions.*;
import static telran.homework.util.Arrays.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class ArraysTest {

	@Test
	void evenOddCompatator() {
		Integer[] array = { 5, 4, 10, 1, 3, 7, 12 };
		Integer[] expected = { 4, 10, 12, 7, 5, 3, 1 };
		Arrays.sort(array, new EvenOddComparator());
		assertArrayEquals(expected, array);
	}

	@Test
	void bubbleSortComparatorTest() {
		Integer[] expected = { 10, 100, 200, 5, -5 };
		Integer[] array = { 10, 5, -5, 100, 200 };
		bubbleSort(array, new EvenOddComparator());
		assertArrayEquals(expected, array);
	}

}
