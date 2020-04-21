/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.interfaces;

import pl.edu.pjatk.s17174.Room;
import pl.edu.pjatk.s17174.Tenant;

public interface FileAction {

    void addFile(Room room, Tenant tenant);

    void removeFile(Room room, Tenant tenant);
}
