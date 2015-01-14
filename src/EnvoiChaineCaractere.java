import java.io.IOException;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;


public class EnvoiChaineCaractere 
{
	public static void envoi(String nomPort, String chaineCarac)
	{
		 // args[0] : nom symbolique du port
		 // args[1] : chaîne à envoyer
		 
		 
		 
		 
		 try 
		 {
			 port.getOutputStream().write((chaineCarac + "\n").getBytes("US-ASCII"));
			 port.close(); 
		 }
		 catch (IOException e4) {System.out.println("Problème entré sortie");return;}
	}
}
