/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import java.util.LinkedList;

public class Estate {
    Developer developer;
    LinkedList<Bloc> blocList;

    public Estate(Developer developer, LinkedList<Bloc> blocList) {
        this.developer = developer;
        this.blocList = blocList;
    }

    @Override
    public String toString() {
        return "Estate{" +
                "developer=" + developer +
                ", blocList=" + blocList +
                '}';
    }
}
