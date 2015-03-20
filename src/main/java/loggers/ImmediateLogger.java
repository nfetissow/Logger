package loggers;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * This is The Logger
 */
public class ImmediateLogger implements Logger {
    protected ImmediateLogger() {}
    protected ImmediateLogger(String className) {
        this.source = className;
    }
    private String source;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    private String fileName = "log.txt";


    public static  Logger getInstance(String className) {
        return new ImmediateLogger(className);
    }

    @Override
    public void log(String tag, String msg) {

    }

    @Override
    public void log(String msg) {
        //synchronized (q) {
            try (PrintStream printStream =
                         new PrintStream(new BufferedOutputStream(new FileOutputStream(fileName, true)))) {
                printStream.println(this.source + " " + msg + " " +
                        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
            } catch (FileNotFoundException notFoundExc) {
                System.out.println("File not found");
            }
        }
    //}
}
