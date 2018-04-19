package com.narayana.Hypotonicity;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HypotonicityController {
	@Autowired
	HypotonicityRepository hypotoncityrepository;
	
	protected Logger logger = Logger
			.getLogger(HypotonicityController.class.getName());
	
	@RequestMapping("/hypotonicity/{serumOsmol}")
	public String hypotonicity(@PathVariable("serumOsmol") String serumOsmol) {
		logger.info("accounts-changed byId() invoked: " + serumOsmol);
		String retVal = hypotoncityrepository.gethypotonicity(serumOsmol);
		logger.info("accounts-microservice byId() found: " + retVal);
		return retVal;
	}

}
