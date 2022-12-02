import java.rmi.Remote; 
public interface Interface extends Remote { 
	public int[] findNumbers(String ip) throws RemoteException; 
}
