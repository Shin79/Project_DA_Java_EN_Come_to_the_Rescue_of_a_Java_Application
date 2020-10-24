package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * 	Interface which allows processing from a file
 */

public interface ISymptomReader {
	
	/**
	 * add symptoms in a list from a file
	 * @param file with symptoms
	 *
	 * @return list of symptoms
	 */
	List<String> getSymptoms(String fileName);

	/**
	 * count occurences of symptoms from a list of symptoms
	 *
	 * @param list of symptoms
	 * 
	 * @return map of iteration of symptoms with their occurences
	 */
	public Map<String, Integer> getSymptomsWithOccurences(List<String> symptoms);


	/**
	 * write a new file from a map of symptoms
	 *
	 * @param map with symptoms and their occurences
	 * 
	 * @return file with number of iteration of each symptoms from the map
	 */
	void writeSymptomsAndOccurences(Map<String, Integer> mapSymptomsOccurences) throws IOException;
}
