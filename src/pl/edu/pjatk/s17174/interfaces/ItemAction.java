/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.interfaces;

import pl.edu.pjatk.s17174.Item;
import pl.edu.pjatk.s17174.Parking;
import pl.edu.pjatk.s17174.exceptions.ItemDontExistsException;
import pl.edu.pjatk.s17174.exceptions.TooManyThingsException;

public interface ItemAction {

    void putItem(Item item, Parking parking) throws TooManyThingsException;

    void takeOutItem(String item, Parking parking) throws ItemDontExistsException;
}
