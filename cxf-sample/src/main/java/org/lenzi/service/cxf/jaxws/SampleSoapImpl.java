/**
 * 
 */
package org.lenzi.service.cxf.jaxws;

import javax.jws.WebService;

import org.lenzi.model.Sample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author sal
 *
 */
@WebService(endpointInterface = "org.lenzi.service.cxf.jaxws.SampleSoap")
public class SampleSoapImpl implements SampleSoap {

	private Logger logger = LoggerFactory.getLogger(SampleSoapImpl.class);
	
	@Autowired
	Sample sample = null;	
	
	/**
	 * 
	 */
	public SampleSoapImpl() {
		logger.debug(SampleSoapImpl.class.getName() + " instance created");
		logger.debug("Have sample bean: " + ((sample != null) ? true : false));
	}

	/* (non-Javadoc)
	 * @see org.lenzi.service.cxf.jaxws.SampleSoap#getHello()
	 */
	@Override
	public String getHello() {
		logger.debug(SampleSoapImpl.class.getName() + " getHello called");
		return sample.hello();
	}

}
