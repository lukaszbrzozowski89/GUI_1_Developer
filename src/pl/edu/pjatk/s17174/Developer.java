/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

public class Developer {

    private static Developer INSTANCE;

    private Developer() {
    }

    public static Developer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Developer();
        }
        return INSTANCE;
    }
}
