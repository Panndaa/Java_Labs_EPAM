package Organism;
/**
 * <h1>Nose</h1>
 * The class of the nose extends to class an organ. 
 * It hides enum and methods that return a string from enum
 *
 */
public class Nose extends Organ {
	private String shape;
	public enum Smell{
		FLOWER("Flowers"),
		MEAT("Meat"),
		SEA("Sea"),
		FOREST("Forest"),
		COFFEE("Coffee"),
		BAKERY ("Bakery"),
		PAPER ("Paper"),
		ORANGE ("Orange"),
		FISH ("Fish"),
		NOTHING ("Nothing"); 
		
		private final String claim;
		Smell(String claim) {
			this.claim = claim;
	    }
		
		public String getClaim() { 
			return claim;
		}
	}
	
	public enum Scratch{
		YES("My nose scratch "),
		NO("Nothing");
		
		private final String anwser;
		Scratch(String anwser) {
			this.anwser = anwser;
	    }
		
		public String getAnwser() { 
			return anwser;
		}
	}
	
	public Nose (int weight,String shape) {
		super(weight);
		this.shape=shape;
	}
	
	public String getShape() {
		return this.shape;
	}
/**
*The method sniff and method scratch chooses a random value from their enum  
*and return it to the brain method getDataOrgans
*/
	public void sniff(Brain brain) {
		int num=10;
		int id = (int) (Math.random()*num);
		Smell smell =Smell.values()[id];
		brain.getDataOrgans(smell.getClaim());
	}
	
	public void scratch(Brain brain) {
		int num=2;
		int id = (int) (Math.random()*num);
		Scratch feeling  =Scratch.values()[id];
		brain.getDataOrgans(feeling.getAnwser());
	}
}