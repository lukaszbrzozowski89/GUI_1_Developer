/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import java.util.Date;

public class Person {
    String name;
    String surname;
    String PESEL;
    Address address;
    Date birthDate;

    public Person(String name, String surname, String PESEL, Address address, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.address = address;
        this.birthDate = birthDate;
    }
}
