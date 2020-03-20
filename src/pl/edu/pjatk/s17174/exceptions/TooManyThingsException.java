/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.exceptions;

public class TooManyThingsException extends Exception {

    public TooManyThingsException() {
    }

    public TooManyThingsException(String message) {
        super(message);
    }

    public TooManyThingsException(String message, Throwable cause) {
        super(message, cause);
    }

    public TooManyThingsException(Throwable cause) {
        super(cause);
    }

}
