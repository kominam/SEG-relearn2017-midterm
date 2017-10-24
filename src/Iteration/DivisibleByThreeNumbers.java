package Iteration;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @overview Generates a natural sequence of non-negative numbers up to a
 *           maximum value that are divisible by 3.
 */
public class DivisibleByThreeNumbers {
	private int m;

	/**
	 * @requires m >= 0
	 * @effects initialise this with maximum number m
	 */
	public DivisibleByThreeNumbers(int m) {
		if (m > 0) {
			this.m = m;
		} else
			throw new NoSuchElementException("Invalid arguments.");
	}

	/**
	 * @effects Return a natural sequence of non-negative even numbers up to the
	 *          specified maximum number that are divisible by 3.
	 */
	public Iterator iterator() {
		return new DivisibleByThreeNumberGen();
	}

	// generator class
	private class DivisibleByThreeNumberGen implements Iterator {
		private int index = 0;

		/**
		 * @effects return true if exists next number that is divisible by 3
		 */
		@Override
		public boolean hasNext() {
			return (index < m);
		}

		/**
		 * @effects if hasNext() = false throw NoSuchElementException else
		 *          return the next number in the sequence that is divisible by
		 *          3
		 */
		@Override
		public Object next() throws NoSuchElementException {
			if (hasNext()) {
				while (true) {
					if (index % 3 == 0) {
						Object next = new Integer(index);
						index++;
						return next;
					}
					index++;
				}
			}
			throw new NoSuchElementException();
		}

		@Override
		public void remove() {
			// ignore this method
		}
	} // end DivisibleByThreeNumberGen
} // end DivisibleByThreeNumbers
