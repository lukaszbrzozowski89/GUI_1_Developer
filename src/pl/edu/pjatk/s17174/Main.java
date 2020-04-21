/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import pl.edu.pjatk.s17174.exceptions.ItemDontExistsException;
import pl.edu.pjatk.s17174.pojazd.Car;
import pl.edu.pjatk.s17174.pojazd.Vehicle;
import pl.edu.pjatk.s17174.utils.Timer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception, ItemDontExistsException {
        startTimer();
        mainMenu();
    }

    public static void startTimer() {
        Timer time = new Timer();
        time.start();
    }


    public static void mainMenu() throws Exception, ItemDontExistsException {
        Developer developer = Developer.getInstance();
        LinkedList<Bloc> blocList = new LinkedList<>();
        Address address = new Address("WAW", "Krucza", "00111");
        Parking parking = new Parking(126.45, null);
        Parking parking2 = new Parking(151.15, null);
        Parking parking3 = new Parking(11.45, null);
        Parking parking4 = new Parking(12.15, null);
        Parking parking5 = new Parking(116.45, null);
        Parking parking6 = new Parking(75.15, null);
        LinkedList<Parking> parkingLinkedList = new LinkedList<>();
        parkingLinkedList.add(parking);
        parkingLinkedList.add(parking2);
        parkingLinkedList.add(parking3);
        parkingLinkedList.add(parking4);
        parkingLinkedList.add(parking5);
        parkingLinkedList.add(parking6);
        Tenant person = new Tenant(1, "Lukas", "Kowalski", "122345857", address, LocalDate.now().minusYears(20), true);
        Tenant person2 = new Tenant(2, "Krzysztof", "Kowalski", "2345857", address, LocalDate.now().minusYears(30), true);
        Tenant person3 = new Tenant(3, "Aneta", "Nowak", "122345857", address, LocalDate.now().minusYears(10), false);
        Tenant person4 = new Tenant(4, "Natalia", "Kowalska", "122345857", address, LocalDate.now().minusYears(16), true);
        Tenant person5 = new Tenant(5, "Anna", "Nowak", "122345857", address, LocalDate.now().minusYears(26), false);
        Tenant person6 = new Tenant(6, "Roman", "Nowak", "122345857", address, LocalDate.now().minusYears(50), false);
        ArrayList<Tenant> personList = new ArrayList<>();
        personList.add(person);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        personList.add(person6);
        Apartment apartment = new Apartment(44.3);
        Apartment apartment2 = new Apartment(48.3);
        Apartment apartment3 = new Apartment(64.3);
        Apartment apartment4 = new Apartment(145.3);
        Apartment apartment5 = new Apartment(24.3);
        Apartment apartment6 = new Apartment(39.3);
        LinkedList<Apartment> apartmentArrayList = new LinkedList<>();
        apartmentArrayList.add(apartment);
        apartmentArrayList.add(apartment2);
        apartmentArrayList.add(apartment3);
        apartmentArrayList.add(apartment4);
        apartmentArrayList.add(apartment5);
        apartmentArrayList.add(apartment6);
        person.rent(apartment, 50);
        person2.rent(apartment2, 50);
        Estate estate = new Estate(developer, blocList);
        Bloc bloc = new Bloc(apartmentArrayList, parkingLinkedList, estate);
        blocList.add(bloc);
        Tenant chosenTenant = personList.get(0);
        menuText();
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "a":
                    System.out.println("Wybierz osobę, podaj jej ID");
                    int inputA = scan.nextInt();
                    chosenTenant = personList.get(inputA - 1);
                    System.out.println("Wybrano osobe: " + chosenTenant);
                    break;
                case "b":
                    System.out.println("na ile dnie chcesz wynajac mieszkanie?");
                    int input1 = scan.nextInt();
                    System.out.println("Chcesz parking? odpowiedz true lub false");
                    boolean park = scan.nextBoolean();
                    chosenTenant.setWantToRentParking(park);
                    chosenTenant.rent(apartment, input1);
                    break;
                case "c":
                    System.out.println("Jaki to przedmiot?");
                    String name = scan.nextLine();
                    System.out.println("ile ma objetosci? Wpisz wartość z przecinkiem np 2,4");
                    double area = scan.nextDouble();
                    Item item = new Item(name, area);
                    chosenTenant.putItem(item, parking);
                    break;
                case "d":
                    Car car = new Car("Opel", 23.45, 1.5, Vehicle.VehicleType.CITY, Vehicle.EngineType.DIESEL);
                    chosenTenant.putItem(car, parking);
                    break;
                case "e":
                    System.out.println("Jaka jest nazwa przedmiotu który chcesz wyjac?");
                    String nameItem = scan.nextLine();
                    chosenTenant.takeOutItem(nameItem, parking);
                    break;
                case "z":
                    System.out.println(Timer.getActualDate());
                    break;
                case "f":
                    System.out.println("Odnowienie najmu. Ile dni?");
                    int renewDays = scan.nextInt();
                    chosenTenant.renewRent(apartment, LocalDate.now().plusDays(renewDays));
                    break;
                case "g":


                    break;
                case "?":
                    menuText();
                    break;
            }
        } while (!choice.equals("q"));
    }


    public static void menuText() {
        System.out.println("Witaj! \n Wciśnij przycisk odpowiadający danej akcji aby zobaczyć działanie programu");
        System.out.println("a: Wybierz osobę");
        System.out.println("b: Wynajmij mieszkanie");
        System.out.println("c: Włóż przedmiot do parkingu");
        System.out.println("d: Zaparkuj auto do parkingu");
        System.out.println("f: Odnów najem");
        System.out.println("d: Zaparkuj auto do parkingu");
        System.out.println("z: Wyświetl aktualną datę:");
        System.out.println("?: Powrót do menu");
        System.out.println("q: Aby zakończyć działanie programu");
    }


}
