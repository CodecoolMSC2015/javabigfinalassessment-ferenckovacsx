//the purpose of this class is to be able to send two objects via the socket (searchtype and criteria)

package server;

import java.io.Serializable;

public class SocketObject implements Serializable
{

	private static final long serialVersionUID = 1L;
	String skillset;
	String searchtype;

	public SocketObject(String skillset, String searchtype)
	{
		this.skillset = skillset;
		this.searchtype = searchtype;
	}
}
