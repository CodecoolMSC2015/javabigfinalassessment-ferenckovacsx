package server;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonStoreServerSocket
{
	public static void initServer()
	{
		ServerSocket serverSocket = null;
		try
		{
			serverSocket = new ServerSocket(8888);
			System.out.println("Server Waiting...");
			Socket clientSocket = serverSocket.accept();
			System.out.println("Client is connected!");
			ObjectInputStream serverInputStream = new ObjectInputStream(clientSocket.getInputStream());
			ObjectOutputStream serverOutputStream = new ObjectOutputStream(clientSocket.getOutputStream());

			FileOutputStream fos = new FileOutputStream("sample.ser", true);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			while (true)
			{
				if (serverInputStream.read() > -1)
				{
					SocketObject receivedObject = (SocketObject)serverInputStream.readObject();
					String socketObjectSkills = receivedObject.skillset;
					Object socketObjectSearchType = receivedObject.searchtype;
					List<String> listOfSkills = new ArrayList<>(Arrays.asList(socketObjectSkills.split(" , ")));
					if (socketObjectSearchType == SearchType.MANDATORY)
					{
						
						/*
						Get suitable persons by skillset and MANDATORY searchtype
			
						*/
					} else if (socketObjectSearchType == SearchType.OPTIONAL)
					{
						/*
						Get suitable persons by skillset and OPTIONAL searchtype
			
						*/
					} 
				}
				serverSocket.close();
				clientSocket.close();
			}
		}

		catch (IOException | ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
