package Organism;
/**
 * <h1> BodyOrgan </h1>
 * The class of the BodyOrgan  ñontains a list of AbstractOrgan
 *base class for communication between class AbstractOrgan and body classes
 */

 public abstract class BodyOrgan extends AbstractOrgan  {
	 public BodyOrgan(int weight) throws IllegalArgumentException {
		super(weight);
	}
}