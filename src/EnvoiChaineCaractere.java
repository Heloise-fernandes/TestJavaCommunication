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
		 CommPortIdentifier portID = null;
		 try 
		 {
			 portID = CommPortIdentifier.getPortIdentifier(nomPort);
		 }
		 catch (NoSuchPortException e1) 
		 {
			 System.out.println("Pas de port");
			 return;
		 }
		 
		 SerialPort port = null;
		 try 
		 {
			 port = (SerialPort) portID.open("SerialSender", 2000);
		 }
		 catch (PortInUseException e2) {System.out.println("le port est déja utilisé");return;}
		 try
		 {
			 port.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
			 port.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
		 }
		 catch (UnsupportedCommOperationException e3) {System.out.println("Mauvaise configuration");return;}
		 try 
		 {
			 port.getOutputStream().write((chaineCarac + "\n").getBytes("US-ASCII"));
			 port.close(); 
		 }
		 catch (IOException e4) {System.out.println("Problème entré sortie");return;}
	}
}
