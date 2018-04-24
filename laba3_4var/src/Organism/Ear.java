package Organism;
/**
 * <h1>Ear</h1>
 * The class of the Ear extends to class an HeadOrgan . 
 * It hides enum and methods that return a string from enum
 */
public class Ear extends HeadOrgan  {
	public String earring;
	
	public Ear(int weight,String earring ) {
		super(weight);
		this.earring=earring;
	}
	public String getEarring() {
		return this.earring;
	}
	public enum Listen{
		YES("You are listen voice"),
		NO("You aren't listen voice");
		
		private final String sensations;
		
		Listen(String sensations) {
		this.sensations = sensations;
		}
		
		public String getSensations() { 
			return sensations;
		}
	}
	
	public void feel(Brain brain) {
		int id = (int)(Math.random()*2);
		Listen feel=Listen.values()[id];
		brain.getDataOrgans(feel.getSensations());
	}
}
