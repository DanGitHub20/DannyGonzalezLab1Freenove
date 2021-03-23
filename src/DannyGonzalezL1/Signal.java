/**
 * 
 */
package DannyGonzalezL1;

import edu.fiu.sysdesign.SelfCheckCapable;

/**
 * @author Dgonz
 *
 */
public class Signal implements SelfCheckCapable {

	int Antenna;
	
	/**
	 * Receive instruction signal from Control Input
	 */
	void Receive () {
		
	}
	
	/**
	 * Send instruction to vehicle components information to control input
	 */
	void Send () {
		
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
