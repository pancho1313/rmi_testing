package cl.aux2;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Point extends UnicastRemoteObject implements IPoint {

	protected Point() throws RemoteException {
		super();

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -2649015672562771302L;
	public String color;
	public int x;

	public String toString() {
		return "color. " + color + "x, " + x;
	}

	@Override
	public void setX(int x) throws RemoteException {
		this.x = x;

	}

	@Override
	public int getX() throws RemoteException {
		return x;

	}

}
