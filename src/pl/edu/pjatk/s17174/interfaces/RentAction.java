/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.interfaces;


import pl.edu.pjatk.s17174.Apartment;
import pl.edu.pjatk.s17174.Parking;
import pl.edu.pjatk.s17174.Room;
import pl.edu.pjatk.s17174.Tenant;
import pl.edu.pjatk.s17174.exceptions.ProblematicTenantException;

import java.time.LocalDate;

public interface RentAction {

    void rent(Apartment apartment, int days) throws ProblematicTenantException;

    void rent(Parking parking, int days) throws ProblematicTenantException;

    void checkOut(Apartment apartment, Tenant person);

    void renewRent(Room room, LocalDate renewDate);

}
