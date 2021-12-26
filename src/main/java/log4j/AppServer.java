package log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppServer {

    public static final Logger log = LogManager.getLogger(AppServer.class);



    public void login(String userName) {
        log.error("{}, 用户登陆", userName);
    }




    public static void main(String[] args) {
        // 2.假设这是一个登陆的controller，登陆后打印日志。
        String userName = "userName";

        String looksup = "${java:version}";
        log.info("looksup {}", looksup);
    }
}
