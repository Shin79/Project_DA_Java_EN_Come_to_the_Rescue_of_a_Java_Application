package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {


	@Override
	public List<String> getSymptoms(String fileName) {
		
		List<String> result = new ArrayList<String>();

		if (fileName != null) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader(fileName));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		return result;
	}

	/**
	 * Sort and count occurences of each symptom
	 * @param list of symptoms
	 * @return map of symptoms/occurences
	 */
	public Map<String,Integer>countOccurences(List<String> symptoms){
		
		Map<String,Integer> map = new TreeMap<>();
		
		if (symptoms != null && !symptoms.isEmpty()) {
			Collections.sort(symptoms);
			
			for (String symptom : symptoms) {
				map.put(symptom, map.containsKey(symptom) ? map.get(symptom) + 1 : 1);
			}
		}
		return map;
	}
}

/**
* Write in result.out
* @param map with symptoms
* @return "result.out"
*/
public void writeSymptoms(Map<String,Integer> mapSymptoms) throws IOException{
	
	FileWriter writer = new FileWriter("result.out");
	
	if(mapSymptoms != null &&  !mapSymptoms.isEmpty()) {
		for(Map.Entry<String,Integer> m : mapSymptoms.entrySet()) {
			try {
				writer.write(m.getKey() + " : " + m.getValue() + "\n");
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("exportation terminée");
		writer.close();
	} else {
		writer.write("No symptom");
		writer.close();
	}
}
}
