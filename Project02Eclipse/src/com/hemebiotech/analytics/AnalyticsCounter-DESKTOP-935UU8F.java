package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Main class
 * @author Shin
 *
 */
public class AnalyticsCounter {
	
	
	public static void main(String args[]) throws Exception {
		ReadSymptomDataFromFile read  = new ReadSymptomDataFromFile();
		List<String> symptoms = read.getSymptoms("symptoms.txt");
		
		SortAndCountOccurences sortCount = new SortAndCountOccurences();
		Map<String,Integer> mapSymptoms = sortCount.countOccurences(symptoms);
		
		WriteSymptomsDataOnFile write = new WriteSymptomsDataOnFile();
		write.writeSymptoms(mapSymptoms);
	}
}
