/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.utils;


import pl.edu.pjatk.s17174.Tenant;

import java.io.File;

public class FileUtils {

    Tenant tenant;
    File file = new File("plik");


    public FileUtils(Tenant tenant, File file) {
        this.tenant = tenant;
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
