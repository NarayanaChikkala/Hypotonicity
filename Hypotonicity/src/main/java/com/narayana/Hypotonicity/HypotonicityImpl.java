package com.narayana.Hypotonicity;

import java.util.logging.Logger;

import org.springframework.stereotype.Repository;

@Repository
public class HypotonicityImpl implements HypotonictyRepository {
	protected Logger logger = Logger
			.getLogger(HypotonicityImpl.class.getName());

	

	@Override
	public String gethypotonicity(String serumOsmol) {
		// TODO Auto-generated method stub
		if(Integer.parseInt(serumOsmol)>=295) {
			return "hypotonic";			
		}
		else {
			return "notHypotonic";
		}
	}

}
