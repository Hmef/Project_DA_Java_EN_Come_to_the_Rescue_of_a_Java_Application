package com.hemebiotech.analytics;

import java.util.List;

public interface SymptomListInterface {
	
	
	/**
	 * getSymptoms() method 
	 * 
	 * @return return a list of symptoms from the file 
	 * @exception catch the IOException generated and execute the code inside 
	 * 
	 */
	
	public List<String> getSymptoms();

}
