import java.util.Enumeration;

import gnu.io.CommPortIdentifier; 
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;

import java.io.*;


public class TestAffichagePort 
{
	public static void main(String[] args) throws InterruptedException 
	{
		/*Enumeration ports = CommPortIdentifier.getPortIdentifiers();
		int i = 1;
		while (ports.hasMoreElements())
		{
			CommPortIdentifier port = (CommPortIdentifier) ports.nextElement();
			System.out.println("Port n°"+i++);
			System.out.println("\tNom\t:\t"+port.getName());
			String type = null;
			if (port.getPortType() == CommPortIdentifier.PORT_SERIAL) type = "Serie";
			else type = "Parallèle";
			System.out.println("\tType\t:\t"+type);
			String etat = null;
			if (port.isCurrentlyOwned()) etat = "Possédé par "+port.getCurrentOwner();
			else etat = "Libre";
			System.out.println("\tEtat\t:\t"+etat+"\n");
		}
		System.out.println("H");
		EnvoiChaineCaractere.envoi(args[0], "H");
		Thread.sleep(1000);
		EnvoiChaineCaractere.envoi(args[0], "H");
		Thread.sleep(1000);
		EnvoiChaineCaractere.envoi(args[0], "D,500,500");
		Thread.sleep(10000);
		EnvoiChaineCaractere.envoi(args[0], "S");*/
		
		//RecevoirChaineDeCaractère.recevoir(args[0]);
		
		
	
	}	
}
