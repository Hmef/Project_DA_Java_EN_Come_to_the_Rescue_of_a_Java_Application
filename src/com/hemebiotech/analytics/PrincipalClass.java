package com.hemebiotech.analytics;

import java.util.Map;

public class PrincipalClass {
	
	
public static void main(String[] args) {
		
		
		String symptomfile = "symptoms.txt";
		 
		 SymptomList symptomlist = new SymptomList(symptomfile);
		 
		 AnalyticsCounter analyticscounter = new AnalyticsCounter();
		 
		 analyticscounter.calculNbrOccur(symptomlist.getSymptoms());
		 
		 Map<String, Integer> map = analyticscounter.calculNbrOccur(symptomlist.getSymptoms());
		 
		 Map<String, Integer> sortedmap = analyticscounter.mapSorting(map);
		 
		 analyticscounter.generateResultFile(sortedmap);
		
		 
		 
		 
		 
	}

}
