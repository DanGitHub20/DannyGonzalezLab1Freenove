/**
 * 
 */
package DannyGonzalezL1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author Dgonz
 *
 */
public class Movement implements SelfCheckCapable {
	
	int Motor;
	int Wheel;
	int Axles;
	int Suspension;
	
	/**
	 * Moves vehicle forward
	 */
	void Forward () {
		
	}
	
	/**
	 * Moves vehicle backwards
	 */
	void Backward () {
		
	}
	
	/**
	 * Moves vehicle left or right
	 */
	void Turning () {
		
	}
	
	/**
	 * Stops vehicle
	 */
	void stop () {
		
	}

	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}
