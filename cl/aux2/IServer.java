package cl.aux2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IServer extends Remote {

	public void sendPoint(IPoint p) throws RemoteException;

}
