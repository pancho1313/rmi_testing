package cl.aux;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class MyDate extends UnicastRemoteObject implements IDate {

	//private static final long serialVersionUID = 3490769299828451338L;

	public MyDate() throws RemoteException {

	}

	@Override
	public String currentDate() throws RemoteException {
		return new Date().toString();
	}

}
