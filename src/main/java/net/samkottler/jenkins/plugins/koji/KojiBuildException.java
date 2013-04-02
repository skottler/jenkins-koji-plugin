package net.samkottler.plugins.koji;

/**
 * @author: Sam Kottler <shk@linux.com>
 */

public class KojiBuildException extends Exception {
    public KojiBuildException(String s) {
        super(s);
    }

    public KojiBuildException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public KojiBuildException(Throwable throwable) {
        super(throwable);
    }
}
