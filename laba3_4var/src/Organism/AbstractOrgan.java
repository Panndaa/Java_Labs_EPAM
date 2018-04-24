package Organism;
/**
 * <h1>AbstractOrgan</h1>
 * The class of the AbstractOrgan connects the organs of the head and body. 
 */
public abstract class AbstractOrgan {
	protected int weight;
	public  AbstractOrgan (int weight) throws IllegalArgumentException{
		if (weight<=0) {
			throw new IllegalArgumentException("The value of organ weight can't be zero or negative!");
		}
		this.weight=weight;
	}
	public int getWeight() {
		return this.weight;
	}
}
