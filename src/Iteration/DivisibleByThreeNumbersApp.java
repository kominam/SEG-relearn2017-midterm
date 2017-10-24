package Iteration;

import java.util.Iterator;

public class DivisibleByThreeNumbersApp {
	public static void main(String[] args) {
		DivisibleByThreeNumbers sample = new DivisibleByThreeNumbers(15);
		Iterator it = sample.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}
}
