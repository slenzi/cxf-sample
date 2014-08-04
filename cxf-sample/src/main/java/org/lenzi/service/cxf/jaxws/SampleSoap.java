/**
 * 
 */
package org.lenzi.service.cxf.jaxws;

import javax.jws.WebService;

/**
 * @author sal
 *
 */
@WebService
public interface SampleSoap {

	/**
	 * Fetch hello message
	 * 
	 * @return
	 */
	public String getHello();
	
}
