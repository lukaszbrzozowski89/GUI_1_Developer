/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import java.util.Date;

public class Parking extends Room {

    private Date dateOfStart;

    private Date dateOfEnd;

    public Parking(double powierzchniaUzytkowa, int number) {
        super(powierzchniaUzytkowa, number);
    }

    public Date getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(Date dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public Date getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(Date dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }
}
