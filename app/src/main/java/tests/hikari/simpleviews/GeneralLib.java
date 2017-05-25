package tests.hikari.simpleviews;

/**
 * Created by Genzo Hikari on 22/05/2017.
 */
public class GeneralLib {
    public static String getMethodName(final int depth)
    {
        final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
        return ste[1+depth].getMethodName();
    }
}
