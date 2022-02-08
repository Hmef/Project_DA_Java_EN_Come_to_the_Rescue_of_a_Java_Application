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
	
	

	/**
	 * mapSorting() is sorting the key of the map using TreeMap
	 * @param is the map that contain symptoms as key and the numbers of occurrence as a value of this key
	 * @return the sorted  map 
	 */

	public Map<String, Integer> mapSorting(Map<String, Integer> map);
	

	/**
	 * generateResultFile() as indicate name of the method it's generate the new
	 * result file "result.out" 
	 * if it's exist, write inside the file
	 * if not create a new file 
	 * 
	 * @param the sorted map 
	 */

	public void generateResultFile(Map<String, Integer> sortedMap);
	

}
