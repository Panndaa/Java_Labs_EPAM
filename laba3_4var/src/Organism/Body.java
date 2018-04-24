package Organism;

import java.util.ArrayList;
import java.util.List;
/**
 * <h1>Body</h1>
 * The class of the Body ñontains a list of  body organs
 * and is used to refer to the relevant organs
 */
public class Body {
private  List<BodyOrgan> bodyOrgans ;
	
	public Body(Stomach stomach) throws NullPointerException {
		if (stomach == null) {
		    throw new NullPointerException("The value of mout param can not be null!");
		}   
		this.bodyOrgans = new ArrayList<BodyOrgan>();
		bodyOrgans.add(stomach);
		        
	}

	public List<BodyOrgan> getBody() {
		return bodyOrgans;
	}   
}

