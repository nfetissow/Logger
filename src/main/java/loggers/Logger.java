package loggers;

/**
 * Created by nfetissow on 3/19/15.
 */
public interface Logger {
    public void log(String tag, String msg);
    public void log(String msg);
    //public static Logger getInstance(String className) { return null; }

}