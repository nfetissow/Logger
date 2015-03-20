/**
 * Created by nfetissow on 3/19/15.
 */
import loggers.*;
public class Main {
    public static void main(String[] args) {
        Logger log = AwesomeLogger.getInstance("main");
        log.log("testing logger1");
        test t1 = new test();
        Thread thread1 = new Thread(t1);
        thread1.run();
        log.log("created 1 thread");
        test t2 = new test();

        Thread thread2 = new Thread(t2);
        thread2.run();
        log.log("created 2nd thread");
        test t3 = new test();
        Thread thread = new Thread(t3);
        thread.run();

        log.log("created 3rd thread");
        log.log("testing logger 2");
    }
}
