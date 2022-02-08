package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter implements AnalyticsCounterInterface{
	
	
	
	/**
	 * calculNbrOccur() in the order to calculate the number of the symptoms call the
	 * method getSymtoms to retrieve the list of symptoms set as a key the symptom
	 * and the number as a value in the map
	 * 
	 * @param List contain the symptoms read from the file
	 * @return this method return a map 
	 * 
	 */

	@Override
	public Map<String, Integer> calculNbrOccur(List<String> symptomfromlist) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (String symptom : symptomfromlist) {
			Integer number = map.get(symptom);

			if (number == null) {
				number = 0;
			}
			number++;
			map.put(symptom, number);

		}
		return map;

	}
	
	
	/**
	 * mapSorting() is sorting the key of the map using TreeMap
	 * @param is the map that contain symptoms as key and the numbers of occurrence as a value of this key
	 * @return the sorted  map 
	 */

	@Override
	public Map<String, Integer> mapSorting(Map<String, Integer> map) {

		Map<String, Integer> sortedMap = new TreeMap<String, Integer>(map);
		
		return sortedMap;

	}
	
	
}
