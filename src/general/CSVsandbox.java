package general;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVsandbox
{

	public static void main(String[] arg) throws Exception
	{

		BufferedReader CSVFile = new BufferedReader(new FileReader("Documentation/persons.csv"));

		String row = CSVFile.readLine();

		while (row != null)
		{
			String[] dataArray = row.split(",");
			for (String item : dataArray)
			{
				System.out.print(item + "\t");
			}
			System.out.println();
			row = CSVFile.readLine();
		}

		CSVFile.close();

		System.out.println();

	}
}
