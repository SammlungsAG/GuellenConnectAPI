package sammlung.gconnect;

import org.jetbrains.annotations.NotNull;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface GuellenConnectable extends Remote {

    ArrayList<Player> getOnlinePlayers() throws RemoteException;
    boolean executeCommand(@NotNull String command) throws RemoteException;
    long getMemUsed() throws RemoteException;

}
