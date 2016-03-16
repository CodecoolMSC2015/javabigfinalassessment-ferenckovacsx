package database;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVDataReader extends DataReader
{
	String csvFilePath;
	List<Person> persons;

	public CSVDataReader() throws IOException
	{
		super();
		BufferedReader CSVFile = new BufferedReader(new FileReader("Documentation/persons.csv"));

		String row = CSVFile.readLine();

		while (row != null)
		{
			String[] parsedData = row.split(",");
			String name = parsedData[0];
			String email = parsedData[1];
			String skill = parsedData[2];
			String skillDescription = parsedData[3];
			String skillRate = parsedData[4];
			String salary = parsedData[5];

			System.out.println(name);
			row = CSVFile.readLine();
		}

		CSVFile.close();
	}

}
