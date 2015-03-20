package loggers;
import java.io.*;
import java.security.Timestamp;
import java.time.Clock;
import java.util.Timer;

/**
 * This is The Logger
 */
public class AwesomeLogger implements Logger {
    protected AwesomeLogger() {}
    protected AwesomeLogger(String className) {
        this.source = className;
    }
    private static final Integer q = 0;
    private String source;
    private String fileName = "log.txt";


    public static  Logger getInstance(String className) {
        return new AwesomeLogger(className);
    }

    @Override
    public void log(String tag, String msg) {

    }

    @Override
    public void log(String msg) {
        //synchronized (q) {
            //File logFile = new File(fileName);
            PrintStream printStream = null;
            try {

                printStream = new PrintStream(

                        new BufferedOutputStream(

                                new FileOutputStream(fileName, true)));

                StringBuilder stringBuilder = new StringBuilder();

                stringBuilder.append(this.source);
                stringBuilder.append(" ");
                stringBuilder.append(msg);
                stringBuilder.append(" ");
                stringBuilder.append(System.currentTimeMillis());

                printStream.println(stringBuilder.toString());
            } catch (FileNotFoundException notFoundExc) {
                System.out.println("File not found");
            } finally {
                if(printStream != null) {
                    printStream.close();
                }
            }
        }
    //}
}
