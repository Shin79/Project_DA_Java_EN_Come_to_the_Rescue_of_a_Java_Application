package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomsDataOnFile {
		/**
		* Write the count of each symptom in result.out
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
