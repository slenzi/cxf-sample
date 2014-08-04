/**
 * 
 */
package org.lenzi.service.cxf.jaxrs;

import org.lenzi.model.Sample;
import org.lenzi.service.cxf.jaxrs.exception.ServiceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sal
 * 
 * Spring managed JAX-RS resource.
 */
@Service("SampleRestService")
public class SampleRestImpl implements SampleRest {

	private Logger logger = LoggerFactory.getLogger(SampleRestImpl.class);
	
	@Autowired
	Sample sample = null;	
	
	public SampleRestImpl() {
		logger.debug(SampleRestImpl.class.getName() + " instance created");
		logger.debug("Have sample bean: " + ((sample != null) ? true : false));
	}

	@Override
	public String getHello() {
		logger.debug(SampleRestImpl.class.getName() + " getHello called");
		return sample.hello();
	}

	@Override
	public String getSampleCount() {
		logger.debug(SampleRestImpl.class.getName() + " getSampleCount called");
		return String.valueOf(sample.getSamples().size());
	}

	@Override
	public String getSample(String id) {
		logger.debug(SampleRestImpl.class.getName() + " getSample called");
		return sample.getSample(id);
	}

	@Override
	public String testException(int input) throws ServiceException {
		logger.debug(SampleRestImpl.class.getName() + " testException called");
		if(input > 10){
			throw new ServiceException("You passed a value greater than 10! Here is your exception message.");
		}
		return "To test exception throwing pass a value greater than 10";
	}

}
