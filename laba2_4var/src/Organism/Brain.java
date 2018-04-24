package Organism;

import java.util.ArrayList;
/**
 * <h1>Brain</h1>
 *The class Brain controls the methods of other classes and takes their values
 */
public class Brain extends Organ {
	private int åfficiency;
	private ArrayList<String> list = new ArrayList<String>();
	
	public Brain(int weight,int åfficiency) {
		super(weight);
		this.åfficiency=åfficiency;
	}
	public int getEfficiency() {
		return this.åfficiency;
	}
	/**
	*Method governOrgans calls methods of classes of mouth and nose
	 */
	public void governOrgans(Mouth mouth, Nose nose) {
		nose.sniff(this);
		nose.scratch(this);
		mouth.eat(this);
		mouth.say(this);
	}
	/**
	* Method getDataOrgans receives a string from the methods of the Nose and Mouth classes
	*and writes this string to the list
	*/
	public void getDataOrgans(String data) {
		list.add(data);
	}
	/**
	 *Method GetDataList  gets the 0 element of the list and then deletes it. 
	 *We use it to make the GUI infer our result was easier
	 *@return 0 element
	*/	
	public String getDataList() {
		 String arr = list.get(0);
	     list.remove(0);
	      return arr;
	}

}