package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
}
