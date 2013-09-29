package cl.aux2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;


public class Client {

	public static void main(String[] args) {

		try {
			IServer server = (IServer) Naming
					.lookup("rmi://localhost:1099/server");
			IPoint point = new Point();
			point.setX(10);
			System.out.println("x. " + point.getX());
			server.sendPoint(point);
			System.out.println("x. " + point.getX()); // 10?

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
