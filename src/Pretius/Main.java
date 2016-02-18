package Pretius;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class Main {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = args[0];
		
		countValue(fileName);
		
		
	}
	
	private static int countValue(String fileName) {
		
		CSVReader reader;
		float suma = 0;
		try {
			reader = new CSVReader(new FileReader(fileName), ':');

			String[] line;
			StringConverter sc = new StringConverter();
			int i = 0;
			while ((line = reader.readNext()) != null) {
				i++;
				if (line.length > 1) {
					suma = suma + sc.convertPriceToFloat(line[5]);
				}
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Suma: " + suma);
		return 0;
	}
	
	
}
