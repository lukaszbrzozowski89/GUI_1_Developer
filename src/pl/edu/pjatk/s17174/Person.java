/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;


import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Person {
    public static final int MAX_RENTS = 5;
    final String PESEL;
    final LocalDate birthLocalDate;
    String name;
    String surname;
    Address address;
    private int countOfLiabilities;
    private ArrayList<Room> listOfRooms = new ArrayList<>();
    private int uniqueId;

    public Person(int uniqueId, String name, String surname, String PESEL, Address address, LocalDate birthLocalDate) {
        this.name = name;
        this.surname = surname;
        this.PESEL = PESEL;
        this.address = address;
        this.birthLocalDate = birthLocalDate;
        this.uniqueId = uniqueId;
    }


    public int getCountOfLiabilities() {
        return countOfLiabilities;
    }

    public void setCountOfLiabilities(int countOfLiabilities) {
        this.countOfLiabilities = countOfLiabilities;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", address=" + address +
                ", birthLocalDate=" + birthLocalDate +
                '}';
    }

    public ArrayList<Room> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(ArrayList<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
    }
}
