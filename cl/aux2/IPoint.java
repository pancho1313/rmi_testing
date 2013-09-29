package cl.aux2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPoint extends Remote {

	public void setX(int x) throws RemoteException;
	public int getX() throws RemoteException;

}
