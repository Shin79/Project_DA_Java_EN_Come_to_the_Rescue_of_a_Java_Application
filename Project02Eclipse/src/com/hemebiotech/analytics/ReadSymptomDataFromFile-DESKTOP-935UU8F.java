package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



/**
 * Simple brute force implementation
 * 
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
}
