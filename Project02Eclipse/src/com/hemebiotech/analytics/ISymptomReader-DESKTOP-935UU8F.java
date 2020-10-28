package com.hemebiotech.analytics;

import java.util.List;

public interface ISymptomReader {
	/**
	 * Collect symptoms data in a list
	 * @param "symptoms.txt"
	 * @return list of symptoms
	 */
	List<String>getSymptoms(String filepath);
}
	

