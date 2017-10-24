package publications;

import utils.NotPossibleException;


/**
 * Represents Journal
 * 
 * @author Kominam
 *
 */

public class Journal extends Publication {
	public Journal(String title, double weight) throws NotPossibleException {
		super(title, weight);
	}

	@Override
	public String toString() {
		return "Journal [Title: " + getTitle() + ", Weight: " + getWeight() + "]";
	}

	@Override
	public boolean repOK() {
		return super.repOK();
	}
}
