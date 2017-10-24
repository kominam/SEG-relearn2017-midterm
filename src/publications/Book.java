package publications;

import utils.*;


/**
 * Represents Book
 * 
 * @author Kominam
 *
 */

public class Book extends Publication {
	@DomainConstraint(type = "Integer", optional = false, mutable = true, min = 1)
	private int edition;

	public Book(String title, double weight, int e) throws NotPossibleException {
		super(title, weight);
		if (validateEdition(e)) {
			this.edition = e;
		} else throw new NotPossibleException("Book.init: Invalid arguments");
	}

	public int getEdition() {
		return edition;
	}

	public void setEdition(int edition) throws NotPossibleException {
		if (validateEdition(edition)) {
			this.edition = edition;
		} else
			throw new NotPossibleException("Book.setEdition: Invalid " + edition);
	}

	// validations
	private boolean validateEdition(int e) {
		if (e < 1)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [" + super.getTitle() + "," + "," + super.getWeight() + "," + this.edition
				+ "]";
	}

	@Override
	public boolean repOK() {
		return super.repOK() && validateEdition(edition);
	}

}
