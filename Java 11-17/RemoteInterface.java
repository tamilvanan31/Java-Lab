import java.rmi.Remote; 
import java.rmi.RemoteException;
public interface RemoteInterface extends Remote{
	int[] findNumbers(String input) throws Exception;
}