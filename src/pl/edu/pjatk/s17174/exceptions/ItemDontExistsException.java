/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.exceptions;

public class ItemDontExistsException extends Throwable {
    public ItemDontExistsException(String s) {
    }

    public ItemDontExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemDontExistsException(Throwable cause) {
        super(cause);
    }

    public ItemDontExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public ItemDontExistsException() {
    }
}
