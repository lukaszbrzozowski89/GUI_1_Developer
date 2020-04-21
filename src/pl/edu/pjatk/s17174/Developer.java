/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import java.util.ArrayList;

public class Developer {

    private static Developer INSTANCE;
    ArrayList<Estate> estateList;

    private Developer() {
        estateList = new ArrayList<>();
    }

    public static Developer getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Developer();
        }
        return INSTANCE;
    }
}
