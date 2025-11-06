package org.nigel;

import org.nigel.models.Item;
import org.nigel.util.MenuLoad;

import java.util.ArrayList;

public class app {
    public static final ArrayList<Item> items = new ArrayList<>();
    public static boolean init = false;

    static void initialize() {
        if(!init) {
            MenuLoad.loadMenu();
        }
    }
    static void Start() {
        initialize();
    }
}
