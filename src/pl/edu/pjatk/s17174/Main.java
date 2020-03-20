/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import pl.edu.pjatk.s17174.utils.Timer;

public class Main {

    public static void main(String[] args) {
        startTimer();

    }


    public static void startTimer() {
        Timer time = new Timer();
        time.start();
    }
}
