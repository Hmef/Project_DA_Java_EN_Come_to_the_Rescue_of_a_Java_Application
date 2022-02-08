package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SymptomList implements SymptomListInterface{

	// the path to access into the file "symptoms.txt"
	private String filepath;
	
	/**
	 * Constructor 
	 * @param filepath
	 */
	public SymptomList(String filepath) {
		this.filepath = filepath;
	}

	
	/**
	 * getSymptoms() method 
	 * 
	 * @return return a list of symptoms from the file 
	 * @exception catch the IOException generated and execute the code inside 
	 * 
	 */
	
	@Override
	public List<String> getSymptoms() {

		List<String> symptomsList = new ArrayList<String>();

		try {

			BufferedReader reader = new BufferedReader(new FileReader(filepath));

			String line = reader.readLine();

			while (line != null) {
				symptomsList.add(line);
				line = reader.readLine();

			}

			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			System.out.println(" Error of reading the file symptoms !");
		}

		return symptomsList;
	} 
}