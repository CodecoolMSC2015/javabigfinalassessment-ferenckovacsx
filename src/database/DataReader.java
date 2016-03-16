package database;

import server.SearchType;

abstract class DataReader
{
	String searchCriteria;
	SearchType searchType;

	void getPersons()
	{
		
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