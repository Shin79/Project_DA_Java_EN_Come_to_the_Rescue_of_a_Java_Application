package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class SortAndCountOccurences {
	/**
	 * Sort and count occurences of each symptom
	 * @param list of symptoms
	 * @return map of symptoms/occurences
	 */
	public Map<String,Integer>countOccurences(List<String> symptoms){
		
		Map<String,Integer> map = new TreeMap<>();
		
		if (symptoms != null && !symptoms.isEmpty()) {
			
			for (String symptom : symptoms) {
				map.put(symptom, map.containsKey(symptom) ? map.get(symptom) + 1 : 1);
			}
		}
		return map;
	}
}
