
public class ProgrammePrincipale {

	public static void main(String[] args) 
	{
		SerialPortConnexion port = new SerialPortConnexion("COM6");
		port.ouvrirPort();
		EPuck robot = new EPuck(port.obtenirConnexionEntree(), port.obtenirConnexionSortie());		
		try 
		{
			robot.aide();
			Thread.sleep(1000);
			robot.avancerToutDroit(300);
			Thread.sleep(10000);
			robot.stop();
			Thread.sleep(1000);
			robot.toupie(300);
			Thread.sleep(10000);
			robot.stop();
			System.out.println("Fin Programme");
		} 
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
}
