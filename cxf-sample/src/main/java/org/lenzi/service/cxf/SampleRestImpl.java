/**
 * 
 */
package org.lenzi.service.cxf;

import org.lenzi.model.Sample;
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
		return String.valueOf(sample.getSamples().size());
	}

	@Override
	public String getSample(String id) {
		return sample.getSample(id);
	}

}
