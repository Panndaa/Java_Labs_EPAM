package Organism;

/**
 * <h1>HeadOrgan</h1>
 * The class of the HeadOrgan ñontains a list of AbstractOrgan
 *base class for communication between class AbstractOrgan and head classes
 */

public class HeadOrgan  extends AbstractOrgan  {
	 public HeadOrgan(int weight) throws IllegalArgumentException {
		super(weight);
	}
}