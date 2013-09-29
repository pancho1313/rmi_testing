package cl.aux;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;


public class Server {

	public static void main(String[] args) {
		try {
			IDate date = new MyDate();
			Naming.rebind("rmi://localhost:1099/dateServer", date);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
