import loggers.AwesomeLogger;
import loggers.Logger;

/**
 * Created by nfetissow on 3/19/15.
 */
public class test implements Runnable {
    @Override
    public void run() {
        Logger log = AwesomeLogger.getInstance(this.getClass().getCanonicalName());
        for(int i = 0; i < 10; ++i) {
            log.log("testing" + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException interrupted) {
                log.log("Interrupted, " + interrupted.toString());
            }
        }
    }
}
