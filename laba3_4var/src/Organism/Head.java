package Organism;
import java.util.ArrayList;
import java.util.List;
/**
 * <h1>Head</h1>
 * The class of the Head ñontains a list of  head organs
 * and is used to refer to the relevant organs
 */
public class Head  {
	private  List<HeadOrgan> headOrgans ;
	
	public Head(Mouth mouth, Nose nose, Brain brain,Ear ear) 
		 throws NullPointerException {
		        if (mouth == null) {
		            throw new NullPointerException("The value of mout param can not be null!");
		        }
		        if (nose == null) {
		            throw new NullPointerException("The value of nose param can not be null!");
		        }
		        if (brain == null) {
		            throw new NullPointerException("The value of brain param can not be null!");
		        }
		        if (ear == null) {
		            throw new NullPointerException("The value of ear param can not be null!");
		        }
		      
		        this.headOrgans = new ArrayList<HeadOrgan>();
		        headOrgans.add(mouth);
		        headOrgans.add(nose);
		        headOrgans.add(brain);
		        headOrgans.add(ear);
		    }

		    public List<HeadOrgan> getHead() {
		        return headOrgans;
		    }   
	}