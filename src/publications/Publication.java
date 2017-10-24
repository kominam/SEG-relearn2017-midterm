package publications;

import utils.DomainConstraint;
import utils.NotPossibleException;

/**
 * Represents Publication
 * 
 * @author Kominam
 *
 */

public abstract class Publication {
	@DomainConstraint(type = "String", optional = false, mutable = true)
	private String title;
	@DomainConstraint(type = "Double", optional = false, mutable = true, min = 0.01)
	private double weight;

	// constructor
	public Publication(String title, double weight) throws NotPossibleException {
		if (isValidate(title, weight)) {
			this.title = title;
			this.weight = weight;
		} else
			throw new NotPossibleException("Validations failed: Invalid publication.");
	}

	// setters and getters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws NotPossibleException {
		if (validateTittle(title)) {
			this.title = title;
		} else
			throw new NotPossibleException("Publication.setTitle: Invalid " + title);
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) throws NotPossibleException {
		if (validateWeight(weight)) {
			this.weight = weight;
		} else
			throw new NotPossibleException("Publication.setWeight: Invalid " + weight);
	}

	// validators
	private boolean isValidate(String t, double w) {
		return validateTittle(t) && validateWeight(w);
	}

	private boolean validateTittle(String t) {
		if (t == null)
			return false;
		return true;
	}

	private boolean validateWeight(double w) {
		if (w < 0.01)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Publication [title=" + title + ", weight=" + weight + "]";
	}

	// repOK method
	public boolean repOK() {
		return isValidate(title, weight);
	}
}
