package general;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class DataReader
{
	String searchCriteria;
	SearchType searchType;

	public static Set<Person> getPersons()
	{
		Set<Person> setOfPersons = new HashSet<>();
		try
		{
			InputStream input = new FileInputStream("filepath");
			
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return setOfPersons;
		
	}

	public void setSearchCriteria(String searchCriteria)
	{
		this.searchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType)
	{
		this.searchType = searchType;
	}
}