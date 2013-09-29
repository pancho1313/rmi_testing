package cl.aux2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements IServer {

	private static final long serialVersionUID = -1993004842051840918L;

	public Server() throws RemoteException {

	}

	public static void main(String[] args) {
		try {
			System.setProperty("java.rmi.server.hostname", "192.168.2.7");
			IServer server = new Server();
			Naming.rebind("rmi://localhost:1099/server", server);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void sendPoint(IPoint point) throws RemoteException {

		System.out.println("antes. " + point.getX());
		// point.color = "blue";
		point.setX((int) (Math.random() * 1000));
		System.out.println("dp. " + point.getX());

	}

}
