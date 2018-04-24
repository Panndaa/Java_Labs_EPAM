
package Model;

import Organism.*;
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
	public HeadOrgan organHead;
	public Mouth mouth;
	public Nose nose;
	public Brain brain;
	public Stomach stomach;
	public Body body;
	public Ear ear;
	public Head head;
	public Model() {	 
		organHead= new HeadOrgan(345);
		mouth = new Mouth(345, "XL");
		nose = new Nose(345,"Snub");
		brain = new Brain(345,15);
		stomach=new Stomach(345,25);
		body=new Body(stomach);
		ear=new Ear(345,"Yes");
		head=new Head(mouth, nose,brain,ear);
	}
	public Model(HeadOrgan organHead, Mouth mouth,Nose nose,Brain brain,Stomach stomach,Body body,Ear ear,Head head) 
	throws NullPointerException{	
		this.organHead= organHead;
		this.mouth=mouth;
		this.nose=nose;
		this.brain=brain;
		this.stomach=stomach;
		this.ear=ear;
		this.head=head;
		this.body=body;
	}
}