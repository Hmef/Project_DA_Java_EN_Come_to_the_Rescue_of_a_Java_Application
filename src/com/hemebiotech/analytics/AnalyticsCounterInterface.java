package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public interface AnalyticsCounterInterface{
	
	
	/**
	 * calculNbrOccur() in the order to calculate the number of the symptoms call the
	 * method getSymtoms to retrieve the list of symptoms set as a key the symptom
	 * and the number as a value in the map
	 * 
	 * @param List contain the symptoms read from the file
	 * @return this method return a map 
	 * 
	 */

	public Map<String, Integer> calculNbrOccur(List<String> symptomfromlist);

}
