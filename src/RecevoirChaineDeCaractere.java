import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import gnu.io.CommPortIdentifier;
import gnu.io.NoSuchPortException;
import gnu.io.PortInUseException;
import gnu.io.SerialPort;
import gnu.io.UnsupportedCommOperationException;

public class RecevoirChaineDeCaractere 
{
	public static void recevoir(String nomPort)
	{
		 // args[0] : nom symbolique du port
		 System.out.println("Ecouter");
		 CommPortIdentifier portID = null;
		 try 
		 {
			 portID = CommPortIdentifier.getPortIdentifier(nomPort);
		 }
		 catch (NoSuchPortException e1) {System.out.println("le port n'existe pas");return;}
		 SerialPort port = null;
		 try 
		 {
			 port = (SerialPort) portID.open("SerialReceiver", 2000);
		 }
		 catch (PortInUseException e2) {System.out.println("port utilisé");return;}
		 try
		 {
			 port.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1,
			 SerialPort.PARITY_NONE);
			 port.setFlowControlMode(SerialPort.FLOWCONTROL_NONE);
			 port.enableReceiveTimeout(30000);
		 }
		 catch (UnsupportedCommOperationException e3) {System.out.println("mauvaise config");return;}
		 try
		 {
			 BufferedReader br = new BufferedReader(new InputStreamReader(port.getInputStream(), "US-ASCII"));
			 System.out.println(br.readLine());
			 port.close();
		 }
		 catch (IOException e4) {e4.printStackTrace();port.close();return;}
	}
}
