/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.utils;

import java.text.SimpleDateFormat;

public class Timer extends Thread {

    public void run() {
        long time = System.currentTimeMillis();
        while (true) {
            try {
                sleep(5000);
            } catch (InterruptedException exc) {
                exc.getStackTrace();
                return;
            }
            time += 86400000; // 1 day in millis after sleep 5 seconds
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            String date = format.format(time);
            System.out.println(date);

        }
    }


}