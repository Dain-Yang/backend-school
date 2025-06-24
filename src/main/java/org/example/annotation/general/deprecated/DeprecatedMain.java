package org.example.annotation.general.deprecated;

import java.util.Date;

public class DeprecatedMain {
    public static void main(String[] args) {
        OldLibrary oldLibrary = new OldLibrary();
        oldLibrary.printMessage();

        NewLibrary newLibrary = new NewLibrary();
        newLibrary.printMessage();

    }
}
