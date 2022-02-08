package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter implements AnalyticsCounterInterface{
	
	private File file = new File("file/result.out");
	
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
	
	/**
	 * generateResultFile() as indicate name of the method it's generate the new
	 * result file "result.out" 
	 * if it's exist, write inside the file
	 * if not create a new file 
	 * 
	 * @param the sorted map 
	 */


	@Override
	public void generateResultFile(Map<String, Integer> sortedMap) {

		
		if (!file.exists()) {

			try {
				file.createNewFile();
				System.out.println(" Create a new file ");

			} catch (IOException e) {

				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println(" Error with file creation ");
			}
		}

		try {

			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);

			System.out.println(" Write inside the file ");
			bw.newLine();
			bw.newLine();
			bw.write(" Symptoms List :");
			bw.newLine();
			bw.newLine();


			for (String key : sortedMap.keySet()) {
				Integer nombre = sortedMap.get(key);
				bw.write("  ");
				bw.write(key);
				bw.write(" = ");
				bw.write(nombre.toString());
				bw.newLine();
			} // End for
			bw.close();
			writer.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
	
	
}
