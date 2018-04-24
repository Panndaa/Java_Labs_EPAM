package Organism;
/**
 * <h1>Model</h1>
 * The Model class represents the program data structure, which is being 
 * manipulated by the user with the help of GUI class.
 * <p>
 * The data fields are not sealed in order to ease
 * the manipulation with them, because they either will be changing
 * throughout the program execution.
 * </p>
 */
public class Model {
	public Organ organ;
	public Mouth mouth;
	public Nose nose;
	public Brain brain;
	
	public Model() {	
		organ= new Organ(345); 
		mouth= new Mouth(345, "XL");
		nose= new Nose(345,"Snub");
		brain=new Brain(345,15);
	}
	public Model(Organ organ, Mouth mouth, Nose nose,Brain brain) throws NullPointerException{
		this.organ=organ;
		this.mouth=mouth;
		this.nose=nose;
		this.brain=brain;
	}
}